package interfaces;

interface I1 { void f(); }
interface I2 { int f(int i); }
interface I3 { int f(); }

class C { public int f() { return 1; } }

class C2 implements I1, I2 {
	public void f() {}
	public int f(int i) { return 1; } // Overloaded
}

class C3 extends C implements I2 {
	public int f(int i) { return 1; } // Overloaded
}

class C4 extends C implements I3 {
	// Identical, no problem:
	// 一样的，没有问题
	public int f() { return 1; }
}

// Methods differ only by return type:
// 方法仅根据返回类型不同
//! class C5 extends C implements I1 {}
//! interface I4 extends I1,I3 {} ///:~
