package typeinfo.toys;
//: typeinfo/toys/ToyTest.java
// Testing class Class.

import static util.Print.*;

interface HasBatteries { }

interface Waterproof { }

interface Shoots { }

class Toy {
	// Comment out the following default constructor
	// to see NoSuchMethodError from (*1*)
	// 注释掉下面的默认构造函数，以查看(*1*)的NoSuchMethodError
	
	Toy() { }
	
	Toy(int i) { }
	
}

class FancyToy extends Toy 
implements HasBatteries, Waterproof, Shoots {
	
	FancyToy() { super(1); }
	
}

public class ToyTest {

	static void printInfo(Class<?> cc) {
		println("Class name : " + cc.getName() + 
				" is interface? [" + cc.isInterface() + "]");
		println("Simple name : " + cc.getSimpleName());
		println("Canonical name : " + cc.getCanonicalName());
	}
	
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("typeinfo.toys.FancyToy");
		} catch (ClassNotFoundException e) {
			println("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for (Class<?> face : c.getInterfaces())
			printInfo(face);
		Class<?> up = c.getSuperclass();
		Object object = null;
		try {
			object = up.newInstance();
		} catch (InstantiationException e) {
			println("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			println("Cannot access");
			System.exit(1);
		}
		printInfo(object.getClass());
	}

}/*Output:
Class name : typeinfo.toys.FancyToy is interface? [false]
Simple name : FancyToy
Canonical name : typeinfo.toys.FancyToy
Class name : typeinfo.toys.HasBatteries is interface? [true]
Simple name : HasBatteries
Canonical name : typeinfo.toys.HasBatteries
Class name : typeinfo.toys.Waterproof is interface? [true]
Simple name : Waterproof
Canonical name : typeinfo.toys.Waterproof
Class name : typeinfo.toys.Shoots is interface? [true]
Simple name : Shoots
Canonical name : typeinfo.toys.Shoots
Class name : typeinfo.toys.Toy is interface? [false]
Simple name : Toy
Canonical name : typeinfo.toys.Toy
*///:~
