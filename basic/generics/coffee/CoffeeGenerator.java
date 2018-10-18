package generics.coffee;
// fenerics/coffee/CoffeeGenerator.java
// Generate different types of Coffee:
// 产生不同类型的咖啡:

import java.util.*;
import util.*;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

	@SuppressWarnings("rawtypes")
	private Class[] types = { Latte.class, Mocha.class,
			Cappuccino.class, Americano.class, Breve.class };

	private static Random rand = new Random(47);

	public CoffeeGenerator() { }

	private int size = 0;

	public CoffeeGenerator(int size) {
		this.size = size;
	}

	@Override
	public Coffee next() {
		try {
			return (Coffee) types[rand.nextInt(types.length)].newInstance();
			// Report programmer errors at run time:
			// 在运行时报告程序员错误:
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}
	
	class CoffeeIterator implements Iterator<Coffee> {
		
		int count = size;

		@Override
		public boolean hasNext() {
			return count > 0;
		}

		@Override
		public Coffee next() {
			count--;
			return CoffeeGenerator.this.next();
		}
		
	}

	@Override
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}

}
