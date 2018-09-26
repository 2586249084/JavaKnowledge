package reusing;
//: reusing/FinalOverridingIllusion.java
// It only looks like you can override 
// a private or private final method
// 它看起来就像你可以覆盖私有或者私有的final方法

import static util.Print.*;

class WithFinals {
	// Identical to "private" alone:
	// 与"private"一模一样
	@SuppressWarnings("unused")
	private final void f() {
		println("WithFinals.f()");
	}
	
	// Also automatically "final":
	// 也自动的"final"
	@SuppressWarnings("unused")
	private void g() {
		println("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals {
	@SuppressWarnings("unused")
	private final void f() {
		println("OverridingPrivate.f()");
	}
	
	@SuppressWarnings("unused")
	private void g() {
		println("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		println("OverridingPrivate2.f()");
	}
	
	public void g() {
		println("OverridingPrivate2.g()");
	}
}

public class FinalOverridingIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		
		// You can upcast:
		// 你可以向上转型
		OverridingPrivate op = op2;
		// But you can't call the method:
		// 但你不能调用方法
		//! op.f();
		//! op.g();
		
		// Same here:
		// 以下同样
		@SuppressWarnings("unused")
		WithFinals wf = op;
		//! wf.f();
		//! wf.g();
	}
}/* Output:
OverridingPrivate2.f()
OverridingPrivate2.g()
*/
