package reusing.exercise;
//: reusing/ReusingEx1.java

import static util.Print.*;

class Engine{
	private String s;
	
	Engine() {
		println("Engine()");
		s = "Constructor";
	}
	
	public String toString() {
		return s;
	}
}

public class ReusingEx1 {
	private String name, word, special;
	private Engine e;
	
	public ReusingEx1() {
		println("Inside Constructor");
		name = "’≈≈Ù";
		word = "Hello";
		special = "High";
		e = new Engine();
	}
	
	public String toString() {
		return
		  "name = " + name + "\n" + 
		  "word = " + word + "\n" +
		  "special = " + special + "\n" +
		  "e = " + e;
	}
	
	public static void main(String[] args) {
		ReusingEx1 re = new ReusingEx1();
		println(re);
	}
}
