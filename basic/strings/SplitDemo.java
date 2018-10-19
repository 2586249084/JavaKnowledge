package strings;
//: strings/SplitDemo.java

import java.util.*;
import java.util.regex.*;
import static util.Print.*;

public class SplitDemo {

	public static void main(String[] args) {
		String input = "This!!unusual use!!of exclamation!!points";
		println(Arrays.toString(Pattern.compile("!!").split(input)));
		// Only do the first three:
		// 只做前三个:
		println(Arrays.toString(Pattern.compile("!!").split(input, 3)));
	}

}/*Output:
[This, unusual use, of exclamation, points]
[This, unusual use, of exclamation!!points]
*///:~
