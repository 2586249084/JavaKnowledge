package reusing;
//: reusing/Beetle.java
// The full process of initialization
// 整个初始化过程

import static util.Print.*;

class Insect {
	private int i = 9;
	protected int j;
	
	Insect() {
		println("i = " + i + ", j = " + j);
		j = 39;
	}
	
	@SuppressWarnings("unused")
	private static int x1 = printInit("static Insect.x1 initialized");
	
	static int printInit(String s) {
		println(s);
		return 47;
	}
}

public class Beetle extends Insect {
	
	private int k = printInit("Beetle.k initialzed");
	
	public Beetle() {
		println("k = " + k);
		println("j = " + j);
	}
	
	@SuppressWarnings("unused")
	private static int x2 = printInit("static Beetle.x2 initialzed");
	
	public static void main(String[] args) {
		println("Beetle constructor");
		@SuppressWarnings("unused")
		Beetle b = new Beetle();
	}
}/*Output:

*/
