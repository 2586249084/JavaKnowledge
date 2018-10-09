package innerclasses;
//:innerclasses/MultiImplementation.java
// With concrete or abstract classes, inner 
// classes are the only way to produce the effect 
// of "multiple" implementation inheritance
// 有了具体的或抽象的类，内部类是产生“多重”实现继承效果的唯一方法

class D {}

abstract class E{}

class Z extends D {
	E makeE() {
		return new E() {};
	}
}

public class MultiImplementation {
	static void tasksD(D d) {}
	static void tasksE(E e) {}
	
	public static void main(String[] args) {
		Z z = new Z();
		tasksD(z);
		tasksE(z.makeE());
	}
}
