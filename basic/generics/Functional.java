//: generics/Functional.java

package generics;

import java.math.*;
import java.util.concurrent.atomic.*;
import java.util.*;
import static util.Print.*;

// Different types of function objects:
// ��ͬ���͵ĺ�������:
interface Combiner<T> {
	T combine(T x, T y);
}

interface UnaryFunction<R, T> {
	R function(T x);
}

interface Collector<T> extends UnaryFunction<T, T> {
	T result(); // Extract result of collecting parameter ��ȡ�ռ������Ľ��
}

interface UnaryPredicate<T> {
	boolean test(T x);
}

public class Functional {
	
	// Calls the Combiner object on each element to combine
	// it with a running result, which is finally returned:
	// ��ÿ��Ԫ���ϵ���Combiner���󣬽��������н�������һ����󷵻����н��:
	public static <T> T reduce(Iterable<T> seq, Combiner<T> combiner) {
		Iterator<T> iterator = seq.iterator();
		if (iterator.hasNext()) {
			T result = iterator.next();
			while(iterator.hasNext())
				result = combiner.combine(result, iterator.next());
			return result;
		}
		// If seq is the empty list:
		// ���seq��һ���ռ���:
		return null; // Or throw exception �����׳��쳣
	}
	
	// Take a function object and call it on each object in
	// the list, ignoring the return value. The function
	// object may act as a collecting parameter, so it is
	// returned at the end.
	// ȡһ�������������б��е�ÿ�������ϵ����������Է���ֵ��
	// �������������Ϊһ���ռ���������������ĩβ����
	public static <T> Collector<T> forEach(Iterable<T> seq, Collector<T> function) {
		for (T t : seq)
			function.function(t);
		return function;
	}
	
	// Creates a list of results by calling a
	// function object for each object in the list:
	// ͨ��Ϊ�б��е�ÿ��������ú�����������������б�:
	public static <R, T> List<R> transform(Iterable<T> seq, UnaryFunction<R, T> function) {
		List<R> result = new ArrayList<R>();
		for (T t : seq)
			result.add(function.function(t));
		return result;
	}
	
	// Applies a unary predicate to each item in a sequence,
	// and returns a list of items that produced "true":
	// �������е�ÿ����Ӧ��һԪν�ʣ������ز�����true�������б�:
	public static <T> List<T> filter(Iterable<T> seq, UnaryPredicate<T> pred) {
		List<T> result = new ArrayList<T>();
		for (T t : seq)
			if (pred.test(t))
				result.add(t);
		return result;
	}
	
	// To use the above generic methods, we need to create
	// function objects to adapt to our particular needs:
	// Ҫʹ������ͨ�÷�����������Ҫ����������������Ӧ���ǵ��ض�����:
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
		// Generics��varargs��boxingһ����
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
		// ʹ��BigInteger��prime-generation����:
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
		// ��������б�ĺ�Ҳ������:
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
