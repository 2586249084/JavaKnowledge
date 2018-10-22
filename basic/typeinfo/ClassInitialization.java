package typeinfo;
//: typeinfo/ClassInitialization.java

import java.util.*;
import static util.Print.*;

class Initable {
	
	static final int staticFinal = 47;
	
	static final int staticFinalTwo = 
			ClassInitialization.rand.nextInt(10000);
	
	static {
		println("Initializing Initable");
	}
	
}

class InitableTwo {
	
	static int staticNonFinal = 147;
	
	static {
		println("Initializing Initable Two");
	}
	
}

class InitableThree {

	static int staticNonFinal = 47;
	
	static {
		println("Initializing Initable Three");
	}
	
}

public class ClassInitialization {
	
	public static Random rand = new Random(47);

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("unused")
		Class<?> initable = Initable.class;
		println("After creating Initable ref");
		// Does not trigger initialization:
		// 不触发初始化:
		println(Initable.staticFinal);
		// Does not trigger initialization:
		// 不触发初始化:
		println(Initable.staticFinalTwo);
		// Does not trigger initialization:
		// 不触发初始化:
		println(InitableTwo.staticNonFinal);
		@SuppressWarnings("unused")
		Class<?> initableThree = Class.forName("typeinfo.InitableThree");
		println("After creating InitableThree ref");
		println(InitableThree.staticNonFinal);
	}

}/*Output:
After creating Initable ref
47
Initializing Initable
9258
Initializing Initable Two
147
Initializing Initable Three
After creating InitableThree ref
47
*///:~
