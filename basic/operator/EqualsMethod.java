package operator;
//: operator/EqualsMethod.java

/**
 * EqualsMethod equals函数
 * @author Mrzhang
 * 比较对象实际内容用所有对象都适用的equals()方法,
 * 这个方法不适用于基本数据类型
 */
public class EqualsMethod {
	public static void main(String[] args) {
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println(n1.equals(n2));
	}
}
