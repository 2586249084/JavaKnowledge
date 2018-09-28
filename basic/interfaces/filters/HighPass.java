package interfaces.filters;
//: interfaces/filters/HighPass.java

public class HighPass extends Filter {
	double cutoff;
	public HighPass(double cutoff) { this.cutoff = cutoff; }
	public Wavefrom process(Wavefrom input) { return input; }
}
