package operator;
//: operator.OverFlow.java

/**
 * OverFlow ��intֵ����int�����ֵ������ͻ����
 * @author Mrzhang
 */
public class OverFlow {
	public static void main(String[] args) {
		int big = Integer.MAX_VALUE;
		System.out.println("big = " + big);
		int bigger = big * 4;
		System.out.println("bigger = " + bigger);
	}
}
