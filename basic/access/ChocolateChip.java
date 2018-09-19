package access;

//: access/ChocolateChip.java
// Can't use package-access member from another package.
// 不能使用access包访问另一个包成员

import access.dessert.Cookie;

public class ChocolateChip extends Cookie{
	
	public ChocolateChip() {
		System.out.println("ChocolateChip constructor");
	}
	
	public void chomp() {
		//! bite(); // Can't access bite. 不能访问bite方法
	}
	
	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		x.chomp();
	}
}/* output:
Cookie constructor
ChocolateChip constructor
*///:~
