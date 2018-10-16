package exceptions.finallytodo;
//: exceptions/finallytodo/WithFinally.java
// Finally Guarantees cleanup.
// ���ձ�֤����

public class WithFinally {
	
	static Switch mSwitch = new Switch();
	
	public static void main(String[] args) {
		try {
			mSwitch.on();
			OnOffSwitch.f();
		} catch (OnOffExceptionOne exception) {
			System.out.println("OnOffExceptionOne");
		} catch (OnOffExceptionTwo exception) {
			System.out.println("OnOffExceptionTwo");
		} finally {
			mSwitch.off();
		}
	}
	
}/*Output:
on
off
*///:~
