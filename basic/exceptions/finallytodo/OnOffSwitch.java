package exceptions.finallytodo;
//: exceptions/finallytodo/OnOffSwitch.java
// Why use finally?
// 为什么使用finally?

public class OnOffSwitch {
	
	private static Switch mSwitch = new Switch();
	
	public static void f() throws OnOffExceptionOne, OnOffExceptionTwo {}

	public static void main(String[] args) {
		try {
			mSwitch.on();
			// Code that can throw exceptions...
			// 可以抛出异常的代码...
			f();
			mSwitch.off();
		} catch (OnOffExceptionOne exception) {
			System.out.println("OnOffExceptionOne");
			mSwitch.off();
		} catch (OnOffExceptionTwo exception) {
			System.out.println("OnOffExceptionTwo");
			mSwitch.off();
		}
	}

}/*Output:
on
off
*///:~
