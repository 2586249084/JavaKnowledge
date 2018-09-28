package interfaces.filters;
//: interfaces/filters/LowPass.java

public class LowPass extends Filter {
	double cutoff;
	public LowPass(double cutoff) { this.cutoff = cutoff; }
	public Wavefrom process(Wavefrom input) { return input; }
}
