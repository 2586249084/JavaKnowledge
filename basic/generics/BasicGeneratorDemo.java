package generics;
//: generics/BasicGeneratorDemo.java

import util.*;

public class BasicGeneratorDemo {

	public static void main(String[] args) {
		Generator<CountedObject> generator = 
				BasicGenerator.create(CountedObject.class);
		for (int i = 0; i < 5; i++)
			System.out.println(generator.next());
	}

}/* Output:
CountedObject 0
CountedObject 1
CountedObject 2
CountedObject 3
CountedObject 4
*///:~
