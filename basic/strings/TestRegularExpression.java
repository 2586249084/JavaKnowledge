package strings;
//: strings/TestRegularExpression.java
// Allows you to easily try out regular expression.
// 允许您轻松地尝试正则表达式.
// {Args : abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}" }

import java.util.regex.*;
import static util.Print.*;

public class TestRegularExpression {

	public static void main(String[] args) {
		if (args.length < 2) {
			println("Usage : \njava TestRegularExpression "
					+ "characterSequence regularExpression");
			System.exit(0);
		}
		println("Input : \"" + args[0] + "\"");
		for (String arg : args) {
			println("Regular expression : \"" + arg + "\"");
			Pattern pattern = Pattern.compile(arg);
			Matcher matcher = pattern.matcher(args[0]);
			while(matcher.find()) {
				println("Match : \"" +  matcher.group() + "\" at positions " +
						matcher.start() + "-" + (matcher.end() - 1));
			}
		}
	}

}/*Output:
Input : "abcabcabcdefabc"
Regular expression : "abcabcabcdefabc"
Match : "abcabcabcdefabc" at positions 0-14
Regular expression : "abc+"
Match : "abc" at positions 0-2
Match : "abc" at positions 3-5
Match : "abc" at positions 6-8
Match : "abc" at positions 12-14
Regular expression : "(abc)+"
Match : "abcabcabc" at positions 0-8
Match : "abc" at positions 12-14
Regular expression : "(abc){2,}"
Match : "abcabcabc" at positions 0-8
*///:~
