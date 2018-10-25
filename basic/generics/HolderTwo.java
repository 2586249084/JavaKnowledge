package generics;
//: generics/HolderTwo.java

public class HolderTwo {
	
	private Object a;

	public HolderTwo(Object a) { this.a = a; }

	public void set(Object a) { this.a = a; }
	
	public Object get() { return a; }

	public static void main(String[] args) {
		HolderTwo h2 = new HolderTwo(new Automobile());
		Automobile a = (Automobile)h2.get();
		System.out.println(a);
		h2.set("Not an Automobile");
		String s = (String)h2.get();
		System.out.println(s);
		h2.set(1); // Autoboxes to Integer
		Integer x = (Integer)h2.get();
		System.out.println(x);
	}

}/*Output:
generics.Automobile@15db9742
Not an Automobile
1
*///:~
