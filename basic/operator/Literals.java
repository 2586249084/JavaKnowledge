package operator;
//: operator/Literals.java

import static util.Print.*;

/**
 * Literals ֱ�ӳ���
 * @author Mrzhang
 */
public class Literals {
	public static void main(String[] args) {
		// Hexadecimal ʮ������       Octal �˽���
		int i1 = 0x2f; // Hexadecimal (lowerCase)
		println("i1 : " + Integer.toBinaryString(i1));
		int i2 = 0x2F; // Hexadecimal (upperCase)
		println("i2 : " + Integer.toBinaryString(i2));
		int i3 = 0177; // Octal (leading zero(ǰ����Ϊ��))
		println("i3 : " + Integer.toBinaryString(i3));
		char c = 0xffff; // max char hex value
		println("c : " + Integer.toBinaryString(c));
		byte b = 0x7f; // max byte hex value
		println("b : " + Integer.toBinaryString(b));
		short s = 0x7fff; // max short hex value
		println("s : " + Integer.toBinaryString(s));
		long n1 = 200L; // long suffix(long��׺)
		println("n1 : " + Long.toBinaryString(n1));
		long n2 = 200l; // long suffix (but can be confusing(���ҵ�))
		println("n2 : " + Long.toBinaryString(n2));
		long n3 = 200;
		println("n3 : " + Long.toBinaryString(n3));
		float f1 = 1;
		println("f1 : " + Float.toHexString(f1));
		float f2 = 1F; // float suffix
		println("f2 : " + Float.toHexString(f2));
		float f3 = 1f; // float suffix
		println("f3 : " + Float.toHexString(f3));
		double d1 = 1d; // double suffix
		println("d1 : " + Double.toHexString(d1));
		double d2 = 1D; // double suffix
		println("d2 : " + Double.toHexString(d2));
		
		// text
		long l1 = 0xaaaa;
		println("l1 : " + Long.toBinaryString(l1));
		long l2 = 0023;
		println("l2 : " + Long.toBinaryString(l2));
	}
}
