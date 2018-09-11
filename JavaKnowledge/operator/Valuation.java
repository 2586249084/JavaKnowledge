package operator;
//: operator/Valuation.java

import static commentUtil.Print.*;

/** Section Three:
 * Operation's Valuation ²Ù×÷·û¸³Öµ²Ù×÷
 * @author Mrzhang
 */

class Tank{
	int level;
}

class Letter{
	char c;
}

public class Valuation {
	public static void main(String[] args) {
		showObject();
		showFunction();
	}
	
	public static void showObject() {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		println("1:t1.level = " + t1.level + "\tt2.level = " + t2.level);
		t1.level = t2.level;
		println("2:t1.level = " + t1.level + "\tt2.level = " + t2.level);
		t1.level = 21;
		println("3:t1.level = " + t1.level + "\tt2.level = " + t2.level);
	}
	
	static void f (Letter y) {
		y.c = 'z';
	}
	
	static void showFunction() {
		Letter x = new Letter();
		x.c = 'a';
		println("1:x.c = " + x.c);
		f(x);
		println("2:x.c = " + x.c);
	}
}
