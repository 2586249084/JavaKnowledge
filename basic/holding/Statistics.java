package holding;
//: holding/Statistics.java
// Simple demonstration of HashMap.
// 简单演示HashMap

import java.util.*;

public class Statistics {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Map<Integer, Integer> map = 
				new HashMap<Integer, Integer>();
		for(int i = 0; i < 10000; i++) {
			// Produce a number between 0 and 20:
			// 在0到20之间生成一个数字:
			int r = rand.nextInt(20);
			Integer freq = map.get(r);
			map.put(r, freq == null ? 1 : freq + 1);
		}
		System.out.println(map);
	}
}/*Output:
{0=481, 1=502, 2=489, 3=508, 4=481, 5=503, 6=519, 7=471, 
8=468, 9=549, 10=513, 11=531, 12=521, 13=506, 14=477, 
15=497, 16=533, 17=509, 18=478, 19=464}
为什么用随机数保存的key值到HashMap中，会发生排序的情况？
*///:~
