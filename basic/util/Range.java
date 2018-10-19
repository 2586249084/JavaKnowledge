package util;
//: util/Range.java
// Tool classes for generates a custom array.
// 生成自定义数组的工具类.

public class Range {
	
	private static int array[];
	private static int length = 0;
	
	public static int[] range(int start, int end) {
		length = end - start;
		array = new int[length];
		for(int i = 0; i < length; i++) {
			array[i] = start++;
		}
		return array;
	}
	
	public static int[] range(int length) {
		array = new int[length];
		for(int i = 0; i < length; i++) {
			array[i] = i;
		}
		return array;
	}
	
	public static int[] range(int start, int end, int step) {
		if ((end - start) % step == 0) {
			length = (end - start) / step;
		} else {
			length = (end - start) / step + 1;
		}
		array = new int[length];
		for(int i = 0; i < length; i++) {
			if ( i == 0) {
				array[i] = start;
			} else {
				array[i] = start += step;
			}
		}
		return array;
	}
}
