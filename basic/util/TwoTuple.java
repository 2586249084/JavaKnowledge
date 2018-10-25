package util;
//: util/TwoTuple.java
// A two-dimensional tuple that can hold two objects.
// 一个能够持有两个对象的二维元组.

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
