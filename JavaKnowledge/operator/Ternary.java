package operator;
//: operator.Ternary.java

import static commentUtil.Print.*;

/**
 * Ternary operator 三元操作符
 * @author Mrzhang
 * 形式:boolean-exp ? value0 : value1
 * 解释:如果boolean-exp(布尔表达式)的结果为true，就计算value0，
 * 反之计算value1，value0与value1为最终产生的值
 */
public class Ternary {
	static int ternary(int i) {
		return i < 10 ? i * 100 : i * 10;
	}
	
	static int standardIfElse(int i) {
		if (i < 10) {
			return i * 100;
		} else {
			return i * 10;
		}
	}
	
	public static void main(String[] args) {
		println(ternary(9));
		println(ternary(10));
		println(standardIfElse(9));
		println(standardIfElse(10));
	}
}
