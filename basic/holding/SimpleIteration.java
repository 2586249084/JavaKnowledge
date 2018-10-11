package holding;
// holding/SimpleIteration.java

import typeinfo.pets.*;
import java.util.*;

public class SimpleIteration {
	
	public static void main(String[] args) {
		List<Pet> pets = Pets.arrayList(12);
		Iterator<Pet> it = pets.iterator();
		while(it.hasNext()) {
			Pet p = it.next();
			System.out.print(p.id() + " : " + p + " ");
		}
		System.out.println();
		
		// A simple approach, when possible:
		// 一种简单的方法，在可能的情况下:
		for (Pet pet : pets)
			System.out.print(pet.id() + " : " + pet + " ");
		System.out.println();
		
		// An Iterator can also remove elements:
		// 迭代器也可以删除元素:
		it = pets.iterator();
		for (int i = 0; i < 6; i++) {
			it.next();
			it.remove();
		}
		System.out.println(pets);
	}
	
}/*Output:
0 : Rat Default 1 : Manx Default 2 : Cymric Default 3 : Mutt Default 4 : Pug Default 5 : Cymric Default 6 : Pug Default 
7 : Manx Default 8 : Cymric Default 9 : Rat Default 10 : EgyptianMau Default 11 : Hamster Default 
0 : Rat Default 1 : Manx Default 2 : Cymric Default 3 : Mutt Default 4 : Pug Default 5 : Cymric Default 6 : Pug Default 
7 : Manx Default 8 : Cymric Default 9 : Rat Default 10 : EgyptianMau Default 11 : Hamster Default 
[Pug Default, Manx Default, Cymric Default, Rat Default, EgyptianMau Default, Hamster Default]
*///:~
