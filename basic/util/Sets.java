package util;
//: util/Sets.java

import java.util.*;

public class Sets {
	
	// �������ϵĲ���:
	public static <T> Set<T> union(Set<T> a, Set<T> b) {
		Set<T> result = new HashSet<T>(a);
		result.addAll(b);
		return result;
	}
	
	// �������ϵĽ���:
	public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
		Set<T> result = new HashSet<T>(a);
		result.retainAll(b);
		return result;
	}
	
	// Subtract subset from superset:
	// �ӳ����м�ȥ�Ӽ�:
	public static <T> Set<T> difference(Set<T> superSet, Set<T> subSet) {
		Set<T> result = new HashSet<T>(superSet);
		result.removeAll(subSet);
		return result;
	}
	
	// Reflexive--everything not in the intersection:
	// ����--һ�ж����ڽ������:
	public static <T> Set<T> complement(Set<T> a, Set<T> b) {
		return difference(union(a, b), intersection(a, b));
	}

}
