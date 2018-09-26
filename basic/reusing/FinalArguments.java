package reusing;
//: reusing/FinalArguments.java
// Using "final" with method arguments.
// ʹ�÷���������"final"

import static util.Print.*;

class Gizmo {
	public void spin() {
		println("Gizmo spin()");
	}
}

public class FinalArguments {
	
	void with(final Gizmo g) {
		//! g = new Gizmo(); // Illegal -- g is final �Ƿ��� -- g��final����
	}
	
	void without(Gizmo g) {
		g = new Gizmo(); // OK -- g not final ����� -- g ����final����
		g.spin();
	}
	
	void f(final int i) {
		//! i++; // Can't change �����޸�
	}
	
	// You can only read from a final primitive:
	// ��ֻ�ܴ�һ��ԭʼ��final�ж�ȡ
	int g(final int i) {
		return i + 1;
	}
	
	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.without(null);
		bf.with(null);
	}
}
