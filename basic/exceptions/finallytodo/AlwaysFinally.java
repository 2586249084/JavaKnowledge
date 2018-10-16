package exceptions.finallytodo;
//: exceptions/finallytodo/AlwaysFinally.java
// Finally is always executed.
// Finally总是被执行

import static util.Print.*;

class FourException extends Exception {

	private static final long serialVersionUID = 1L;
	
}

public class AlwaysFinally {
	
	public static void main(String[] args) {
		println("Entering first try block");
		try {
			println("Entering second try block");
			try {
				throw new FourException();
			} finally {
				println("finally in 2nd try block");
			}
		} catch (FourException exception) {
			println("Caught FourException in 1st try block");
		} finally {
			println("finally in 1st try block");
		}
	}
	
}/*Output:
Entering first try block
Entering second try block
finally in 2nd try block
Caught FourException in 1st try block
finally in 1st try block
*///:~
