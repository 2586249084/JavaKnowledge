package innerclasses;
//: innerclasses/DotNew.java
// Creating an inner class directly using the .new syntax.
// 使用.new语法直接创建内部类

public class DotNew {
	public class Inner {
		public void f() { System.out.println("Inner.f()"); }
	}
	public static void main(String[] args) {
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
		dni.f();
	}
}/*Output:
Inner.f()
*///:~
