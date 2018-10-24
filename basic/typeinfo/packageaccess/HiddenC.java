package typeinfo.packageaccess;
//: typeinfo/packageaccess/HiddenC.java

import typeinfo.interfaces.*;
import static util.Print.*;

class C implements A {

	@Override
	public void f() { println("public C.f()"); }
	
	public void g() { println("public C.g()"); }
	
	void u() { println("package C.u()"); }
	
	protected void v() { println("protected C.v()"); }
	
	@SuppressWarnings("unused")
	private void w() { println("private C.w()"); }
	
}

public class HiddenC {
	
	public static A makeA() { return new C(); }
	
}
