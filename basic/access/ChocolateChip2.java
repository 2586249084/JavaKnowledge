package access;
//: access/ChocolateChip2.java

import access.cookie.Cookie;

public class ChocolateChip2 extends Cookie{
	
	public ChocolateChip2() {
		System.out.println("ChocolateChip2 constructor");
	}
	
	public void chomp() {
		bite();// protected method 受保护的方法
	}
	
	public static void main(String[] args) {
		ChocolateChip2 x = new ChocolateChip2();
		x.chomp();
	}
}
