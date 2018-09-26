package reusing;
//: reusing/PlaceSetting.java
// Combining composition & inheritance
// 组合与继承相结合

import static util.Print.*;

class Plate{
	Plate(int i) {
		println("Plate constructor");
	}
}

class DinnerPlate extends Plate{
	DinnerPlate(int i) {
		super(i);
		println("DinnerPlate constructor");
	}
}

class Utensil{
	Utensil(int i) {
		println("Utensil constructor");
	}
}

class Spoon extends Utensil{
	Spoon(int i) {
		super(i);
		println("Spoon constructor");
	}
}

class Fork extends Utensil{
	Fork(int i) {
		super(i);
		println("Fork constructor");
	}
}

class Knife extends Utensil{
	Knife(int i) {
		super(i);
		println("Knife constructor");
	}
}

// A cultural way of doing something:
// 一种文化的做事方式
class Custom{
	Custom(int i) {
		println("Custom constructor");
	}
}

public class PlaceSetting extends Custom {
	@SuppressWarnings("unused")
	private Spoon sp;
	@SuppressWarnings("unused")
	private Fork frk;
	@SuppressWarnings("unused")
	private Knife kn;
	@SuppressWarnings("unused")
	private DinnerPlate pl;
	
	public PlaceSetting(int i) {
		super(i + 1);
		sp = new Spoon(i + 2);
		frk = new Fork(i + 3);
		kn = new Knife(i + 4);
		pl = new DinnerPlate(i + 5);
		println("PlaceSetting constructor");
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		PlaceSetting x = new PlaceSetting(9);
	}
}
