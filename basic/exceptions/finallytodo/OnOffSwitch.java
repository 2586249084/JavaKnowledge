package exceptions.finallytodo;
//: exceptions/finallytodo/OnOffSwitch.java
// Why use finally?
// Ϊʲôʹ��finally?

public class OnOffSwitch {
	
	private static Switch mSwitch = new Switch();
	
	public static void f() throws OnOffExceptionOne, OnOffExceptionTwo {}

	public static void main(String[] args) {
		try {
			mSwitch.on();
			// Code that can throw exceptions...
			// �����׳��쳣�Ĵ���...
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
