package generics;
//: generics/Generators.java
// A utility to use with Generators.
// 与生成器一起使用的实用程序.

import generics.coffee.*;
import java.util.*;
import util.*;

public class Generators {
	
	public static <T> Collection<T> 
	fill(Collection<T> collection, Generator<T> generator, int n) {
		for (int i = 0; i < n ; i++)
			collection.add(generator.next());
		return collection;
	}

	public static void main(String[] args) {
		Collection<Coffee> coffees = fill(
				new ArrayList<Coffee>(), new CoffeeGenerator<Coffee>(), 4);
		for (Coffee coffee : coffees)
			System.out.println(coffee);
		Collection<Integer> numbers = fill(
				new ArrayList<Integer>(), new Fibonacci(), 12);
		for (int i : numbers)
			System.out.print(i + " ");
		
	}

}/* Output:
Americano 0
Latte 1
Americano 2
Mocha 3
1 1 2 3 5 8 13 21 34 55 89 144 
*///:~
