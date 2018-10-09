package holding;
//: holding/ApplesAndOrangesWithoutGenerics.java
// Simple container example (produces compiler warnings)
// 简单的容器示例（生成编译器警告）

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
		// 不被阻止在苹果中添加一个橙子
		apples.add(new Orange());
		for(int i = 0; i < 3; i++)
			System.out.println(((Apple)apples.get(i)).id());
			// Orange is detected only at run time
			// Orange仅在运行时才检测到
	}
}/*Output:
0
1
2
*///:~
