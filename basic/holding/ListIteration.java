package holding;
//: holding/ListIteration.java

import typeinfo.pets.*;
import java.util.*;

public class ListIteration {
	
	public static void main(String[] args) {
		List<Pet> pets = Pets.arrayList(8);
		ListIterator<Pet> it = pets.listIterator();
		while(it.hasNext()) 
			System.out.print(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + "; ");
		System.out.println();
		// Backwards:
		// ÄæÏò:
		while(it.hasPrevious())
			System.out.print(it.previous().id() + " ");
		System.out.println();
		System.out.println(pets);
		it = pets.listIterator(3);
		while(it.hasNext()) {
			it.next();
			it.set(Pets.randomPet());
		}
		System.out.println(pets);
	}
	
}/*Output:
Rat Default, 1, 0; Manx Default, 2, 1; Cymric Default, 3, 2; Mutt Default, 4, 3; Pug Default, 5, 4;
 Cymric Default, 6, 5; Pug Default, 7, 6; Manx Default, 8, 7; 
7 6 5 4 3 2 1 0 
[Rat Default, Manx Default, Cymric Default, Mutt Default, Pug Default, Cymric Default, Pug Default, Manx Default]
[Rat Default, Manx Default, Cymric Default, Cymric Default, Rat Default, EgyptianMau Default, Hamster Default, EgyptianMau Default]
*///:~
