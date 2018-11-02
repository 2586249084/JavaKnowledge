package generics;
//: generics/ListOfInt.java
// Autoboxing compensates for the inability to use
// primitives in generics.
// �Զ�װ���ֲ����ڷ����в���ʹ�û�Ԫ�Ĳ���.

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
