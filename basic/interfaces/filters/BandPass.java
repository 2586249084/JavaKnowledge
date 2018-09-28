package interfaces.filters;
//: interfaces/filters/BandPass.java

public class BandPass extends Filter{
	double lowCutoff, highCutoff;
	public BandPass (double lowCutoff, double highCutoff) {
		this.highCutoff = highCutoff;
		this.lowCutoff = lowCutoff;
	}
	public Wavefrom process(Wavefrom input) { return input; }
}
