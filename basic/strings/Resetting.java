package strings;
//: strings/Resetting.java

import java.util.regex.*;

public class Resetting {

	public static void main(String[] args) {
		Matcher matcher = Pattern.compile("[frb][aiu][gx]")
				.matcher("fix the rug with bags");
		while(matcher.find())
			System.out.print(matcher.group() + " ");
		System.out.println();
		matcher.reset("fix the rug with rags");
		while(matcher.find())
			System.out.print(matcher.group() + " ");
	}

}/*Output:
fix rug bag 
fix rug rag 
*///:~
