package operator;
//: operator.CastingNumbers.java
// What happens when you cast a float
// or double to an integral value?

import static commentUtil.Print.*;

/**
 * CastingNumbers ΩÿŒ≤∫Õ…·»Î
 * @author Mrzhang
 */
public class CastingNumbers {
	public static void main(String[] args) {
		double above = 0.7, below = 0.4;
		float fabove = 0.7f, fbelow = 0.4f;
		println("(int)above :" + (int)above);
		println("(int)below :" + (int)below);
		println("(int)fabove :" + (int)fabove);
		println("(int)fbelow :" + (int)fbelow);
	}
}
