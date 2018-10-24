package typeinfo;
//: typeinfo/InterfaceViolation.java
// Sneaking around an interface.
// 在接口周围鬼鬼祟祟.

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
		//! a.g(); // Compile error 实现错误.
		System.out.println(a.getClass().getName());
		if (a instanceof B) {
			B b = (B)a;
			b.g();
		}
	}

}/*Output:
typeinfo.B
*///:~
