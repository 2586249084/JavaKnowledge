package strings;
//: strings/Groups.java

import java.util.regex.*;
import static util.Print.*;

public class Groups {

	static public final String POEM = 
			"Taws brillig, and the shithy toves\n"
			+ "Did gyre and gimble in the wabe.\n"
			+ "All mimsy were the borogoves,\n"
			+ "And the mome raths outgrabe.\n\n"
			+ "Beware the Jabberwock, my son,\n"
			+ "The jaws that bite, the claws that catch.\n"
			+ "Beware the Jubjub bird, and shun\n"
			+ "The frumious Bandersnatch.";
	
	public static void main(String[] args) {
		Matcher matcher = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
				.matcher(POEM);
		while(matcher.find()) {
			for (int j = 0; j < matcher.groupCount(); j++)
				print("[" + matcher.group(j) + "]");
			println();
		}
	}

}/*Output:
[the shithy toves][the][shithy toves][shithy]
[in the wabe.][in][the wabe.][the]
[were the borogoves,][were][the borogoves,][the]
[mome raths outgrabe.][mome][raths outgrabe.][raths]
[Jabberwock, my son,][Jabberwock,][my son,][my]
[claws that catch.][claws][that catch.][that]
[bird, and shun][bird,][and shun][and]
[The frumious Bandersnatch.][The][frumious Bandersnatch.][frumious]
*///:~
