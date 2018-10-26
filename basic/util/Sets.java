package util;
//: util/Sets.java

import java.util.*;

public class Sets {
	
	// 两个集合的并集:
	public static <T> Set<T> union(Set<T> a, Set<T> b) {
		Set<T> result = new HashSet<T>(a);
		result.addAll(b);
		return result;
	}
	
	// 两个集合的交集:
	public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
		Set<T> result = new HashSet<T>(a);
		result.retainAll(b);
		return result;
	}
	
	// Subtract subset from superset:
	// 从超集中减去子集:
	public static <T> Set<T> difference(Set<T> superSet, Set<T> subSet) {
		Set<T> result = new HashSet<T>(superSet);
		result.removeAll(subSet);
		return result;
	}
	
	// Reflexive--everything not in the intersection:
	// 反射--一切都不在交叉点上:
	public static <T> Set<T> complement(Set<T> a, Set<T> b) {
		return difference(union(a, b), intersection(a, b));
	}

}
