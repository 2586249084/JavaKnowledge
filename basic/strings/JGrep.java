package strings;
//: strings/JGrep.java
// A very simple version of the "grep" program.
// "grep"程序的一个非常简单的版本.
// {Args : JGrep.java "\\b[Ssct]\\w+"}

import java.util.regex.*;
import util.*;

public class JGrep {

	public static void main(String[] args) {
		if (args.length < 2){
			System.out.println("Usage: java jgrep file regex");
			System.exit(0);
		}
		
		Pattern pattern = Pattern.compile(args[1]);
		// Iterator through the lines of the input file:
		// 迭代器遍历输入文件的行
		int index = 0;
		Matcher matcher = pattern.matcher(" ");
		for (String line : new TextFile(args[0])) {
			matcher.reset(line);
			while(matcher.find()) {
				System.out.println(index++ + " : " + 
						matcher.group() + " : " + matcher.start());
			}	
		}
	}

}/*Output:

*///:~
