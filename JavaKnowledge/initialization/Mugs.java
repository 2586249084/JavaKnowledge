package initialization;
//: initialization/Mugs.java
// Java "Instance Initialization"
// ÊµÀý³õÊ¼»¯

import static commentUtil.Print.*;

class Mug {
	Mug(int market){
		println("Mug(" + market + ")");
	}
	
	void f(int market) {
		println("f(" + market + ")");
	}
}

public class Mugs {
	
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		println("mug1 & mug2 initialized");
	}
	
	Mugs() {
		println("Mugs()");
	}
	
	Mugs(int i) {
		println("Mugs(int)");
	}
	
	public static void main(String[] args) {
		println("Inside Main()");
		new Mugs();
		println("new Mugs() completed");
		new Mugs(1);
		println("new Mugs(1) completed");
	}/* output
	Inside Main()
	Mug(1)
	Mug(2)
	mug1 & mug2 initialized
	Mugs()
	new Mugs() completed
	Mug(1)
	Mug(2)
	mug1 & mug2 initialized
	Mugs(int)
	new Mugs(1) completed
	*///:~
}
