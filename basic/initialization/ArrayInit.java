package initialization;
//: initialization/ArrayInit.java
// Array initialization 
// 数据初始化

import java.util.*;

public class ArrayInit {
	public static void main(String[] args) {
		Integer[] a = {
			new Integer(1),
			new Integer(2),
			3, // Auto Boxing自动装箱
		};
		Integer[] b = new Integer[] {
			new Integer(1),
			new Integer(2),
			3, // Auto Boxing自动装箱
		};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
