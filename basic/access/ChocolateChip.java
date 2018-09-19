package access;

//: access/ChocolateChip.java
// Can't use package-access member from another package.
// ����ʹ��access��������һ������Ա

import access.dessert.Cookie;

public class ChocolateChip extends Cookie{
	
	public ChocolateChip() {
		System.out.println("ChocolateChip constructor");
	}
	
	public void chomp() {
		//! bite(); // Can't access bite. ���ܷ���bite����
	}
	
	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		x.chomp();
	}
}/* output:
Cookie constructor
ChocolateChip constructor
*///:~
