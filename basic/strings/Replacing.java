package strings;
//: strings/Replacing.java

import static util.Print.*;

public class Replacing {

	static String s = Splitting.knights;
	
	public static void main(String[] args) {
		println(s.replaceFirst("f\\w+", "located"));
		println(s.replaceAll("shrubbery|tree|herring", "banana"));
	}

}/*Output:
Then ,when you have found the shrubbery, you must cut 
down the mightiest tree in the forest... with... a herring

Then ,when you have found the banana, you must cut 
down the mightiest banana in the forest... with... a banana
*///:~
