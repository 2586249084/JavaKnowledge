package holding;
//: holding/ApplesAndOrangesWithGenerics.java

import java.util.*;

public class ApplesAndOrangesWithGenerics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i = 0; i < 3; i++)
			apples.add(new Apple());
		
		// Compile-time error:
		// ����ʱ����
		//! apples.add(new Orange());
		
		for(int i = 0; i < apples.size(); i++)
			System.out.println(apples.get(i).id());
		
		// Using foreach:
		// ʹ��foreach�﷨:
		for(Apple apple : apples)
			System.out.println(apple.id());
	}
}/*Output:
0
1
2
0
1
2
*///:~
