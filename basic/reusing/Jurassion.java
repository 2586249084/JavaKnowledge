package reusing;
//: reusing/Jurassion.java
// Making an entire class final.
// 完成整个类的final

class SmallBrain {}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f() {}
}

//! class Further extends Dinosaur {}
// Error: Can't extend final 'Dinosaur'
// 错误，不能扩展final修饰的'Dinosaur'类

public class Jurassion {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;
	}
}
