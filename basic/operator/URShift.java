package operator;
//: operator/URShift.java

import static util.Print.*;

/**
 * URShift ����λ������
 * @author Mrzhang
 * <<(����λ������):���ղ������Ҳ�ָ����λ��������������ߵĲ����������ƶ�(�ڵ�λ��0)
 * 
 * >>("�з���"����λ������):���ղ������Ҳ�ָ����λ��������������ߵĲ����������ƶ�
 * "�з���"����λ������ʹ��"������չ":������Ϊ�������ڸ�λ����0;������Ϊ�������ڸ�λ����1
 * 
 * >>>("�޷���"����λ������):���ղ������Ҳ�ָ����λ��������������ߵĲ����������ƶ�
 * "�޷���"����λ������ʹ��"����չ":�������������ڸ�λ����0
 * 
 * "��λ"����"�Ⱥ�"���ʹ��(<<=, >>=, >>>=)
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
