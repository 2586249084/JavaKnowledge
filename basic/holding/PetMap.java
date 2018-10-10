package holding;
//: holding/PetMap.java

import typeinfo.pets.*;
import java.util.*;
import static util.Print.*;

public class PetMap {

	public static void main(String[] args) {
		Map<String, Pet> petMap = new HashMap<String, Pet>();
		petMap.put("My Cat", new Cat("Molly"));
		petMap.put("My Dog", new Dog("Ginger"));
		petMap.put("My Hamster", new Hamster("Bosco"));
		println(petMap);
		Pet dog = petMap.get("My Dog");
		println(dog);
		println(petMap.containsKey("My Dog"));
		println(petMap.containsValue(dog));
	}

}/*Output:
{My Dog=Dog Ginger, My Cat=Cat Molly, My Hamster=Hamster Bosco}
Dog Ginger
true
true
*///:~
