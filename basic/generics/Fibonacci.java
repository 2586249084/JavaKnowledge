package generics;
//: generics/Fibonacci.java
// Generate a Fibonacci sequence.
// 生成斐波那契序列.

import util.Generator;

public class Fibonacci implements Generator<Integer> {

	private int count = 0;

	private int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}

	public static void main(String[] args) {
		Fibonacci gen = new Fibonacci();
		for (int i = 0; i < 18; i++)
			System.out.print(gen.next() + " ");
	}

	@Override
	public Integer next() {
		return fib(count++);
	}

}/* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 
*///:
