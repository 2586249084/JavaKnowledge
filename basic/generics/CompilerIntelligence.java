package generics;
//: generics/CompilerIntelligence.java

import java.util.*;

public class CompilerIntelligence {

	public static void main(String[] args) {
		List<? extends Fruit> flist = 
		  Arrays.asList(new Apple());
		
		// No warning
		Apple a = (Apple)flist.get(0);
		System.out.println(a.getClass().getSimpleName());
		
		// Argument is 'Object'
		flist.contains(new Apple());
		flist.indexOf(new Apple());
		System.out.println(flist);
	}

} ///:~
