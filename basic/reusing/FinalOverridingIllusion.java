package reusing;
//: reusing/FinalOverridingIllusion.java
// It only looks like you can override 
// a private or private final method
// ����������������Ը���˽�л���˽�е�final����

import static util.Print.*;

class WithFinals {
	// Identical to "private" alone:
	// ��"private"һģһ��
	@SuppressWarnings("unused")
	private final void f() {
		println("WithFinals.f()");
	}
	
	// Also automatically "final":
	// Ҳ�Զ���"final"
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
		// ���������ת��
		OverridingPrivate op = op2;
		// But you can't call the method:
		// ���㲻�ܵ��÷���
		//! op.f();
		//! op.g();
		
		// Same here:
		// ����ͬ��
		@SuppressWarnings("unused")
		WithFinals wf = op;
		//! wf.f();
		//! wf.g();
	}
}/* Output:
OverridingPrivate2.f()
OverridingPrivate2.g()
*/
