package access;
//: access/Lunch.java
// Demonstrates class access specifiers.Make a class
// effectively private with private constructor
// ��ʾ��������η�.
// ��˽�й�������Ч��ʹ���Ϊ˽��

class Soup1{
	
	private Soup1() {}
	
	// (1) Allow creation via static method:
	// ͨ����̬����������
	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

class Soup2{
	
	private Soup2() {}
	
	// (2) Create a static object and return a reference
	// ����һ����̬���󲢷���һ������
	private static Soup2 ps1 = new Soup2();
	
	public static Soup2 access() {
		return ps1;
	}
	
	public void f() {
		System.out.println("Soup2 f()");
	}
}

// Only one public class allowed per file:
// ÿ���ļ�ֻ����һ��������
public class Lunch {
	
	void testPrivate() {
		// Can't do this! Private constructor
		// ����������! ˽�еĹ�����
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
