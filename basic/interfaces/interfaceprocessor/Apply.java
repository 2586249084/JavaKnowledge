package interfaces.interfaceprocessor;
//: interfaces/interfaceprocessor/Apply.java

import static util.Print.*;

public class Apply {
	public static void process(Processor p, Object input) {
		println("Using processor " + p.name());
		println(p.process(input));
	}
}
