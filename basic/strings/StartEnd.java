package strings;
//: strings/StartEnd.java

import java.util.regex.*;
import static util.Print.*;

public class StartEnd {
	
	public static String input = 
			"As long as there is injustice, whenever a\n"
			+ "Targathian baby cries out, wherever a distress\n"
			+ "signal sounds among the stars ... We'll be there.\n"
			+ "This fine ship, and this fine crew ...\n"
			+ "Never give up! Never surrender!";
	
	private static class Display {
		
		private boolean regexPrinted = false;
		
		private String regex;
		
		Display(String regex) { this.regex = regex; }
		
		void display(String message) {
			if(!regexPrinted) {
				println(regex);
				regexPrinted = true;
			}
			println(message);
		}
		
	}
	
	static void examine(String s, String regex) {
		Display display = new Display(regex);
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		while(matcher.find())
			display.display("find() ' " + matcher.group() + 
					" ' start = " + matcher.start() + " end = " + matcher.end());
		if (matcher.lookingAt()) // No reset() necessary 没有必要reset()
			display.display("lookingAt() start = " + matcher.start() +
					" end = " + matcher.end());
		if (matcher.matches()) // No reset() necessary 没有必要reset()
			display.display("matches() start = " + matcher.start() +
					" end = " + matcher.end());
	}
	
	public static void main(String[] args) {
		for (String input : input.split("\n")) {
			println("input : " + input);
			for (String regex : new String[] { "\\w*ere\\w*", 
					"\\w*ever", "T\\w+", "Never.*?!"})
				examine(input, regex);
		}
	}

}/*Output:
input : As long as there is injustice, whenever a
\w*ere\w*
find() ' there ' start = 11 end = 16
\w*ever
find() ' whenever ' start = 31 end = 39
input : Targathian baby cries out, wherever a distress
\w*ere\w*
find() ' wherever ' start = 27 end = 35
\w*ever
find() ' wherever ' start = 27 end = 35
T\w+
find() ' Targathian ' start = 0 end = 10
lookingAt() start = 0 end = 10
input : signal sounds among the stars ... We'll be there.
\w*ere\w*
find() ' there ' start = 43 end = 48
input : This fine ship, and this fine crew ...
T\w+
find() ' This ' start = 0 end = 4
lookingAt() start = 0 end = 4
input : Never give up! Never surrender!
\w*ever
find() ' Never ' start = 0 end = 5
find() ' Never ' start = 15 end = 20
lookingAt() start = 0 end = 5
Never.*?!
find() ' Never give up! ' start = 0 end = 14
find() ' Never surrender! ' start = 15 end = 31
lookingAt() start = 0 end = 14
matches() start = 0 end = 31
*///:~
