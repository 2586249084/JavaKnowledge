package reusing;
//: reusing/Detergent.java
// Inheritance syntax & properties.
// 继承语法和属性

import static util.Print.*;

class Cleanser{
	private String s = "Cleanser";
	
	public void append(String a) {
		s += a;
	}
	
	public void dilute() {
		append(" dilute()");
	}
	
	public void apply() {
		append(" apply()");
	}
	
	public void scrub() {
		append(" scrub()");
	}
	
	public String toString() {
		return s;
	}
	
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		println(x);
	}
}

public class Detergent extends Cleanser{
	
	// Change a method:改变一个方法
	public void srcub() {
		append(" Detergent.srcub()");
		super.scrub(); // Call base-class version 调用基类版本
	}
	
	// Add methods to the interface:
	// 向接口添加方法
	public void foam() {
		append(" foam()");
	}
	
	// Test the new class:
	// 测试新类
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.srcub();
		x.foam();
		println(x);
		println("Testing base class:");
		Cleanser.main(args);
	}
}
