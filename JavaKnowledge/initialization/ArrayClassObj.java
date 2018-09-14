package initialization;
//: initialization/ArrayClassObj.java
// Create an array of nonprimitive objects.
// 创建一个非原始对象数组

import static commentUtil.Print.*;
import java.util.*;

public class ArrayClassObj {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		println("length of a = " + a.length);
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(500); // Auto Boxing 自动包装
		}
		println(Arrays.toString(a));
	}
}
