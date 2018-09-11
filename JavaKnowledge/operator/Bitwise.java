package operator;
//:operator/Bitwise.java

/**
 * Bitwise 按位操作符
 * @author Mrzhang
 * 二元操作符:
 * &(与):两个输入位都是1,则生成输出位1;否则生成输出位0
 * 
 * |(或):两个输入位只要有一个为1,则生成输出位1;只有两个输入位都为0时,才生成输出位0
 * 
 * ^(异或):如果输入位的某一个为1,但不全是1,则生成输出位1;当输出位一致时(不管是0还是1),则生成输出位0
 * 
 * 一元操作符:
 * ~(非):若输入0,则输出1;若输入1,则输出0
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
