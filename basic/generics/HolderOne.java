package generics;
//: generics/ HolderOne.java

class Automobile { }

public class HolderOne {
	
	private Automobile a;
	
	public HolderOne(Automobile a) { this.a = a; }
	
	Automobile get() { return a; }
	
}
