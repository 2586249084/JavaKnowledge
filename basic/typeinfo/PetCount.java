package typeinfo;
//: typeinfo/PetCount.java
// Using instanceof.
// ʹ��instanceof.

import java.util.*;
import typeinfo.pets.*;
import static util.Print.*;

public class PetCount {
	
	@SuppressWarnings("serial")
	static class PetCounter extends HashMap<String, Integer> {
		
		public void count(String type) {
			Integer quantity = get(type);
			if (quantity == null)
				put(type, 1);
			else
				put(type, quantity + 1);
		}
		
	}
	
	public static void countPets(PetCreator creator) {
		PetCounter counter = new PetCounter();
		for (Pet pet : creator.createArray(20)) {
			if (pet instanceof Pet)
				counter.count("Pet");
			if (pet instanceof Dog)
				counter.count("Dog");
			if (pet instanceof Mutt)
				counter.count("Mutt");
			if (pet instanceof Pug)
				counter.count("Pug");
			if (pet instanceof Cat)
				counter.count("Cat");
			if (pet instanceof Manx)
				counter.count("Manx");
			if (pet instanceof Cymric)
				counter.count("Cymric");
			if (pet instanceof Rodent)
				counter.count("Rodent");
			if (pet instanceof Rat)
				counter.count("Rat");
			if (pet instanceof Mouse)
				counter.count("Mouse");
			if (pet instanceof Hamster)
				counter.count("Hamster");
		}
		println(counter);
	}
	
	public static void main(String[] args) {
		countPets(new ForNameCreator());
	}
	
}/*Output:
{Pug=3, Rat=2, Cymric=5, Mouse=2, Cat=9, Manx=7, Rodent=5, Mutt=3, Dog=6, Pet=20, Hamster=1}
*///:~
