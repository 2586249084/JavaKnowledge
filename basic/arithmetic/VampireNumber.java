package arithmetic;

import java.util.Arrays;

//:arithmetic/VampireNumber.java

/**
 * VampireNumber 吸血鬼数字
 * 一个四位数，可以拆分2个2位数数字的乘积，顺序不限
 * 比如:1395 = 15 * 93
 * @author Mrzhang
 */
public class VampireNumber {
	public static void main(String[] args) {
		for(int i = 11; i < 100; i ++) {
			for(int j = i; j < 100 ; j ++) {
				int k = i * j;
				String kStr = Integer.toString(k);
				String checkStr = Integer.toString(i) + Integer.toString(j);
				if (kStr.length() != 4) {
					continue;
				}
				char[] kChar = kStr.toCharArray();
				char[] checkChar = checkStr.toCharArray();
				Arrays.sort(kChar);
				Arrays.sort(checkChar);
				boolean isVampore = Arrays.equals(kChar, checkChar);
				if (isVampore) {
					System.out.println(i + " * " + j + " = " + k);
				}
			}
		}
	}
}
