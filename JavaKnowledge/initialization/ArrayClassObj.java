package initialization;
//: initialization/ArrayClassObj.java
// Create an array of nonprimitive objects.
// ����һ����ԭʼ��������

import static commentUtil.Print.*;
import java.util.*;

public class ArrayClassObj {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		println("length of a = " + a.length);
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(500); // Auto Boxing �Զ���װ
		}
		println(Arrays.toString(a));
	}
}
