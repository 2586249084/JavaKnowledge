package operator;
//:operator/Bitwise.java

/**
 * Bitwise ��λ������
 * @author Mrzhang
 * ��Ԫ������:
 * &(��):��������λ����1,���������λ1;�����������λ0
 * 
 * |(��):��������λֻҪ��һ��Ϊ1,���������λ1;ֻ����������λ��Ϊ0ʱ,���������λ0
 * 
 * ^(���):�������λ��ĳһ��Ϊ1,����ȫ��1,���������λ1;�����λһ��ʱ(������0����1),���������λ0
 * 
 * һԪ������:
 * ~(��):������0,�����1;������1,�����0
 */
public class Bitwise {
	public static void main(String[] args) {
		int i = 0123;
		int z = 0234;
		System.out.println("i :" + Integer.toBinaryString(i) + "\nz :" + Integer.toBinaryString(z));
		System.out.println("i & z :" + Integer.toBinaryString((i & z)));
		System.out.println("i | z :" + Integer.toBinaryString((i | z)));
		System.out.println("i ^ z :" + Integer.toBinaryString((i ^ z)));
		System.out.println("~i :" + Integer.toBinaryString(~ i));
		System.out.println("~z :" + Integer.toBinaryString(~ z));
		int max = 0000;
		System.out.println(Integer.toOctalString(~max));
	}
}
