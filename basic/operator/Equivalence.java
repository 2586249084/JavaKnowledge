package operator;
//: operator/Equivalence.java

/**
 *Equivalence 测试对象的等价性
 * @author Mrzhang
 * == 和 ！= 比较的是对象的引用
 */
public class Equivalence {
	public static void main(String[] args) {
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
	}
}
