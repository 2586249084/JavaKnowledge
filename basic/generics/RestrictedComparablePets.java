package generics;
//: generics/RestrictedComparablePets.java

class Hamster extends ComparablePet implements Comparable<ComparablePet> {

	@Override
	public int compareTo(ComparablePet arg) {
		return 0;
	}
	
}

// Or just:

class Gecko extends ComparablePet {
	
	@Override
	public int compareTo(ComparablePet arg) {
		return 0;
	}
	
} ///:~
