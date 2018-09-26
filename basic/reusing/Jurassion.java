package reusing;
//: reusing/Jurassion.java
// Making an entire class final.
// ����������final

class SmallBrain {}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f() {}
}

//! class Further extends Dinosaur {}
// Error: Can't extend final 'Dinosaur'
// ���󣬲�����չfinal���ε�'Dinosaur'��

public class Jurassion {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;
	}
}
