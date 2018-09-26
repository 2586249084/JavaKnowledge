package polymorphism;
//: polymorphism/StaticPolymorphism.java
// Static methods are not polymorphism.
// 静态方法不具备多态性

class StaticSuper {
	public static String staticGet() {
		return "Base staticGet()";
	}
	
	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticSub extends StaticSuper {
	public static String staticGet() {
		return "Derived staticGet()";
	}
	
	public String dynamicGet() {
		return "Derived dynamicGet()";
	} 
}

public class StaticPolymorphism {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		StaticSuper sup = new StaticSub();
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
	}
}/* Output:
Base staticGet()
Derived dynamicGet()
*/
