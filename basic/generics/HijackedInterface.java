package generics;
//: generics/HijackedInterface.java

/*class Cat extends ComparablePet implements Comparable<Cat> {
	// Error: Comparable cannot be inherited with
	// different argument: <Cat> and <Pet>
	public int compareTo(Cat o) {
		return 0;
	}
} ///:~
*/