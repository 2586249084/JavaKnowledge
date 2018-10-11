package holding;
//: holding/ForEachCollections.java
// All collections work with foreach.
// 所有的集合都与foreach一起工作

import java.util.*;

public class ForEachCollections {
	
	public static void main(String[] args) {
		Collection<String> cs = new LinkedList<String>();
		Collections.addAll(cs, "Take the long way home".split(" "));
		for (String s : cs)
			System.out.print("'" + s + "' ");
	}
	
}/*
'Take' 'the' 'long' 'way' 'home' 
*///:~
