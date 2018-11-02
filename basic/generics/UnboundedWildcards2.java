package generics;
//: generics/UnboundedWildcards2.java

import java.util.*;

public class UnboundedWildcards2 {

	@SuppressWarnings("rawtypes")
	static Map map1;
	
	static Map<?, ?> map2;
	
	static Map<String, ?> map3;
	
	@SuppressWarnings("rawtypes")
	static void assign1(Map map) { map1 = map; }
	
	static void assign2(Map<?, ?> map) { map2 = map; }
	
	static void assign3(Map<String, ?> map) { map3 = map; }
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		assign1(new HashMap());
		assign2(new HashMap());
		// assign3(new HashMap());
		
		assign1(new HashMap<String, Integer>());
		assign2(new HashMap<String, Integer>());
		assign3(new HashMap<String, Integer>());
	}

} ///:~
