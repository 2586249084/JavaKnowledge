package generics;
//: generics/HolderThree.java

public class HolderThree<T> {
	
	private T a;
	
	public HolderThree(T a) { this.a = a; }
	
	public T get() { return a; }
	
	public void set(T a) { this.a = a; }

	public static void main(String[] args) {
		HolderThree<Automobile> h3 = 
				new HolderThree<>(new Automobile());
		Automobile a = h3.get(); // No cast needed 不需要转型
		//! h3.set("Not an Autmobile"); // Error
		//! h3.set(1); // Error
		System.out.println(a.getClass().getSimpleName());
	}

}/*Output:
Automobile
*///:~
