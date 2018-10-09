package innerclasses;
//: innerclasses/InheritInner.java
// Inheriting an inner class.
// �̳�һ���ڲ���

class WithInner {
	class Inner {}
}

public class InheritInner extends WithInner.Inner {
	InheritInner(WithInner wi) {
		wi.super();
	}
	
	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
		System.out.println(ii);
	}
}
