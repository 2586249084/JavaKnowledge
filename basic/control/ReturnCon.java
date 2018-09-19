package control;
//: control/ReturnCon.java

import static util.Print.*;

/**
 * ReturnCon returnÓï¾ä
 * @author Mrzhang
 */
public class ReturnCon {
	
	static int test(int testval, int target) {
		if (testval > target) {
			return +1;
		} else if (testval < target) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		println(test(10, 5));
		println(test(5, 10));
		println(test(5, 5));
	}
}
