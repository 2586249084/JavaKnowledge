package generics.coffee;
//: generics/coffee/CoffeeGenerator.java

import util.*;
import java.util.*;

public class CoffeeGenerator<T> implements Generator<T>, Iterable<T> {

	private Class<?>[] types = { Latte.class, Mocha.class, 
			Cappuccino.class, Americano.class, Breve.class };

	private static Random rand = new Random(47);

	// For iteration:  ÎªÁËµü´ú
	private int size = 0;

	public CoffeeGenerator() { }

	public CoffeeGenerator(int size) {
		this.size = size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T next() {
		try {
			return (T) types[rand.nextInt(types.length)].newInstance();
		} catch (Exception exception) {
			throw new RuntimeException();
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new CoffeeIterator();
	}

	class CoffeeIterator implements Iterator<T> {
		
		private int count = size;

		@Override
		public boolean hasNext() {
			return count > 0;
		}

		@Override
		public T next() {
			count--;
			return CoffeeGenerator.this.next();
		}
		
	}
	
	public static void main(String[] args) {
		CoffeeGenerator<Coffee> cg = new CoffeeGenerator<Coffee>();
		for (int i = 0; i < 5; i++)
			System.out.println(cg.next());
		for (Coffee coffee : new CoffeeGenerator<Coffee>(5))
			System.out.println(coffee);
	}

}/* Output:
Americano 0
Latte 1
Americano 2
Mocha 3
Mocha 4
Breve 5
Americano 6
Latte 7
Cappuccino 8
Cappuccino 9
*///:~
