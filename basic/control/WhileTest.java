package control;
//: control.WhileTest.java
// Demonstrates the while loop.

/**
 * WhileTest 迭代语句(iteration statement)
 * @author Mrzhang
 * while、do-while、for
 * while语句格式:
 * while (Boolean-expression) {
 * 		statement
 * }
 * do-while语句格式:
 * do:
 * 		statement
 * while (Boolean-expression) {
 * 		statement
 * }
 */
public class WhileTest {
	
	static boolean condition() {
		boolean result = Math.random() < 0.99;
		System.out.print(result + ", ");
		return result;
	}
	
	public static void main(String[] args) {
		while(condition()) {
			System.out.println("Inside 'while'");
		}
		System.out.println("Exited 'while'");
	}
}
