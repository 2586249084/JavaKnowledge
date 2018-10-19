package holding;
//: holding/UniqueWords.java

import util.*;
import java.util.*;

public class UniqueWords {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("UniqueWords.java", "\\W+"));
		System.out.println(words);
	}
}/*Output:
[A, add, addAll, added, args, B, C, class, Collections, contains, containsAll, 
D, E, F, false, from, G, H, HashSet, holding, I, import, in, J, java, K, L, M, 
main, N, new, Output, package, Print, println, public, remove, removeAll, removed, 
Set, set1, set2, SetOperations, split, static, String, to, true, util, void, X, Y, Z]
*///:~
