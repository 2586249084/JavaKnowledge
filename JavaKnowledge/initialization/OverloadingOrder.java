package initialization;
//: initialization/OverloadingOrder.java

import static commentUtil.Print.*;

/**
 * OverloadingOrder
 * ���ڲ�����˳������
 * @author Mrzhang
 */
public class OverloadingOrder {
	
	static void f(String s, int i) {
		println("String: " + s + ", int: " + i);
	}
	
	static void f(int i, String s) {
		println("int: " + i + ", String: " + s);
	}
	
	public static void main(String[] args) {
		f("String first", 11);
		f(99, "int first");
	}
}
