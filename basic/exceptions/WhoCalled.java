package exceptions;
//: exceptions/WhoCalled.java
// Programmatic access to stack trace information.
// 对堆栈跟踪信息的编程式访问

public class WhoCalled {
	
	static void f() {
		// Generate an exception to fill in the stack trace
		// 生成一个例外来填充堆栈跟踪
		try {
			throw new Exception();
		} catch (Exception e) {
			for (StackTraceElement ste : e.getStackTrace())
				System.out.println(ste.getMethodName());
		}
	}
	
	static void g() { f(); }
	
	static void h() { g(); }
	
	public static void main(String[] args) {
		f();
		System.out.println("--------------------------------");
		g();
		System.out.println("--------------------------------");
		h();
	}
	
}/*Output:
f
main
--------------------------------
f
g
main
--------------------------------
f
g
h
main
*///:~
