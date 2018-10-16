package exceptions;
//: exceptions/FinallyWorks.java
// The finally clause is always executed.
// finally的子句总是被执行

@SuppressWarnings("serial")
class ThreeException extends Exception {}

public class FinallyWorks {
	
	static int count = 0;

	public static void main(String[] args) {
		while(true) {
			try {
				// Post-increment is zero first time:
				// 第一次算后增量是零:
				if (count++ == 0)
					throw new ThreeException();
				System.out.println("No exception");
			} catch(ThreeException error) {
				System.out.println("ThreeException");
			} finally {
				System.out.println("In finally clause");
				if (count == 2)
					break;
			}
		}
	}

}/*
ThreeException
In finally clause
No exception
In finally clause
*///:~
