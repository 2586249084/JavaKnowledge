package holding;
//: holding/ApplesAndOrangesWithoutGenerics.java
// Simple container example (produces compiler warnings)
// �򵥵�����ʾ�������ɱ��������棩

import java.util.*;

class Apple {
	private static long counter;
	private final long id = counter++;
	public long id() { return id; }
}

class Orange {}

public class ApplesAndOrangesWithoutGenerics {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for(int i = 0; i < 3; i++)
			apples.add(new Apple());
		// Not prevented from adding an Orange to apples:
		// ������ֹ��ƻ�������һ������
		apples.add(new Orange());
		for(int i = 0; i < 3; i++)
			System.out.println(((Apple)apples.get(i)).id());
			// Orange is detected only at run time
			// Orange��������ʱ�ż�⵽
	}
}/*Output:
0
1
2
*///:~
