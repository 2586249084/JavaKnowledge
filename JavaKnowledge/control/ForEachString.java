package control;
//: control/ForEachString.java

/**
 * ForEachString
 * @author Mrzhang
 */
public class ForEachString {
	public static void main(String[] args) {
		for(char x : "Think in Java".toCharArray()) {
			System.out.println(x);
		}
	}
}
