package strings;
//: strings/Splitting.java

import java.util.*;

public class Splitting {

	public static String knights = "Then ,when you have found the shrubbery, you must"
			+ " cut down the mightiest tree in the forest... "
			+ "with... a herring";
	
	public static void split(String regex) {
		System.out.println(Arrays.toString(knights.split(regex)));
	}
	
	public static void main(String[] args) {
		split(" "); // Doesn't have to contain regex chars 不需要包含正则字符
		split("\\W+"); // Non-word characters 非单词字符
		split("n\\W+"); // 'n' followed by non-word characters "n"后面跟着非单词字符
	}

}/*Output:
[Then, ,when, you, have, found, the, shrubbery,, you, must, cut,
 down, the, mightiest, tree, in, the, forest..., with..., a, herring]
 
[Then, when, you, have, found, the, shrubbery, you, must, cut, 
down, the, mightiest, tree, in, the, forest, with, a, herring]

[The, whe, you have found the shrubbery, you must cut dow, 
the mightiest tree i, the forest... with... a herring]
*///:~
