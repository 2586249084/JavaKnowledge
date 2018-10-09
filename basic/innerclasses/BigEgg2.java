package innerclasses;
//: innerclasses/BigEgg2.java
// Proper inheritance of an inner class.
// 对内部类的适当继承

import static util.Print.*;

class Egg2 {
	protected class Yolk {
		public Yolk() { println("Egg2.Yolk()"); }
		public void f() { println("Egg2.Yolk.f()"); }
	}
	
	private Yolk y = new Yolk();
	public Egg2() { println("new Egg2()"); }
	public void insertYolk(Yolk yy) { y = yy; }
	public void g() { y.f(); }
}

public class BigEgg2 extends Egg2 {
	
	public class Yolk extends Egg2.Yolk {
		public Yolk() { println("BigEgg.Yolk()"); }
		public void f() { println("BigEgg.Yolk.f()"); }
	}
	
	public BigEgg2() { insertYolk(new Yolk()); }
	
	public static void main(String[] args) {
		Egg2 e2 = new Egg2();
		e2.g();
	}
}/*Output:
Egg2.Yolk()
new Egg2()
Egg2.Yolk.f()
*///:~
