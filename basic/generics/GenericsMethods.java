package generics;
//: generics/GenericsMethods.java

public class GenericsMethods {
	
	public <T> void f (T x) {
		System.out.println(x.getClass().getName());
	}

	public static void main(String[] args) {
		GenericsMethods gm = new GenericsMethods();
		gm.f(" ");
		gm.f(1);
		gm.f(1.0);
		gm.f(1.0F);
		gm.f('c');
		gm.f(gm);
	}

}/* Output:
java.lang.String
java.lang.Integer
java.lang.Double
java.lang.Float
java.lang.Character
generics.GenericsMethods
*///:~
