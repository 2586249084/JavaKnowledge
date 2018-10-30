package generics;
//: generics/CovariantArrays.java

class Fruit { }

class Apple extends Fruit { }

class Jonathan extends Apple { }

class Orange extends Fruit { }

public class CovariantArrays {

	public static void main(String[] args) {
		Fruit[] fruit = new Apple[10];
		fruit[0] = new Apple(); // OK
		fruit[1] = new Jonathan(); // OK
		
		// Runtime type is Apple[], not Fruit[] or Orange[]:
		// 运行时类型为Apple[],不是Fruit[]或Orange[]:
		try {
			// Complier allows you to add Fruit:
			// 编译器允许您添加Fruit:
			fruit[0] = new Fruit(); // ArrayStoreException
		} catch (Exception exception) {
			System.out.println(exception);
		}
		
		try {
			// Complier allows you to add Oranges:
			// 编译器允许您添加Orange:
			fruit[0] = new Orange();// ArrayStoreException
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}

}/* Output:
java.lang.ArrayStoreException: generics.Fruit
java.lang.ArrayStoreException: generics.Orange
*///:~
