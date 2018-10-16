package exceptions;
//: exceptions/NeverCaught.java
// Ignoring RuntimeExceptions.
// 忽略运行时异常

public class NeverCaught {
	
	static void f() {
		throw new RuntimeException("From f()");
	}
	
	static void g() {
		f();
	}
	
	public static void main(String[] args) {
		g();
	}
	
}///:~
