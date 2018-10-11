package holding;
//: holding/ArrayIsNotIterable.java

import java.util.*;

public class ArrayIsNotIterable {
	
	static <T> void test(Iterable<T> ib) {
		for(T t : ib)
			System.out.print(t + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		test(Arrays.asList(1, 2, 3));
		String[] strings = { "A", "B", "C"};
		
		// An array works in foreach, but it's not Iterable:
		// 数组在foreach中工作，但它不是可迭代的:
		//! test(strings);
		
		// You must explicitly convert it to an Iterable:
		// 你必须显式地将它转换为可迭代的:
		test(Arrays.asList(strings));
	}
	
}/*Output:
1 2 3
A B C
*///:~
