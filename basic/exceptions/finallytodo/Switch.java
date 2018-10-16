package exceptions.finallytodo;
//: exceptions/finallytodo/Switch.java

import static util.Print.*;

public class Switch {
	
	private boolean state = false;
	
	public boolean read() { return state; }
	
	public void on() { state = true; println(this); }
	
	public void off() { state = false; println(this); }
	
	public String toString() { return state ? "on" : "off"; }

}
