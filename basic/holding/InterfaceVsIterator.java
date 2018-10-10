package holding;
//: holding/InterfaceVsIterator.java

import typeinfo.pets.*;
import java.util.*;
import static util.Print.*;

public class InterfaceVsIterator {

	public static void display(Iterator<Pet> it) {
		while (it.hasNext()) {
			Pet pet = it.next();
			print(pet.id() + " : " + pet + " ");
		}
		println();
	}

	public static void display(Collection<Pet> pets) {
		for (Pet pet : pets)
			print(pet.id() + " : " + pet + " ");
		println();
	}

	public static void main(String[] args) {
		List<Pet> petList = Pets.arrayList(8);
		Set<Pet> petSet = new HashSet<Pet>(petList);
		Map<String, Pet> petMap = new LinkedHashMap<String, Pet>();
		String[] names = ("Ralph, Eric, Robin, Lacey, "
				+ "Brithey, Sam, Spot, Flutty").split(", ");
		for (int i = 0; i < names.length; i++)
			petMap.put(names[i], petList.get(i));
		display(petList);
		display(petSet);
		display(petList.iterator());
		display(petSet.iterator());
		println(petMap);
		println(petMap.keySet());
		display(petMap.values());
		display(petMap.values().iterator());
	}

}/*Output:
0 : Rat Default 1 : Manx Default 2 : Cymric Default 3 : Mutt Default 4 : Pug Default 5 : Cymric Default 6 : Pug Default 7 : Manx Default 
2 : Cymric Default 3 : Mutt Default 1 : Manx Default 6 : Pug Default 5 : Cymric Default 0 : Rat Default 7 : Manx Default 4 : Pug Default 
0 : Rat Default 1 : Manx Default 2 : Cymric Default 3 : Mutt Default 4 : Pug Default 5 : Cymric Default 6 : Pug Default 7 : Manx Default 
2 : Cymric Default 3 : Mutt Default 1 : Manx Default 6 : Pug Default 5 : Cymric Default 0 : Rat Default 7 : Manx Default 4 : Pug Default 
{Ralph=Rat Default, Eric=Manx Default, Robin=Cymric Default, Lacey=Mutt Default, Brithey=Pug Default, Sam=Cymric Default, Spot=Pug Default, Flutty=Manx Default}
[Ralph, Eric, Robin, Lacey, Brithey, Sam, Spot, Flutty]
0 : Rat Default 1 : Manx Default 2 : Cymric Default 3 : Mutt Default 4 : Pug Default 5 : Cymric Default 6 : Pug Default 7 : Manx Default 
0 : Rat Default 1 : Manx Default 2 : Cymric Default 3 : Mutt Default 4 : Pug Default 5 : Cymric Default 6 : Pug Default 7 : Manx Default 
*///:~
