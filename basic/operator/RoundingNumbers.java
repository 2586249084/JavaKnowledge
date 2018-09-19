package operator;
//: operator.RoundingNumbers.java
// Round floats and doubles

import static util.Print.*;

/**
 * RoundingNumbers 用math.round()方法，可以得到舍入的结果
 * @author Mrzhang
 */
public class RoundingNumbers {
	public static void main(String[] args) {
		double above = 0.7, below = 0.4;
		float fabove = 0.7f, fbelow = 0.4f;
		println("Math.round(above) :" + Math.round(above));
		println("Math.round(below) :" + Math.round(below));
		println("Math.round(fabove) :" + Math.round(fabove));
		println("Math.round(fbelow) :" + Math.round(fbelow));
	}
}
