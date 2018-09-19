package control;
//: control.WhileTest.java
// Demonstrates the while loop.

/**
 * WhileTest �������(iteration statement)
 * @author Mrzhang
 * while��do-while��for
 * while����ʽ:
 * while (Boolean-expression) {
 * 		statement
 * }
 * do-while����ʽ:
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
