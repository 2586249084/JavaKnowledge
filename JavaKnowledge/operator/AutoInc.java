package operator;
//: operator/AutoInc.java

import static commentUtil.Print.*;

/** 
 * AutoInc �Զ������͵ݼ�
 * @author Mrzhang
 * ++��--
 * ǰ׺�����͵ݼ�:��ִ�����㣬������ֵ
 * ��׺�����͵ݼ�:������ֵ���ڽ�������
 */

public class AutoInc {
	public static void main(String[] args) {
		int i = 1;
		println("i : " + i);
		println("++i : " + ++i);
		println("i++ : " + i++);
		println("i : " + i);
		println("--i : " + --i);
		println("i-- : " + i--);
		println("i : " + i);
	}
}
