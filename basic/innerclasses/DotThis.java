package innerclasses;
//: innerclasses/DotThis.java
// Qualifying access to the outer-class object.
// 对外部类对象的限定访问

public class DotThis {
	void f() { System.out.println("DotThis.f()"); }
	
	public class Inner {
		public DotThis outer() {
			return DotThis.this;
			// A plain "this" would be Inner's "this"
			// 一个普通的"this"将是内在的"this"
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
