package innerclasses;
//: innerclasses/BigEgg.java
// An inner class cannot be overridden like a method.
// 内部类不能像方法那样被覆盖

import static util.Print.*;

class Egg {
	@SuppressWarnings("unused")
	private Yolk y;
	protected class Yolk {
		public Yolk() { println("Egg.Yolk()"); }
	}
	
	public Egg() {
		println("new Egg()");
		y = new Yolk();
	}
}

public class BigEgg extends Egg {
	public class Yolk {
		public Yolk() { println("BigEgg.Yolk()"); }
	}
	
	public static void main(String[] args) {
		new BigEgg();
	}
}/*Output:
new Egg()
Egg.Yolk()
*///:~
