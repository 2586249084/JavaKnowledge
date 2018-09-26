package polymorphism;
//: polymorphism/Sandwich.java
// Order of constructor calls.
// 构造函数调用的顺序

import static util.Print.*;

class Meal {
	Meal() {
		println("Meal()");
	}
}

class Bread {
	Bread() { println("Bread()"); }
}

class Cheese {
	Cheese() { println("Cheese()"); }
}

class Lettuce {
	Lettuce() { println("Lettuce()"); }
}

class Lunch extends Meal {
	Lunch() { println("Lunch()"); }
}

class PortableLunch extends Lunch {
	PortableLunch() { println("PortableLunch()"); }
}

public class Sandwich extends PortableLunch {
	@SuppressWarnings("unused")
	private Bread b = new Bread();
	@SuppressWarnings("unused")
	private Cheese c = new Cheese();
	@SuppressWarnings("unused")
	private Lettuce l = new Lettuce();
	
	public Sandwich() { println("Sandwich()"); }
	
	public static void main(String[] args) {
		new Sandwich();
	}
}/*
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Sandwich()
*/
