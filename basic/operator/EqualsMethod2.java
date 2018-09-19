package operator;
//: operator/EqualsMethod2.java
// Default equals() does not compare contents 默认的equals函数不能比较内容

class Value{
	int i;
}

/**
 * 结果为false的原因:
 * 由于equals()的默认行为是比较引用，
 * 所以除非在自己的新类中覆盖equals方法，
 * 否则不会表现出我们希望的行为
 * @author Mrzhang
 */
public class EqualsMethod2 {
	public static void main(String[] args) {
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		System.out.println(v1.equals(v2));
	}
}
