package typeinfo;
//: typeinfo/InterfaceViolation.java
// Sneaking around an interface.
// �ڽӿ���Χ�������.

import typeinfo.interfaces.*;

class B implements A {

	@Override
	public void f() { }
	
	public void g() { }
	
}

public class InterfaceViolation {

	public static void main(String[] args) {
		A a = new B();
		a.f();
		//! a.g(); // Compile error ʵ�ִ���.
		System.out.println(a.getClass().getName());
		if (a instanceof B) {
			B b = (B)a;
			b.g();
		}
	}

}/*Output:
typeinfo.B
*///:~
