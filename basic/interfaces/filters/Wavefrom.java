package interfaces.filters;
//: interfaces/filters/Wavefrom.java

public class Wavefrom {
	private static long counter;
	private final long id = counter++;
	public String toString() { return "Wavefrom : " + id; }
}
