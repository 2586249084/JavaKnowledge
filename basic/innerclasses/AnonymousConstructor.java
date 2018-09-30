package innerclasses;
//: innerclasses/AnonymousConstructor.java
// Creating a constructor for an anonymous inner class.
// 为匿名内部类创建构造器

import static util.Print.*;

abstract class Base {
	public Base(int i) {
		println("Base Instructor, i = " + i);
	}
	public abstract void f();
}

public class AnonymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {
			{ println("Inside instance initializer"); }
			
			public void f() {
				println("in anonymous f()");
			}
		};
	}
	
	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}
}/*Output:
Base Instructor, i = 47
Inside instance initializer
in anonymous f()
*///:~
