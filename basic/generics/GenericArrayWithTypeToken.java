package generics;
//: generics/GenericArrayWithTypeToken.java

import java.lang.reflect.*;

public class GenericArrayWithTypeToken<T> {

	private T[] array;
	
	@SuppressWarnings("unchecked")
	public GenericArrayWithTypeToken(Class<T> type, int size) {
		array = (T[])Array.newInstance(type, size);
	}

	public void put(int index, T item) {
		array[index] = item;
	}
	
	public T get(int index) { return array[index]; }
	
	// Expose the underlying representation:
	// 公开底层表示:
	public T[] rep() { return array; }

	public static void main(String[] args) {
		GenericArrayWithTypeToken<Integer> gai = 
		  new GenericArrayWithTypeToken<Integer>(Integer.class, 10);
		
		// This now works:
		// 现在工作:
		Integer[] ia = gai.rep();
		System.out.println(ia.getClass().getSimpleName());
	}

}/* Output:
Integer[]
*///:~
