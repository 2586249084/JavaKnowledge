package exceptions;
//: exceptions/ExtraFeatures.java
// Further embellishment of exception classes.
// 进一步修饰异常类

import static util.Print.*;

class MyException2 extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private int x;
	
	public MyException2() {}
	
	public MyException2(String msg) { super(msg); }
	
	public MyException2(String msg, int x) {
		super(msg);
		this.x = x;
	}
	
	public int val() { return x; }
	
	public String getMessage() { 
		return "Detail Message : " + x + " " + super.getMessage();
	}
	
}

public class ExtraFeatures {
	
	public static void f() throws MyException2 {
		println("Throwing MyException2 from f()");
		throw new MyException2();
	}
	
	public static void g() throws MyException2 {
		println("Throwing MyException2 from g()");
		throw new MyException2("Originated in g()");
	}

	public static void h() throws MyException2 {
		println("Throwing MyException2 from h()");
		throw new MyException2("Originated in h()", 47);
	}
	
	public static void main(String[] args) {
		try {
			f();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
		}
		try {
			g();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
		}
		try {
			h();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
			println("e.val() = " + e.val());
		}
	}
	
}/*Output:
Throwing MyException2 from f()
exceptions.MyException2: Detail Message : 0 null
	at exceptions.ExtraFeatures.f(ExtraFeatures.java:35)
	at exceptions.ExtraFeatures.main(ExtraFeatures.java:50)
Throwing MyException2 from g()
exceptions.MyException2: Detail Message : 0 Originated in g()
	at exceptions.ExtraFeatures.g(ExtraFeatures.java:40)
	at exceptions.ExtraFeatures.main(ExtraFeatures.java:55)
Throwing MyException2 from h()
exceptions.MyException2: Detail Message : 47 Originated in h()
	at exceptions.ExtraFeatures.h(ExtraFeatures.java:45)
	at exceptions.ExtraFeatures.main(ExtraFeatures.java:60)
e.val() = 47
*///:~
