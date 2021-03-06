package typeinfo;
//: typeinfo/FamilyVsExactType.java
// The difference between instance of and class.
// instance of 和 class两者之间的区别.

import static util.Print.*;

class Base { }

class Derived extends Base { }

public class FamilyVsExactType {

	static void test(Object x) {
		println("----------------------------------------");
		println("Testing x of type : " + x.getClass());
		println("x instanceof Base : " + (x instanceof Base));
		println("x instanceof Derived : " + (x instanceof Derived));
		println("Base.isInstance(x) : " + Base.class.isInstance(x));
		println("Derived.isInstance(x) : " + Derived.class.isInstance(x));
		println("x.getClass() == Base.class : " + (x.getClass() == Base.class));
		println("x.getClass() == Derived.class : " + (x.getClass() == Derived.class));
		println("x.getClass().equals(Base.class) : " + x.getClass().equals(Base.class));
		println("x.getClass().equals(Derived.class) : " + x.getClass().equals(Derived.class));
	}
	
	public static void main(String[] args) {
		test(new Base());
		test(new Derived());
	}

}/*Output:
Testing x of type : class typeinfo.Base
x instanceof Base : true
x instanceof Derived : false
Base.isInstance(x) : true
Derived.isInstance(x) : false
x.getClass() == Base.class : true
x.getClass() == Derived.class : false
x.getClass().equals(Base.class) : true
x.getClass().equals(Derived.class) : false
Testing x of type : class typeinfo.Derived
x instanceof Base : true
x instanceof Derived : true
Base.isInstance(x) : true
Derived.isInstance(x) : true
x.getClass() == Base.class : false
x.getClass() == Derived.class : true
x.getClass().equals(Base.class) : false
x.getClass().equals(Derived.class) : true
*///:~
