package operator;
//: operator/LogicOps.java
// Relational and logical operators. 关系和逻辑运算符

import java.util.Random;
import static commentUtil.Print.*;


public class LogicOps {
	public static void main(String[] args) {
		Random rand = new Random(47);
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		println("i : " + i);
		println("j : " + j);
		println("i < j is " + (i < j));
		println("i > j is " + (i > j));
		println("i >= j is " + (i >= j));
		println("i <= j is " + (i <= j));
		println("i == j is " + (i == j));
		println("i != j is " + (i != j));
		
			// Treating an int as a boolean is not legal Java: 
		// 将int值作为布尔值是不合法的
		//! println("i && j is " + (i && j));
		//! println("i || j is " + (i || j));
		//! println("!i is " + !i);
		println("i < 10 && j < 10 is " + ((i < 10) && (j < 10)));
		println("i < 10 || j < 10 is " + ((i < 10) || (j < 10)));
	}
}
