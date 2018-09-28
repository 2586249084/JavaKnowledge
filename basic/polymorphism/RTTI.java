package polymorphism;
//: polymorphism/RTTI.java
// Downcasting & Runtime type information.
// 向下转型和运行时类型信息

class Useful {
	public void f() {};
	public void g() {};
}

class MoreUseful extends Useful {
	public void f() {};
	public void g() {};
	public void u() {};
	public void v() {};
	public void w() {};
}

public class RTTI {
	public static void main(String[] args) {
		Useful[] x = {
			new Useful(),
			new MoreUseful()
		};
		x[0].f();
		x[1].f();
		// Compile time: method not found in Useful:
		// 编译时间:未在Useful中发现的方法
		//! x[1].w();
		((MoreUseful)x[1]).w();
		((MoreUseful)x[0]).u();
	}
}///:~
