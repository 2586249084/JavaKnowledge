package arithmetic;
//: arithmetic/FibonacciSequence.java

/**
 * FibonacciSequence 斐波那契数列
 * @author Mrzhang
 */
public class FibonacciSequence {
	
	public static int fib(int num) {
		if (num == 1 || num == 2) {
			return 1;
		}else {
			return fib(num - 2) + fib(num - 1);
		}
	}
	
	public static void main(String[] args) {
		// 递推方式
		int a = 1, b = 1, c = 0;
		for(int i = 1; i <= 5; i++) {
			if (i == 1) {
				System.out.println(a);
			}else if (i == 2) {
				System.out.println(b);
			}else {
				c = a + b;
				a = b;
				b = c;
				System.out.println(c);
			}
		}
		// 通过数组
		int array[] = new int[5];
		array[0] = array[1] = 1;
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.println(array[0]);
			}else if(i == 1) {
				System.out.println(array[1]);
			}else {
				array[i] = array[i - 1] + array[i - 2];
				System.out.println(array[i]);
			}
		}
		// 建立递归函数
		for (int i = 1; i <= 10; i++) {
			System.out.print(fib(i) + ", ");
		}
	}
}
