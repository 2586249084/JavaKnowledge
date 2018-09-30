package innerclasses;
//: innerclasses/MultiInterfaces.java
// Two ways that a class can implement multiple interfaces.
// 类可以实现多个接口的两种方式

interface A {}
interface B {}

class X implements A, B {}

class Y implements A {
	B makeB() {
		// Anonymous inner class:
		// 匿名内部类
		return new B() {};
	}
}

public class MultiInterfaces {
	static void taskA(A a) {}
	static void taskB(B b) {}
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		taskA(x);
		taskA(y);
		taskB(x);
		taskB(y.makeB());
	}
} ///:~
