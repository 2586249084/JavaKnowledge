package generics;
//: generics/CheckedList.java
// Using Collection.checkedList().

import typeinfo.pets.*;
import java.util.*;

public class CheckedList {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static void oldStyleMethod(List probablyDogs) {
		probablyDogs.add(new Cat());
	}

	public static void main(String[] args) {
		List<Dog> dogs1 = new ArrayList<Dog>();
		oldStyleMethod(dogs1); // Quietly accepts a Cat 悄悄地接受一只猫
		List<Dog> dogs2 = Collections.checkedList(
		  new ArrayList<Dog>(), Dog.class);
		try {
			oldStyleMethod(dogs2); // Throws an exception 抛出一个异常
		} catch (Exception exception) {
			System.out.println(exception);
		}
		
		// Derived types work fine:
		// 派生类型工作得很好:
		List<Pet> pets = Collections.checkedList(
		  new ArrayList<Pet>(), Pet.class);
		pets.add(new Dog());
		pets.add(new Cat());
	}

}/* Output:
java.lang.ClassCastException: Attempt to insert class 
typeinfo.pets.Cat element into collection with element 
type class typeinfo.pets.Dog
*///:~
