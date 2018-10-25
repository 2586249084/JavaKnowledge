package util;
//: util/ThreeTuple.java
// Longer tuples are implemented using inheritance mechanisms.
// ���ü̳л���ʵ�ֳ��ȸ�����Ԫ��.

public class ThreeTuple<First, Second, Third> 
extends TwoTuple<First, Second> {

	public final Third third;
	
	public ThreeTuple(First first, Second second, Third third) {
		super(first, second);
		this.third = third;
	}
	
	public String toString() {
		return "(" + first + ", " + second + ", " + third + ")";
	}

} ///:~
