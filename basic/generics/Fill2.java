//: generics/Fill2.java
// Using adapters to simulate latent typing.
// 使用适配器模拟潜在类型.

package generics;

import java.util.*;
import generics.coffee.*;
import util.*;
import static util.Print.*;

interface Addable<T> {
	void add(T t);
}

public class Fill2 {

	// ClassToken Version:
	public static <T> void fill(Addable<T> addable, 
	Class<? extends T> classToken, int size) {
		for(int i = 0; i < size; i++)
			try {
				addable.add(classToken.newInstance());
			} catch (Exception exception) {
				throw new RuntimeException();
			}
	}

	// Generator version:
	public static <T> void fill(Addable<T> addable, 
	Generator<T> generator, int size) {
		for (int i = 0; i < size; i++)
			addable.add(generator.next());
	}

}

// To adapt a base type, you must use composition.
// Make any Collection Addable using composition.
// 要适应基类型，必须使用组合.
// 使用组合使任何集合可添加.
class AddableCollectionAdapter<T> implements Addable<T> {

	private Collection<T> collection;

	public AddableCollectionAdapter(Collection<T> collection) {
		this.collection = collection;
	}

	@Override
	public void add(T item) {
		collection.add(item);
	}

}

// A helper to capture the type automatically:
// 自动捕获类型的助手:
class Adapter {
	
	public static <T> Addable<T> collectionAdapter(Collection<T> collection) {
		return new AddableCollectionAdapter<T>(collection);
	}
	
}

// To adapter a specific type, you can use inheritance.
// 要适配器特定类型，可以使用继承.
class AddableSimpleQueue<T> extends 
SimpleQueue<T> implements Addable<T> {
	
	@Override
	public void add(T item) {
		super.add(item);
	}
	
}

class FillTest2 {
	
	public static void main(String[] args) {
		// Adapt a Collection:
		// 适应一个集合:
		List<Coffee> carrier = new ArrayList<Coffee>();
		Fill2.fill(new AddableCollectionAdapter<Coffee>(carrier), Coffee.class, 3);
		
		// Helper method captures the type:
		// 助手方法捕获类型:
		Fill2.fill(Adapter.collectionAdapter(carrier), Latte.class, 2);
		
		for (Coffee coffee : carrier)
			println(coffee);
		println("--------------------------");
		
		// Use an adapted class:
		// 使用适应的类:
		AddableSimpleQueue<Coffee> coffeeQueue = new AddableSimpleQueue<Coffee>();
		Fill2.fill(coffeeQueue, Mocha.class, 4);
		Fill2.fill(coffeeQueue, Latte.class, 1);
		for (Coffee coffee : coffeeQueue)
			println(coffee);
	}
	
}/* Output:
Coffee 0
Coffee 1
Coffee 2
Latte 3
Latte 4
--------------------------
Mocha 5
Mocha 6
Mocha 7
Mocha 8
Latte 9
*///:~
