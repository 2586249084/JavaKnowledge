package reusing;
//: reusing/FinalArguments.java
// Using "final" with method arguments.
// 使用方法参数的"final"

import static util.Print.*;

class Gizmo {
	public void spin() {
		println("Gizmo spin()");
	}
}

public class FinalArguments {
	
	void with(final Gizmo g) {
		//! g = new Gizmo(); // Illegal -- g is final 非法的 -- g是final常量
	}
	
	void without(Gizmo g) {
		g = new Gizmo(); // OK -- g not final 合理的 -- g 不是final常量
		g.spin();
	}
	
	void f(final int i) {
		//! i++; // Can't change 不能修改
	}
	
	// You can only read from a final primitive:
	// 你只能从一个原始的final中读取
	int g(final int i) {
		return i + 1;
	}
	
	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.without(null);
		bf.with(null);
	}
}
