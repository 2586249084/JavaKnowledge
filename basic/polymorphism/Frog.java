package polymorphism;
//: polymorphism/Frog.java
// Cleanup & inheritance
// �����ͼ̳�

import static util.Print.*;

class Characteristic {
	private String s;
	
	Characteristic(String s) {
		this.s = s;
		println("Creating Characteristic " + s);
	}
	
	protected void dispose() {
		println("disposing Characteristic " + s);
	}
}

class Description {
	private String s;
	
	Description(String s){
		this.s = s;
		println("Creating Description " + s);
	}
	
	protected void dispose() {
		println("disposing Description " + s);
	}
}

class LivingCreature {
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("Basic Living Creature");
	
	LivingCreature() {
		println("LivingCreature()");
	}
	
	protected void dispose() {
		println("LivingCreature dispose");
		t.dispose();
		p.dispose();
	}
}

class Animal extends LivingCreature {
	private Characteristic p = new Characteristic("has heart");
	private Description t = new Description("Animal not Vegetable");
	
	Animal() {
		println("Animal()");
	}
	
	protected void dispose() {
		println("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal {
	private Characteristic p = new Characteristic("can live in water");
	private Description t = new Description("Both water and land");
	
	Amphibian() {
		println("Amphibian()");
	}
	
	protected void dispose() {
		println("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

public class Frog extends Amphibian {
	private Characteristic p = new Characteristic("Croaks");
	private Description t = new Description("Eats Bugs");
	
	public Frog() {
		println("Frog()");
	}
	
	protected void dispose() {
		println("Frog dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	
	public static void main(String[] args) {
		Frog frog = new Frog();
		println("Bye!");
		frog.dispose();
	}
}/*Output:
Creating Characteristic is alive
Creating Description Basic Living Creature
LivingCreature()
Creating Characteristic has heart
Creating Description Animal not Vegetable
Animal()
Creating Characteristic can live in water
Creating Description Both water and land
Amphibian()
Creating Characteristic Croaks
Creating Description Eats Bugs
Frog()
Bye!
Frog dispose
disposing Description Eats Bugs
disposing Characteristic Croaks
Amphibian dispose
disposing Description Both water and land
disposing Characteristic can live in water
Animal dispose
disposing Description Animal not Vegetable
disposing Characteristic has heart
LivingCreature dispose
disposing Description Basic Living Creature
disposing Characteristic is alive
*/
