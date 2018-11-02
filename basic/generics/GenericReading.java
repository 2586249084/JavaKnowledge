package generics;
//: generics/GenericReading.java

import java.util.*;

@SuppressWarnings("unused")
public class GenericReading {
	
	static List<Apple> apples = Arrays.asList(new Apple());
	
	static List<Fruit> fruits = Arrays.asList(new Fruit());
	
	static <T> T readExact(List<T> list) {
		return list.get(0);
	}
	
	// A static method adapts to each call:
	// 静态方法适应每个调用:
	static void f1() {
		Apple apple = readExact(apples);
		Fruit fruit = readExact(fruits);
		fruit = readExact(apples);
	}
	
	// If, however, you have a class, then its type is
	// established when the class is instantiated:
	// 然而，如果你有一个类，那么当类被实例化时它的类型就被建立:
	static class Reader<T> {
		T readExact(List<T> list) { return list.get(0); }
	}
	
	static void f2() {
		Reader<Fruit> fruitReader = new Reader<Fruit>();
		Fruit fruit = fruitReader.readExact(fruits);
		
		// Error: ReadExact(List<Fruit>) cannot be 
		// applied to (List<Apple>).
		// 错误:readprecise (List<Fruit>)无法应用于(List<Apple>).
		// Fruit apple = fruitReader.readExact(apples);
	}
	
	static class CovariantReader<T> {
		T readCovariant(List<? extends T> list) {
			return list.get(0);
		}
	}
	
	static void f3() {
		CovariantReader<Fruit> fruitReader = 
		  new CovariantReader<Fruit>();
		Fruit fruit = fruitReader.readCovariant(fruits);
		Fruit apple = fruitReader.readCovariant(apples);
	}
	
	public static void main(String[] args) {
		f1();
		f2();
		f3();
	}

} ///:~
