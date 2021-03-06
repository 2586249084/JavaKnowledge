package util;
//: util/TypeCounter.java
// Counts instances of a type family.
// 计数类型家族的实例.

import java.util.*;

@SuppressWarnings("serial")
public class TypeCounter extends HashMap<Class<?>, Integer> {
	
	private Class<?> baseType;
	
	public TypeCounter(Class<?> baseType) {
		this.baseType = baseType;
	}
	
	public void count(Object object) {
		Class<?> type = object.getClass();
		if (!baseType.isAssignableFrom(type))
			throw new RuntimeException(object + " incorrent type : " 
					+ type + ", should be type or subtype of " + baseType);
		countClass(type);
	}
	
	private void countClass(Class<?> type) {
		Integer quantity = get(type);
		put(type, quantity == null ? 1 : quantity + 1);
		Class<?> superClass = type.getSuperclass();
		if (superClass != null && baseType.isAssignableFrom(type))
			countClass(superClass);
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder("{");
		for (Map.Entry<Class<?>, Integer> pair : entrySet()) {
			result.append(pair.getKey().getSimpleName());
			result.append("=");
			result.append(pair.getValue());
			result.append(", ");
		}
		result.delete(result.length() - 2, result.length());
		result.append("}");
		return result.toString();
	}
	
}
