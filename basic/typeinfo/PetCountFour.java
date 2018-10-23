package typeinfo;
//: typeinfo/PetCountFour.java

import typeinfo.pets.*;
import util.*;
import static util.Print.*;

public class PetCountFour {
	
	public static void main(String[] args) {
		TypeCounter counter = new TypeCounter(Pet.class);
		for (Pet pet : Pets.createArray(20)) {
			print(pet.getClass().getSimpleName() + " ");
			counter.count(pet);
		}
		println();
		println(counter);
	}
	
}/*Output:
Rat Manx Cymric Mutt Pug Cymric Pug Manx Cymric Rat 
EgyptianMau Hamster EgyptianMau Mutt Mutt Cymric Mouse Pug Mouse Cymric 

{Manx=7, Cat=9, Individual=20, Hamster=1, Mutt=3, Pet=20, 
Pug=3, Rodent=5, EgyptianMau=2, Mouse=2, Dog=6, Rat=2, Cymric=5}
*///:~
