package exceptions;
//: exceptions/RethrowNew.java
// Rethrow a different object from the one that was caught.
// 将一个不同的对象从被捕获的对象中重新抛出

class OneException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public OneException(String s) { super(s); }
	
}

class TwoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public TwoException(String s) { super(s); }
	
}

public class RethrowNew {
	
	public static void f() throws OneException {
		System.out.println("originating the exception in f()");
		throw new OneException("thrown from f()");
	}
	
	public static void main(String[] args) {
		try {
			try {
				f();
			} catch (OneException error) {
				System.out.println("Caught in inner try, error.printStackTrace()");
				error.printStackTrace(System.out);
				throw new TwoException("from inner try");
			}
		} catch (TwoException error) {
			System.out.println("Caught in other try, error.printStackTrace()");
			error.printStackTrace(System.out);
		}
	}
	
}
