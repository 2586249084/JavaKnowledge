package generics;
//: generics/UnboundedWildcards1.java

import java.util.*;

public class UnboundedWildcards1 {

	@SuppressWarnings("rawtypes")
	static List list1;
	
	static List<?> list2;
	
	static List<? extends Object> list3;
	
	@SuppressWarnings("rawtypes")
	static void assign1(List list) {
		list1 = list;
		list2 = list;
		
		// Warning: unchecked conversion
		// Found: List, Required: List<? extends Object>
		// 警告:未经检查的转换
		// 找到:List，需要:List<? extends Object>
		// list3 = list;
	}
	
	static void assign2(List<?> list) {
		list1 = list;
		list2 = list;
		list3 = list;
	}
	
	static void assign3(List<? extends Object> list) {
		list1 = list;
		list2 = list;
		list3 = list;
	}
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		assign1(new ArrayList());
		assign2(new ArrayList());
		// assign3(new ArrayList());
		
		assign1(new ArrayList<String>());
		assign2(new ArrayList<String>());
		assign3(new ArrayList<String>());
		
		// Both forms are acceptable as List<?>:
		// 这两种形式都可以作为List<?>:
		List<?> wildList = new ArrayList();
		wildList = new ArrayList<String>();
		assign1(wildList);
		assign2(wildList);
		assign3(wildList);
	}

} ///:~
