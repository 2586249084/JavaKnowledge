package access;
//: access/Lunch.java
// Demonstrates class access specifiers.Make a class
// effectively private with private constructor
// 演示类访问修饰符.
// 用私有构造器有效地使类成为私有

class Soup1{
	
	private Soup1() {}
	
	// (1) Allow creation via static method:
	// 通过静态方法允许创建
	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

class Soup2{
	
	private Soup2() {}
	
	// (2) Create a static object and return a reference
	// 建立一个静态对象并返回一个引用
	private static Soup2 ps1 = new Soup2();
	
	public static Soup2 access() {
		return ps1;
	}
	
	public void f() {
		System.out.println("Soup2 f()");
	}
}

// Only one public class allowed per file:
// 每个文件只允许一个公共类
public class Lunch {
	
	void testPrivate() {
		// Can't do this! Private constructor
		// 不能这样做! 私有的构造器
		//! Soup1 soup = new Soup1();
	}
	
	void testStatic() {
		Soup1 soup = Soup1.makeSoup();
		System.out.println(soup.toString());
	}
	
	void testSingleton() {
		Soup2.access().f();
	}
}
