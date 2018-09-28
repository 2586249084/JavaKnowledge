package interfaces.nesting;
//: interfaces/nesting/NestingInterfaces.java

class A {
	interface B {
		void f();
	}
	
	public class BImp implements B {
		public void f() {}
	}
	
	@SuppressWarnings("unused")
	private class BImp2 implements B {
		public void f() {}
	}
	
	public interface C {
		void f();
	}
	
	class CImp implements C {
		public void f() {}
	}
	
	@SuppressWarnings("unused")
	private class CImp2 implements C {
		public void f() {}
	}
	
	private interface D {
		void f();
	}
	
	@SuppressWarnings("unused")
	private class DImp implements D {
		public void f() {}
	}
	
	public class DImp2 implements D {
		public void f() {}
	}
	
	public D getD() { return new DImp2(); }
	
	private D dRef;
	
	public void receiveD(D d) {
		dRef = d;
		dRef.f();
	}
}

interface E {
	interface G {
		void f();
	}
	
	// Redundant "public":冗余的"public"
	public interface H {
		void f();
	}
	
	void g();
	// Can't be private within an interface:不能再一个接口中进行私有化
	//! private interface I {}
}

public class NestingInterfaces {
	public class BImp implements A.B {
		public void f() {}
	}
	
	class CImp implements A.C {
		public void f() {}
	}
	
	// Can't implement a private interface except
	// within that interface's defining class:
	// 不能实现一个私有接口，除非在该接口的定义类中
	//! class DImp implements A.D {
	//!	public void f() {}
	//! }
	
	class EImp implements E {
		public void g() {}
	}
	
	class EGImp implements E.G {
		public void f() {}
	}
	
	class EImp2 implements E {
		public void g() {}
		class EG implements E.G{
			public void f() {}
		}
	}
	
	public static void main(String[] arg) {
		A a = new A();
		
		//! Can't access A.D:
		//! 不能初始化A.D
		//! A.D ad = a.getD();
		
		//! Doesn't return anything but A.D:
		//! 除了A.D，什么都不返回
		//! A.DImp2 di2 = a.getD();
		
		// Cannot access a member of the interface:
		// 无法访问接口的成员
		//! a.getD().f();
		
		// Only another A can do anything with getD():
		// 只有另外一个A可以用getD()做任何事
		A a2 = new A();
		a2.receiveD(a.getD());
	}
} ///:~
