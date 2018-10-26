package generics;
//: generics/ExplicitTypeSpecification.java

import java.util.*;
import typeinfo.pets.*;
import util.*;

public class ExplicitTypeSpecification {

	static void f(Map<Person, List<Pet>> petPeople) { }

	public static void main(String[] args) {
		f(New.<Person, List<Pet>>map());
	}

} ///:~
