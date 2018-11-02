package generics;
//: generics/GenericWriting.java

import java.util.*;

public class GenericWriting {

	static <T> void writeExact(List<T> list, T item) {
		list.add(item);
	}
	
	static <T> void writeWithWildcard(List<? super T> list, T item) {
		list.add(item);
	}
	
	static List<Apple> apples = new ArrayList<Apple>();
	
	static List<Fruit> fruit = new ArrayList<Fruit>();
	
	
	
	static void f1() {
		writeExact(apples, new Apple());
		
		// Error: Incompatible types: found Fruit, required Apple
		// 错误:不兼容类型:发现Fruit，需要Apple
		// writeExact(fruit, new Apple());
	}
	
	static void f2() {
		writeWithWildcard(apples, new Apple());
		writeWithWildcard(fruit, new Apple());
	}
	
	public static void main(String[] args) {
		f1();
		f2();
	}

} ///:~
