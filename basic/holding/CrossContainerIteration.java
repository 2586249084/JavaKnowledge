package holding;
//: holding/CrossContainerIteration.java

import typeinfo.pets.*;
import java.util.*;

public class CrossContainerIteration {
	
	public static void display(Iterator<Pet> it) {
		while(it.hasNext()) {
			Pet pet = it.next();
			System.out.print(pet.id() + " : " + pet + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList<Pet> pets = Pets.arrayList(8);
		LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
		HashSet<Pet> petsHS = new HashSet<Pet>(pets);
		TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);
		display(pets.iterator());
		display(petsLL.iterator());
		display(petsHS.iterator());
		display(petsTS.iterator());
	}
	
}/*Output:
0 : Rat Default 1 : Manx Default 2 : Cymric Default 3 : Mutt Default 4 : Pug Default 5 : Cymric Default 6 : Pug Default 7 : Manx Default 
0 : Rat Default 1 : Manx Default 2 : Cymric Default 3 : Mutt Default 4 : Pug Default 5 : Cymric Default 6 : Pug Default 7 : Manx Default 
2 : Cymric Default 3 : Mutt Default 1 : Manx Default 6 : Pug Default 5 : Cymric Default 0 : Rat Default 7 : Manx Default 4 : Pug Default 
0 : Rat Default 1 : Manx Default 2 : Cymric Default 3 : Mutt Default 4 : Pug Default 5 : Cymric Default 6 : Pug Default 7 : Manx Default 
*///:~
