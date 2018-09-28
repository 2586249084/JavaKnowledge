package interfaces.filters;
//: interfaces/filters/Filter.java

public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}
	
	public Wavefrom process(Wavefrom input) { return input; }
}
