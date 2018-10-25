package util;
//: util/FourTuple.java

public class FourTuple<First, Second, Third, Fourth> 
extends ThreeTuple<First, Second, Third> {
	
	public final Fourth fourth;
	
	public FourTuple(First first, Second second, Third third, Fourth fourth) {
		super(first, second, third);
		this.fourth = fourth;
	}
	
	public String toString() {
		return "(" + first + ", " + second + ", " + third + ", " + fourth + ")";
	}

} ///:~
