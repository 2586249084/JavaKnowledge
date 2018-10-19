package strings;
//: strings/Finding.java

import java.util.regex.*;
import static util.Print.*;

public class Finding {

	public static void main(String[] args) {
		Matcher matcher = Pattern.compile("\\w+")
				.matcher("Evening is full of the linnet's wings");
		while(matcher.find())
			print(matcher.group() + " ");
		println();
		int i = 0;
		while(matcher.find(i)) {
			print(matcher.group() + " ");
			i++;
		}
	}

}/*Output:

*///:~
