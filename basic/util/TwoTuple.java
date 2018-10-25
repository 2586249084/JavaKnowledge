package util;
//: util/TwoTuple.java
// A two-dimensional tuple that can hold two objects.
// һ���ܹ�������������Ķ�άԪ��.

public class TwoTuple<First, Second> {

	public final First first;
	
	public final Second second;

	public TwoTuple(First first, Second second) {
		this.first = first;
		this.second = second;
	}
	
	public String toString() {
		return "(" + first + ", " + second + ")";
	}
	
} ///:~
