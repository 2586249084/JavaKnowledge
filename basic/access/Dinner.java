package access;
//: access/Dinner.java
// Uses the library. 使用库
import access.dessert.*;

public class Dinner {
	public static void main(String[] args) {
		Cookie x = new Cookie();
		// ! x.bite(); // Can't access 无法调用
		System.out.println(x);
	}
}
