package typeinfo.pets;
//: typeinfo/pets/Individual.java

public class Individual {
	
	private static int count;
	private int id = count++;
	private String name = "Default";
	
	Individual(String name) {
		this.name = name;
	}
	
	Individual() {}
	
	public int id() { return id; }
	
	public String toString() { 
		return  this.getClass().getSimpleName() + " " +name; 
	}
}
