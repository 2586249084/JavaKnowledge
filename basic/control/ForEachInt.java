package control;
//:control/ForEachInt.java

import static util.Print.*;
import static util.Range.*;

/**
 * ForEachInt
 * @author Mrzhang
 */
public class ForEachInt {
	public static void main(String[] args) {
		for(int i : range(10)) {
			print(i + " ");
		}
		println("");
		for(int i : range(5, 10)) {
			print(i + " ");
		}
		println("");
		for(int i : range(1, 10, 5)) {
			print(i + " ");
		}
	}
}
