package operator;
//: operator.Ternary.java

import static commentUtil.Print.*;

/**
 * Ternary operator ��Ԫ������
 * @author Mrzhang
 * ��ʽ:boolean-exp ? value0 : value1
 * ����:���boolean-exp(�������ʽ)�Ľ��Ϊtrue���ͼ���value0��
 * ��֮����value1��value0��value1Ϊ���ղ�����ֵ
 */
public class Ternary {
	static int ternary(int i) {
		return i < 10 ? i * 100 : i * 10;
	}
	
	static int standardIfElse(int i) {
		if (i < 10) {
			return i * 100;
		} else {
			return i * 10;
		}
	}
	
	public static void main(String[] args) {
		println(ternary(9));
		println(ternary(10));
		println(standardIfElse(9));
		println(standardIfElse(10));
	}
}
