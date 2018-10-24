package typeinfo;
//: typeinfo/Person.java

// A class with a Null Object.
// 带有空对象的类.

import util.*;

public class Person {

	public final String first;

	public final String last;

	public final String address;

	// etc.
	public Person(String first, String last, String address) {
		this.first = first;
		this.last = last;
		this.address = address;
	}

	public String toString() {
		return "Person : " + first + " " + last + " " + address;
	}

	public static class NullPerson extends Person implements Null {

		public NullPerson() {
			super("None", "None", "None");
		}

		public String toString() { return "NullPerson"; }
		
	}
	
	public static final Person NULL = new NullPerson();

}/*
*///:~
