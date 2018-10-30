package generics;
//: generics/GenericArray.java

import java.util.*;

public class GenericArray<T> {
	
	private T[] array;
	
	@SuppressWarnings("unchecked")
	public GenericArray(int size) {
		array = (T[])new Object[size];
	}
	
	public void put(int index, T item) {
		array[index] = item;
	}
	
	public T get(int index) { return array[index]; }
	
	//: Method that exposes the underlying representation:
	// �����ײ��ʾ�ķ���:
	public T[] rep() { return array; }
	
	public static void main(String[] args) {
		GenericArray<Integer> gai = 
		  new GenericArray<Integer>(10);
		
		// This causes a ClassCastException:
		// ��ᵼ��ClassCastException�쳣:
		//! Integer[] ia = gai.rep();
		
		// This is OK:
		// ���Ǻõ�:
		Object[] oa = gai.rep();
		for (int i = 0; i < 10; i++)
			gai.put(i, i);
		System.out.println(Arrays.toString(oa));
	}
	
}/* Output:
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
*///:~
