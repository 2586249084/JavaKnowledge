package typeinfo;
//: typeinfo/SweeyShop.java
// Examination of the way the class loader works.
// 检查类装入器的工作方式.

import static util.Print.*;

class Candy {
	static {	println("Loading Candy"); }
}

class Gum {
	static {	println("Loading Gum"); }
}

class Cookie {
	static {	println("Loading Cookie"); }
}

public class SweetShop {

	public static void main(String[] args) {
		println("inside main");
		new Candy();
		println("After creating Candy");
		try {
			Class.forName("typeinfo.Gum");
		} catch (ClassNotFoundException e) {
			println("Couldn't find Gum");
		}
		println("After Class.forName(\"Gum\")");
		new Cookie();
		println("After creating Cookie");
	}

}/*Output:
inside main
Loading Candy
After creating Candy
Couldn't find Gum
After Class.forName("Gum")
Loading Cookie
After creating Cookie
*///:~
