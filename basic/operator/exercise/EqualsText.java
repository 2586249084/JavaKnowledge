package operator.exercise;

class Dog{
	String name;
	String says;
}

public class EqualsText {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d1.name = "spot";
		d1.says = "它的叫声Ruff!";
		d2.name = "scruffy";
		d2.says = "它的叫声Wurf!";
		Dog d3 = new Dog();
		d3 = d1;
		System.out.println(d1 == d2);
		System.out.println(d1 == d3);
		System.out.println(d2 == d3);
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		System.out.println(d2.equals(d3));
	}
}
