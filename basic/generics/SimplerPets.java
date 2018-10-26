package generics;
//: generics/SimplerPets.java

import java.util.*;
import typeinfo.pets.*;
import util.*;

public class SimplerPets {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Map<Person, List<? extends Pet>> petPeople = New.map();
		// Rest of the code is the same...
		// 代码的其余部分是相同的...
	}

} ///:~
