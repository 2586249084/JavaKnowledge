package strings;
//: strings/ReplacingStringTokenizer.java

import java.util.*;

public class ReplacingStringTokenizer {

	public static void main(String[] args) {
		String input = "But I'm not dead yet! I feel happy!";
		StringTokenizer stoken = new StringTokenizer(input);
		while(stoken.hasMoreElements()) 
			System.out.print(stoken.nextToken() + " ");
		System.out.println();
		System.out.println(Arrays.toString(input.split(" ")));
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(input);
		while(scanner.hasNext())
			System.out.print(scanner.next() + " ");
	}

}/*Output:
But I'm not dead yet! I feel happy! 
[But, I'm, not, dead, yet!, I, feel, happy!]
But I'm not dead yet! I feel happy! 
*///:~
