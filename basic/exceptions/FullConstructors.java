package exceptions;
//: exceptions/FullConstructors.java

class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	
	MyException() {}
	
	MyException(String msg) { super(msg); }
	
}

public class FullConstructors {
	
	public static void f() throws MyException {
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}
	
	public static void g() throws MyException {
		System.out.println("Throwing MyException from g()");
		throw new MyException("Originated");
	}
	
	public static void main(String[] args) {
		try {
			f();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
		
		try {
			g();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
	}
	
}/*Output:
Throwing MyException from f()
exceptions.MyException
	at exceptions.FullConstructors.f(FullConstructors.java:18)
	at exceptions.FullConstructors.main(FullConstructors.java:28)
Throwing MyException from g()
exceptions.MyException: Originated
	at exceptions.FullConstructors.g(FullConstructors.java:23)
	at exceptions.FullConstructors.main(FullConstructors.java:34)
*///:~
