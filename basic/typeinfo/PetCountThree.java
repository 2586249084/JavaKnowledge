package typeinfo;
//: typeinfo/PetCountThree.java
// Using isInstance()

import java.util.*;
import typeinfo.pets.*;
import static util.Print.*;
import util.*;

public class PetCountThree {

	@SuppressWarnings("serial")
	static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
		
		public PetCounter() {
			super(MapData.map(LiteralPetCreator.allTypes, 0));
		}
		
		public void count(Pet pet) {
			// Class.isInstance() eliminates instanceofs:
			for (Map.Entry<Class<? extends Pet>, Integer> entry : entrySet())
				if (entry.getKey().isInstance(pet))
					put(entry.getKey(), entry.getValue() + 1);
		}
		
		public String toString() {
			StringBuilder result = new StringBuilder("{");
			for (Map.Entry<Class<? extends Pet>, Integer> entry : entrySet()) {
				result.append(entry.getKey().getSimpleName());
				result.append("=");
				result.append(entry.getValue());
				result.append(", ");
			}
			result.delete(result.length() - 2, result.length());
			result.append("}");
			return result.toString();
		}
		
	}
	
	public static void main(String[] args) {
		PetCounter petCount = new PetCounter();
		for (Pet pet : Pets.createArray(20)) {
			print(pet.getClass().getSimpleName() + " ");
			petCount.count(pet);
		}
		println();
		println(petCount);
	}

}
