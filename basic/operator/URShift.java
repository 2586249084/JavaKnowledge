package operator;
//: operator/URShift.java

import static util.Print.*;

/**
 * URShift 右移位操作符
 * @author Mrzhang
 * <<(左移位操作符):按照操作符右侧指定的位数，将操作符左边的操作数向左移动(在低位补0)
 * 
 * >>("有符号"右移位操作符):按照操作符右侧指定的位数，将操作符左边的操作数向右移动
 * "有符号"右移位操作符使用"符号扩展":若符号为正，则在高位插入0;若符号为负，则在高位插入1
 * 
 * >>>("无符号"右移位操作符):按照操作符右侧指定的位数，将操作符左边的操作数向右移动
 * "无符号"右移位操作符使用"零扩展":无论正负，都在高位插入0
 * 
 * "移位"可与"等号"组合使用(<<=, >>=, >>>=)
 */
public class URShift {
	public static void main(String[] args) {
		int i = -1;
		println(Integer.toBinaryString(i));
		i >>>= 10;
		println(Integer.toBinaryString(i));
		long l = -1;
		println(Long.toBinaryString(l));
		l >>>= 10;
		println(Long.toBinaryString(l));
		short s = -1;
		println(Integer.toBinaryString(s));
		s >>>= 10;
		println(Integer.toBinaryString(s));
		byte b = -1;
		println(Integer.toBinaryString(b));
		b >>>= 10;
		println(Integer.toBinaryString(b));
		b = -1;
		println(Integer.toBinaryString(b));
		println(Integer.toBinaryString(b >>> 10));
		
		int m = 0234;
		println(Integer.toBinaryString(m));
		println(Integer.toBinaryString(-m));
		println(Integer.toBinaryString(m >> 5));
		println(Integer.toBinaryString(m >>> 5));
		println(Integer.toBinaryString(-m >> 5));
		println(Integer.toBinaryString(-m >>> 5));
		println(Integer.toBinaryString(~0));
	}
}
