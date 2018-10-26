package util;
//: util/New.java
// Utilities to simplify generics container creation
// by using type argument inference.
// 通过使用类型参数推断简化泛型容器创建的实用工具.

import java.util.*;

public class New {
	
	public static <K, V> Map<K, V> map(){
		return new HashMap<K, V>();
	}
	
	public static <T> List<T> list(){
		return new ArrayList<T>();
	}
	
	public static <T> LinkedList<T> linkedList(){
		return new LinkedList<T>();
	}
	
	public static <T> Set<T> set(){
		return new HashSet<T>();
	}
	
	public static <T> Queue<T> queue(){
		return new LinkedList<T>();
	}

}
