package typeinfo;
//: typeinfo/InnerImplementation.java
// Private inner classes can't hide from reflection.
// ˽���ڲ����޷����ط���.

import typeinfo.interfaces.*;
import static util.Print.*;

class InnerA {
	
	@SuppressWarnings("unused")
	private static class C implements A {

		@Override
		public void f() { println("public C.f()"); }
		
		
		public void g() { println("public C.g()"); }
		
		void u() { println("package C.u()"); }
		
		protected void v() { println("protected C.v()"); }
		
		private void w() { println("private C.w()"); }
		
	}
	
	public static A makeA() { return new C(); }
	
}

public class InnerImplementation {

	public static void main(String[] args) throws Exception {
		A a = InnerA.makeA();
		a.f();
		println(a.getClass().getName());
		
		// Reflection still gets into the private class:
		// ������Ȼ����˽����:
		HiddenImplementation.callHiddenMethod(a, "g");
		HiddenImplementation.callHiddenMethod(a, "u");
		HiddenImplementation.callHiddenMethod(a, "v");
		HiddenImplementation.callHiddenMethod(a, "w");
	}

}/*Output:
public C.f()
typeinfo.InnerA$C
public C.g()
package C.u()
protected C.v()
private C.w()
*///:~
