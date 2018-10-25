package generics;
//: generics/IterableFibonacci.java
// Adapt the Fibonacci class to make it Iterable.
// 调整Fibonacci类，使其可迭代.

import java.util.*;

public class IterableFibonacci
extends Fibonacci implements Iterable<Integer> {

	private int n;
	
	public IterableFibonacci(int n) { this.n = n; }

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				return n > 0;
			}

			@Override
			public Integer next() {
				n--;
				return IterableFibonacci.this.next();
			}
			
		};
	}
	
	public static void main(String[] args) {
		for (int i : new IterableFibonacci(18))
			System.out.print(i + " ");
	}

}/* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 
*///:~
