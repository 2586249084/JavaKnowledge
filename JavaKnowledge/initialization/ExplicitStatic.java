package initialization;
//: initialization/ExplicitStatic.java

import static commentUtil.Print.*;

/**
 * ExplicitStatic
 * Explicit static initialization with the "static" clause
 * 带有“静态”条款的显式静态初始化
 * @author Mrzhang
 */
public class ExplicitStatic {
	public static void main(String[] args) {
		println("Inside main");
//		Cups.cup1.f(99);// (1)
	}
	static Cups cups1 = new Cups(); // (2)
	static Cups cups2 = new Cups(); // (2)
}

class Cup{
	
	Cup(int market){
		println("Cup(" + market + ")");
	}
	
	void f(int market) {
		println("f(" + market +")");
	}
}

class Cups{
	static Cup cup1;
	static Cup cup2;
	
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	
	Cups(){
		println("Cups()");
	}
}
