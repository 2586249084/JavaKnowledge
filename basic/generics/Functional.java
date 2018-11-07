//: generics/Functional.java

package generics;

import java.math.*;
import java.util.concurrent.atomic.*;
import java.util.*;
import static util.Print.*;

// Different types of function objects:
// 不同类型的函数对象:
interface Combiner<T> {
	T combine(T x, T y);
}

interface UnaryFunction<R, T> {
	R function(T x);
}

interface Collector<T> extends UnaryFunction<T, T> {
	T result(); // Extract result of collecting parameter 提取收集参数的结果
}

interface UnaryPredicate<T> {
	boolean test(T x);
}

public class Functional {
	
	// Calls the Combiner object on each element to combine
	// it with a running result, which is finally returned:
	// 在每个元素上调用Combiner对象，将其与运行结果组合在一起，最后返回运行结果:
	public static <T> T reduce(Iterable<T> seq, Combiner<T> combiner) {
		Iterator<T> iterator = seq.iterator();
		if (iterator.hasNext()) {
			T result = iterator.next();
			while(iterator.hasNext())
				result = combiner.combine(result, iterator.next());
			return result;
		}
		// If seq is the empty list:
		// 如果seq是一个空集合:
		return null; // Or throw exception 或者抛出异常
	}
	
	// Take a function object and call it on each object in
	// the list, ignoring the return value. The function
	// object may act as a collecting parameter, so it is
	// returned at the end.
	// 取一个函数对象并在列表中的每个对象上调用它，忽略返回值。
	// 函数对象可以作为一个收集参数，所以它在末尾返回
	public static <T> Collector<T> forEach(Iterable<T> seq, Collector<T> function) {
		for (T t : seq)
			function.function(t);
		return function;
	}
	
	// Creates a list of results by calling a
	// function object for each object in the list:
	// 通过为列表中的每个对象调用函数对象来创建结果列表:
	public static <R, T> List<R> transform(Iterable<T> seq, UnaryFunction<R, T> function) {
		List<R> result = new ArrayList<R>();
		for (T t : seq)
			result.add(function.function(t));
		return result;
	}
	
	// Applies a unary predicate to each item in a sequence,
	// and returns a list of items that produced "true":
	// 对序列中的每个项应用一元谓词，并返回产生“true”的项列表:
	public static <T> List<T> filter(Iterable<T> seq, UnaryPredicate<T> pred) {
		List<T> result = new ArrayList<T>();
		for (T t : seq)
			if (pred.test(t))
				result.add(t);
		return result;
	}
	
	// To use the above generic methods, we need to create
	// function objects to adapt to our particular needs:
	// 要使用上述通用方法，我们需要创建函数对象来适应我们的特定需求:
	static class IntegerAdder implements Combiner<Integer> {
		
		@Override
		public Integer combine(Integer x, Integer y) {
			return x + y;
		}
		
	}
	
	static class IntegerSubtracter implements Combiner<Integer> {

		@Override
		public Integer combine(Integer x, Integer y) {
			return x - y;
		}
		
	}
	
	static class BigDecimalAdder implements Combiner<BigDecimal> {

		@Override
		public BigDecimal combine(BigDecimal x, BigDecimal y) {
			return x.add(y);
		}
		
	}
	
	static class BigIntegerAdder implements Combiner<BigInteger> {

		@Override
		public BigInteger combine(BigInteger x, BigInteger y) {
			return x.add(y);
		}
		
	}
	
	static class AtomicLongAdder implements Combiner<AtomicLong> {

		@Override
		public AtomicLong combine(AtomicLong x, AtomicLong y) {
			return new AtomicLong(x.addAndGet(y.get()));
		}
		
	}
	
	static class BigDecimalUlp implements UnaryFunction<BigDecimal, BigDecimal> {

		@Override
		public BigDecimal function(BigDecimal x) {
			return x.ulp();
		}
		
	}
	
	static class GreaterThan<T extends Comparable<T>> implements UnaryPredicate<T> {

		private T bound;
		
		public GreaterThan(T bound) {
			this.bound = bound;
		}

		@Override
		public boolean test(T x) {
			return x.compareTo(bound) > 0;
		}
		
	}
	
	static class MultiplyingIntegerCollector implements Collector<Integer> {

		private Integer value = 1;
		
		@Override
		public Integer function(Integer x) {
			value *= x;
			return value;
		}

		@Override
		public Integer result() {
			return value;
		}
		
	}
	
	public static void main(String[] args) {
		// Generics, varargs & boxing working together:
		// Generics，varargs和boxing一起工作
		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		Integer result = reduce(li, new IntegerAdder());
		println(result);
		
		result = reduce(li, new IntegerSubtracter());
		println(result);
		
		println(filter(li, new GreaterThan<Integer>(4)));
		
		println(forEach(li ,new MultiplyingIntegerCollector()).result());
		
		println(forEach(filter(li, new GreaterThan<Integer>(4)), new MultiplyingIntegerCollector()).result());
		
		MathContext mc = new MathContext(7);
		List<BigDecimal> lbd = Arrays.asList(
		  new BigDecimal(1.1, mc), new BigDecimal(2.2, mc),
		  new BigDecimal(3.3, mc), new BigDecimal(4.4, mc));
		BigDecimal rbd = reduce(lbd, new BigDecimalAdder());
		println(rbd);
		
		println(filter(lbd, new GreaterThan<BigDecimal>(new BigDecimal(3))));
		
		// Use the prime-generation facility of BigInteger:
		// 使用BigInteger的prime-generation工具:
		List<BigInteger> lbi = new ArrayList<BigInteger>();
		BigInteger bi = BigInteger.valueOf(11);
		for (int i = 0; i < 11; i++) {
			lbi.add(bi);
			bi = bi.nextProbablePrime();
		}
		println(lbi);
		
		BigInteger rbi = reduce(lbi, new BigIntegerAdder());
		println(rbi);
		
		// The sum of this list of primes is also prime:
		// 这个素数列表的和也是素数:
		println(rbi.isProbablePrime(5));
		
		List<AtomicLong> lal = Arrays.asList(
		  new AtomicLong(11), new AtomicLong(47), 
		  new AtomicLong(74), new AtomicLong(133));
		AtomicLong ral = reduce(lal, new AtomicLongAdder());
		println(ral);
		
		println(transform(lbd, new BigDecimalUlp()));
	}
	
} /* Output:
28
-26
[5, 6, 7]
5040
210
11.000000
[3.300000, 4.400000]
[11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47]
311
true
265
[0.000001, 0.000001, 0.000001, 0.000001]
*///:~
