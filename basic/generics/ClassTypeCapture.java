package generics;
//: generics/CLassTypeCapture.java

class Building { }

class House extends Building { }

public class ClassTypeCapture<T> {
	
	private Class<T> kind;
	
	public ClassTypeCapture(Class<T> kind) { 
		this.kind = kind;
	}
	
	public boolean f(Object arg) {
		return kind.isInstance(arg);
	}

	public static void main(String[] args) {
		ClassTypeCapture<Building> ctt1 = 
		  new ClassTypeCapture<Building>(Building.class);
		System.out.println(ctt1.f(new House()));
		System.out.println(ctt1.f(new Building()));
		ClassTypeCapture<House> ctt2 =
		  new ClassTypeCapture<House>(House.class);
		System.out.println(ctt2.f(new House()));
		System.out.println(ctt2.f(new Building()));
	}

}/* Output:
true
true
true
false
*///:~
