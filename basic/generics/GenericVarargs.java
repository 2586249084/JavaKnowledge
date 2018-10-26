package generics;
//: generics/GenericVarargs.java

import java.util.*;

public class GenericVarargs {

	public static <T> List<T> makeList(
			@SuppressWarnings("unchecked") T... args){
		List<T> result = new ArrayList<T>();
		for (T item : args)
			result.add(item);
		return result;
	}
	
	public static void main(String[] args) {
		List<String> list = makeList("A");
		System.out.println(list);
		list = makeList("A", "B", "C");
		System.out.println(list);
		list = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
		System.out.println(list);
	}

}/* Output:
[A]
[A, B, C]
[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
*///:~
