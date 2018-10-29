package util;
//: util/ContainerMethodDifferences.java

import java.util.*;
import java.lang.reflect.*;

public class ContainerMethodDifferences {
	
	static Set<String> methodSet(Class<?> type) {
		Set<String> result = new TreeSet<String>();
		for (Method method : type.getMethods())
			result.add(method.getName());
		return result;
	}
	
	static void interfaces(Class<?> type) {
		System.out.println("Interfaces in " + 
				type.getSimpleName() + " : ");
		List<String> result = new ArrayList<String>();
		for (Class<?> classes : type.getInterfaces())
			result.add(classes.getSimpleName());
		System.out.println(result);
	}
	
	static Set<String> object = methodSet(Object.class);
	
	static { object.add("clone"); }
	
	static void difference(Class<?> superSet, Class<?> subSet) {
		System.out.println(superSet.getSimpleName() + " extends "
				+ subSet.getSimpleName() + ", adds: ");
		Set<String> comp = Sets.difference(methodSet(superSet), methodSet(subSet));
		comp.removeAll(object);
		System.out.println(comp);
		interfaces(superSet);
	}

}
