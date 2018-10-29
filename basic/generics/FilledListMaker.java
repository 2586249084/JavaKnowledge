package generics;
//: generics/FilledListMaker.java

import java.util.*;

public class FilledListMaker<T> {

	List<T> create(T t, int size) {
		List<T> result = new ArrayList<T>();
		for (int i = 0; i < size; i++)
			result.add(t);
		return result;
	}
	
	public static void main(String[] args) {
		FilledListMaker<String> stringMaker = 
		  new FilledListMaker<String>();
		List<String> stringList = stringMaker.create("hello", 4);
		System.out.println(stringList);
	}

}/* Output:
[hello, hello, hello, hello]
*///;~
