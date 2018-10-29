package generics;
//: generics/TupleList.java
// Combining generic types to make complex generic types.
// 组合泛型类型来创建复杂的泛型类型.

import java.util.*;
import util.*;

@SuppressWarnings("serial")
public class TupleList<First, Second, Third, Fourth>
extends ArrayList<FourTuple<First, Second, Third, Fourth>> {

	public static void main(String[] args) {
		TupleList<Vehicle, Amphibian, String, Integer> t1 = 
		  new TupleList<Vehicle, Amphibian, String, Integer>();
		t1.add(TupleTest.h());
		t1.add(TupleTest.h());
		for (FourTuple<Vehicle, Amphibian, String, Integer> tuple : t1)
			System.out.println(tuple);
	}

}/* Output:
(generics.Vehicle@15db9742, generics.Amphibian@6d06d69c, hi, 47)
(generics.Vehicle@7852e922, generics.Amphibian@4e25154f, hi, 47)
*///;~
