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
	// ��̬������Ӧÿ������:
	static void f1() {
		Apple apple = readExact(apples);
		Fruit fruit = readExact(fruits);
		fruit = readExact(apples);
	}
	
	// If, however, you have a class, then its type is
	// established when the class is instantiated:
	// Ȼ�����������һ���࣬��ô���౻ʵ����ʱ�������;ͱ�����:
	static class Reader<T> {
		T readExact(List<T> list) { return list.get(0); }
	}
	
	static void f2() {
		Reader<Fruit> fruitReader = new Reader<Fruit>();
		Fruit fruit = fruitReader.readExact(fruits);
		
		// Error: ReadExact(List<Fruit>) cannot be 
		// applied to (List<Apple>).
		// ����:readprecise (List<Fruit>)�޷�Ӧ����(List<Apple>).
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