package generics;
//: generics/GenericArrayTwo.java

public class GenericArrayTwo<T> {
	
	private Object[] array;
	
	public GenericArrayTwo(int size) {
		array = new Object[size];
	}
	
	public void put(int index, T item) {
		array[index] = item;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) { return (T)array[index]; }
	
	@SuppressWarnings("unchecked")
	public T[] rep() { return (T[])array; }

	public static void main(String[] args) {
		GenericArrayTwo<Integer> gai = 
		  new GenericArrayTwo<Integer>(10);
		for (int i = 0; i < 10; i++)
			gai.put(i, i);
		for (int i = 0; i < 10; i++)
			System.out.print(gai.get(i) + " ");
		System.out.println();
		try {
			Integer[] ia = gai.rep();
			System.out.println(ia.getClass().getSimpleName());
		} catch (Exception exception) {
			System.out.println(exception);
		}
		
	}

}/* Output:
0 1 2 3 4 5 6 7 8 9
java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.Integer;
*///:~
