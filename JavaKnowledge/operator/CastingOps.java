package operator;
//: operator/CastingOps.java

/**
 * CastingOps ����ת��������
 * @author Mrzhang
 */
public class CastingOps {
	public static void main(String[] args) {
		int i = 100;
		long lng = (long) i;
		lng = i; // "Widening," so cast not really required.����:ʹ������չ����������ת����ʵ�ϲ��Ǳ����
		long lng2 = (long)200;
		lng2 = 200;
		// A "narrowing conversion" խ��ת��
		i = (int)lng2; // Cast required
		System.out.println(lng);
	}
}
