package initialization;
//: initialization/ArrayNew.java
// Creating array with new.
// ��new�ķ�ʽ��������

import static util.Print.*;

import java.util.*;

public class ArrayNew {
	public static void main(String[] args) {
		int[] a;
		Random random = new Random(47);
		a = new int [random.nextInt(20)];
		println("length of a = " + a.length);
		println(Arrays.toString(a));
	}
}
