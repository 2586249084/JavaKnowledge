package interfaces.interfaceprocessor;
//: interfaces/interfaceprocessor/FilterProcessor.java

import interfaces.filters.*;

class FilterAdapter implements Processor {
	Filter filter;
	
	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}
	
	public String name() { return filter.name(); }
	
	public Wavefrom process(Object input) {
		return filter.process((Wavefrom)input);
	}
}

public class FilterProcessor {
	public static void main(String[] args) {
		Wavefrom w = new Wavefrom();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
	}
}/*Output:
Using processor LowPass
Wavefrom 0
Using processor HighPass
Wavefrom 0
Using processor BandPass
Wavefrom 0
*/
