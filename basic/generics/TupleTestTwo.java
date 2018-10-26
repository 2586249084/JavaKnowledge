package generics;
//: generics/TupleTestTwo.java

import util.*;
import static util.Tuple.*;

public class TupleTestTwo {

	static TwoTuple<String, Integer> f(){
		return tuple("hi", 47);
	}
	
	@SuppressWarnings("rawtypes")
	static TwoTuple f2() { return tuple("hi", 47); }
	
	static ThreeTuple<Amphibian, String, Integer> g() {
		return tuple(new Amphibian(), "hi", 47);
	}
	
	static FourTuple<Vehicle, Amphibian, String, Integer> h() {
		return tuple(new Vehicle(), new Amphibian(), "hi", 47);
	}
	
	static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
		return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
	}
	
	public static void main(String[] args) {
		TwoTuple<String, Integer> twoTuple = f();
		System.out.println(twoTuple);
		System.out.println(f2());
		System.out.println(g());
		System.out.println(h());
		System.out.println(k());
	}

}/* Output:
(hi, 47)
(hi, 47)
(generics.Amphibian@15db9742, hi, 47)
(generics.Vehicle@6d06d69c, generics.Amphibian@7852e922, hi, 47)
(generics.Vehicle@4e25154f, generics.Amphibian@70dea4e, hi, 47, 11.1)
*///:~
