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
		oldStyleMethod(dogs1); // Quietly accepts a Cat ���ĵؽ���һֻè
		List<Dog> dogs2 = Collections.checkedList(
		  new ArrayList<Dog>(), Dog.class);
		try {
			oldStyleMethod(dogs2); // Throws an exception �׳�һ���쳣
		} catch (Exception exception) {
			System.out.println(exception);
		}
		
		// Derived types work fine:
		// �������͹����úܺ�:
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
