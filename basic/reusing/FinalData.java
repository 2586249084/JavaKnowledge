package reusing;
//: reusing/FinalData.java
// The effect of final on fields
// final字段的影响

import java.util.*;
import static util.Print.*;

class Value {
	int i; // Package access
	
	public Value(int i) {
		this.i = i;
	}
}

public class FinalData {
	
	private static Random rand = new Random(47);
	private String id;
	
	private FinalData(String id) {
		this.id = id;
	}
	
	// Can be compile-time constants:
	// 可以是编译时常量
	@SuppressWarnings("unused")
	private final int valueOne = 9;
	@SuppressWarnings("unused")
	private static final int VALUE_TWO = 99;
	
	// Typical public constant:
	// 典型的公共常量
	public static final int VALUE_THREE = 39;
	
	// Cannot be compile-time constants:
	// 不能是编译时常量
	private final int i4 = rand.nextInt(20);
	static final int INT_5 = rand.nextInt(20);
	@SuppressWarnings("unused")
	private Value v1 = new Value(11);
	private final Value v2 = new Value(22);
	@SuppressWarnings("unused")
	private static final Value VAL_3 = new Value(33);
	
	// Arrays:
	// 集合
	private final int[] a = {1, 2, 3, 4, 5};
	
	public String toString() {
		return id + " : i4 = " + i4 + ", INT_5 = " + INT_5;
	}
	
	public static void main(String[] args) {
		FinalData fd1 = new FinalData("fd1");
		//! fd1.valueOne++; // Error:can't change value 不能改变数值
		fd1.v2.i++; // Object isn't constant! 对象不是常数
		fd1.v1 = new Value(9);// OK -- not final
		for (int i = 0; i < fd1.a.length; i++)
			fd1.a[i]++;
		//! fd1.v2 = new Value(0); // Error:Can't
		//! fd1.VAL_3 = new Value(1); // change reference
		//! fd1.a = new int[3];
		println(fd1);
		println("Creating new FinalData");
		FinalData fd2 = new FinalData("fd2");
		println(fd1);
		println(fd2);
	}
}/* Output:
fd1 : i4 = 15, INT_5 = 18
Creating new FinalData
fd1 : i4 = 15, INT_5 = 18
fd2 : i4 = 13, INT_5 = 18
*/
