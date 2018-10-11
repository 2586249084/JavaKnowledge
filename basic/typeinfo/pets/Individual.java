package typeinfo.pets;
//: typeinfo/pets/Individual.java

public class Individual  implements Comparable<Pet> {
	
	private static int count;
	private int id = count++;
	private String name = "Default";
	
	Individual(String name) {
		this.name = name;
	}
	
	Individual() {}
	
	public int id() { return id; }
	
	public String name() { return name; }
	
	public String toString() { 
		return  this.getClass().getSimpleName() + " " +name; 
	}

	@Override
	public int compareTo(Pet another) {
		int i = name.compareTo(another.name()); // 比较名字字符串
		if (i == 0) // 如果名字一样，则继续比较ID
			return id - another.id();
		else // 首先比较名字，如果名字不一致，则返回比较结果
			return i;
	}
}
