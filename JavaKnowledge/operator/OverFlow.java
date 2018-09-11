package operator;
//: operator.OverFlow.java

/**
 * OverFlow 当int值超过int的最大值，结果就会溢出
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
