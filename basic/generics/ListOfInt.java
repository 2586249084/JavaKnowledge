package generics;
//: generics/ListOfInt.java
// Autoboxing compensates for the inability to use
// primitives in generics.
// 自动装箱弥补了在泛型中不能使用基元的不足.

import java.util.*;

public class ListOfInt {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			list.add(i);
		}
		for (int i : list)
			System.out.print(i + " ");
	}
	
}/* Output:
0 1 2 3 4 
*///:~
