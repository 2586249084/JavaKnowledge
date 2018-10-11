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
		int i = name.compareTo(another.name()); // �Ƚ������ַ���
		if (i == 0) // �������һ����������Ƚ�ID
			return id - another.id();
		else // ���ȱȽ����֣�������ֲ�һ�£��򷵻رȽϽ��
			return i;
	}
}
