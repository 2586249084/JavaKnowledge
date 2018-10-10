package holding;
//: holding/MapOfList.java

import typeinfo.pets.*;
import java.util.*;
import static util.Print.*;

public class MapOfList {
	
	public static Map<Person, List<? extends Pet>> 
		petPeople = new HashMap<Person, List<? extends Pet>>();
	
	static {
		petPeople.put(new Person("Dawn"), 
				Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
		petPeople.put(new Person("Kate"), 
				Arrays.asList(new Cat("Shackleton"), 
						new Cat("Elsie May"), new Dog("Margrett")));
		petPeople.put(new Person("Marilyn"), 
				Arrays.asList(
						new Pug("Louie aka Louis Snokeltein Dupree"), 
						new Cat("Stanford aka Stinky el Negro"), 
						new Cat("Pinkola")
						));
		petPeople.put(new Person("Luke"), 
				Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
		petPeople.put(new Person("Isaac"), 
				Arrays.asList(new Rat("Freckly")));
	}
	
	public static void main(String[] args) {
		println("People : " + petPeople.keySet());
		println("Pet : " + petPeople.values());
		for(Person person : petPeople.keySet()) {
			println(person + " has : ");
			for(Pet pet : petPeople.get(person))
				println("\t" + pet);
		}
	}
	
}/*Output:
People : [Person Dawn, Person Luke, Person Isaac, 
	      Person Marilyn, Person Kate]
Pet : [[Cymric Molly, Mutt Spot], 
	   [Rat Fuzzy, Rat Fizzy], 
	   [Rat Freckly], 
	   [Pug Louie aka Louis Snokeltein Dupree, Cat Stanford aka Stinky el Negro, Cat Pinkola], 
	   [Cat Shackleton, Cat Elsie May, Dog Margrett]]
Person Dawn has : 
	Cymric Molly
	Mutt Spot
Person Luke has : 
	Rat Fuzzy
	Rat Fizzy
Person Isaac has : 
	Rat Freckly
Person Marilyn has : 
	Pug Louie aka Louis Snokeltein Dupree
	Cat Stanford aka Stinky el Negro
	Cat Pinkola
Person Kate has : 
	Cat Shackleton
	Cat Elsie May
	Dog Margrett
*///:~
