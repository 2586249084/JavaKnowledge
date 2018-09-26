package polymorphism;
//: polymorphism/FiledAccess.java
// Direct filed access is determined at compile time.
// ֱ���ύ�ķ������ڱ���ʱȷ����

import static util.Print.*;

class Super {
	public int field = 0;
	
	public int getField() {
		return field;
	}
}

class Sub extends Super {
	public int field = 1;
	
	public int getField() {
		return field;
	}
	
	public int getSuperField() {
		return super.field;
	}
}

public class FiledAccess {
	public static void main(String[] args) {
		Super sup = new Sub();
		println("sup.field = " + sup.field + ", sup.getField() = " + sup.getField());
		Sub sub = new Sub();
		println("sub.field = " + sub.field + ", sub.getField() = " + sub.getField() + ", sub.getSuperField() = " + sub.getSuperField());
	}
}/* Output:
sup.field = 0, sup.getField() = 1
sub.field = 1, sub.getField() = 1, sub.getSuperField() = 0
*/
