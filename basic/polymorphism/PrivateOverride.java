package polymorphism;
//: polymorphism/PrivateOverride.java
// Trying to override a private method.
//  ‘Õº∏≤∏«ÀΩ”–∑Ω∑®

import static util.Print.*;

public class PrivateOverride {
	private void f() {
		println("private f()");
	}
	
	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		po.f();
	}
}

class Derived extends PrivateOverride {
	public void f() {
		println("public f()");
	}
}
