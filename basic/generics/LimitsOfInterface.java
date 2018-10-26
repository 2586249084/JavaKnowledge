package generics;
//: generics/LimitsOfInterface.java

import java.util.*;
import typeinfo.pets.*;

public class LimitsOfInterface {

	static void f(Map<Person, List<? extends Pet>> petPeople) { }
	
	public static void main(String[] args) {
		//! f(New.map()); // Does not compile. // √ª”–±‡“Î
	}

} ///:~
