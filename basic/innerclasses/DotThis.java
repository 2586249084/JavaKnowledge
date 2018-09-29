package innerclasses;
//: innerclasses/DotThis.java
// Qualifying access to the outer-class object.
// ���ⲿ�������޶�����

public class DotThis {
	void f() { System.out.println("DotThis.f()"); }
	
	public class Inner {
		public DotThis outer() {
			return DotThis.this;
			// A plain "this" would be Inner's "this"
			// һ����ͨ��"this"�������ڵ�"this"
		}
	}
	
	public Inner inner() { return new Inner(); }
	
	public static void main(String[] arg) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();
	}
}/*Output:
DotThis.f()
*///:~
