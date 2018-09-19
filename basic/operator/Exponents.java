package operator;
//: operator/Exponents.java

/**
 * Exponents 指数计数法
 * "e" means "10 to the power."
 * e的意思是10的次方
 * @author Mrzhang
 */
public class Exponents {
	public static void main(String[] args) {
		// UpperCase and lowerCase 'e' are the same: 大写e和小写e是相同的
		float expFloat = 1.39e-43f;
		expFloat = 1.39E-43f;
		System.out.println(expFloat);
		double expDouble = 47e47d; // 'd' is optional d是可选的
		double expDouble2 = 47e47; // Automatically double 自动填补d
		System.out.println(expDouble);
		System.out.println(expDouble2);
		
		// text
		float max_f = Float.MAX_VALUE;
		float min_f = Float.MIN_VALUE;
		double max_d = Double.MAX_VALUE;
		double min_d = Double.MIN_VALUE;
		System.out.println("max_f : " + max_f + "\nmax_d : " + max_d);
		System.out.println("min-f : " + min_f + "\nmin_d : " + min_d);
	}
}
