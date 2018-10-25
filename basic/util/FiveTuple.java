package util;
//: util/FiveTuple.java

public class FiveTuple<First, Second, Third, Fourth, Fifth> 
extends FourTuple<First, Second, Third, Fourth> {
	
	public final Fifth fifth;

	public FiveTuple(First first, Second second, Third third,
			Fourth fourth, Fifth fifth) {
		super(first, second, third, fourth);
		this.fifth = fifth;
	}
	
	public String toString() {
		return "(" + first + ", " + second + ", " + third + ", " 
				+ fourth + ", " + fifth + ")";
	}

} ///:~
