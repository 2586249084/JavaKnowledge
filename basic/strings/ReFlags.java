package strings;
//: strings/ReFlags.java

import java.util.regex.*;

public class ReFlags {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^java", 
				Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(
				"java has regex\njava has regex\n"
				+ "JAVA has pertty good regular experssions\n"
				+ "Regular expressions are in java");
		while(matcher.find())
			System.out.println(matcher.group());
	}

}/*Output:
java
java
JAVA
*///:~
