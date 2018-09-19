package operator;
//: operator/ShortCircuit.java

import static util.Print.*;

/**
 *Demonstrates short-circuiting behavior
 * with logical operators.
 * 示范逻辑运算符中的短路行为
 * @author Mrzhang
 */
public class ShortCircuit {
	
	public static void main(String[] args) {
		boolean b = test1(0) && test2(2) && test3(2);
		print("expression is " + b);
	}
	
	static boolean test1(int val) {
		println("test1(" + val + ")");
		println("result : " + (val < 1));
		return val < 1;
	}
	
	static boolean test2(int val) {
		println("test2(" + val + ")");
		println("result : " + (val < 2));
		return val < 2;
	}
	
	static boolean test3(int val) {
		println("test3(" + val + ")");
		println("result : " + (val < 3));
		return val < 3;
	}
}
