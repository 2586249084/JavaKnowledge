package operator;
//: operator/StringOperator.java

import static commentUtil.Print.*;

/**
 * StringOperator ×Ö·û´®²Ù×÷·û+ºÍ+=
 * @author Mrzhang
 */
public class StringOperator {
	public static void main(String[] args) {
		int x = 0, y = 1, z = 2;
		String s = "x, y, z";
		println(s + x + y + z);
		println(x + "   " + s);
		s += "(summed) = ";
		println(s + (x + y + z));
		println("" + x);
	}
}
