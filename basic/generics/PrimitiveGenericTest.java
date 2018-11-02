package generics;
//: generics/PrimitiveGenericTest.java

import util.*;

class FArray {
	
	public static <T> T[] fill(T[] t, Generator<T> generator) {
		for (int i = 0; i < t.length; i++) 
			t[i] = generator.next();
		return t;
	}
	
}

public class PrimitiveGenericTest {

	public static void main(String[] args) {
		String[] strings = FArray.fill(new String[7], new RandomGenerator.String(10));
		for (String s : strings)
			System.out.println(s);
		Integer[] integers = FArray.fill(new Integer[7], new RandomGenerator.Integer());
		for (int i : integers)
			System.out.println(i);
		
		// Autoboxing won't save you here. This won't compile:
		// 自动补全在这里救不了你.这不会编译:
		// int[] b = FArray.fill(new int[7], new RandomGenerator.Integer());
	}

}/* Output:
YNzbrnyGcF
OWZnTcQrGs
eGZMmJMRoE
suEcUOneOE
dLsmwHLGEa
hKcxrEqUCB
bkInaMesbt
7052
6665
2654
3909
5202
2209
5458
*///:~
