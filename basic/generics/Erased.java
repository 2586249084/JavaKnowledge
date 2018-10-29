package generics;
//: generics/Erased.java

public class Erased<T> {
	
	@SuppressWarnings("unused")
	private final int SIZE = 100;
	
	public static void f(Object arg) {
		//! if (arg instanceof T) { } // Error
		//! T var = new T(); // Error
		//! T[] array = new T[SIZE]; // Error
		//! T[] array1 = (T)new Object[SIZE]; // Unchecked warning
	}

}
