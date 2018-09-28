package interfaces.classprocessor;
//: interfaces/classprocessor/Apply.java

import java.util.*;
import static util.Print.*;

class Processor {
	public String name() {
		return getClass().getSimpleName();
	}
	
	Object process(Object input) { return input; }
}

class Upcase extends Processor {
	String process(Object input) { // Covariant return 协变回来
		return ((String)input).toUpperCase();
	}
}

class Downcase extends Processor {
	String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class Splitter extends Processor {
	String process(Object input) {
		// The split() argument divides a String into process:
		// split()参数将字符串分成流程
		return Arrays.toString(((String)input).split(" "));
	}
}

public class Apply {
	public static void process(Processor p, Object s) {
		println("Using Process " + p .name());
		println(p.process(s));
	}
	
	public static String s = "Disagressment with beliefs is by definition incorrect";
	
	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
}/*Output:
Using Process Upcase
DISAGRESSMENT WITH BELIEFS IS BY DEFINITION INCORRECT
Using Process Downcase
disagressment with beliefs is by definition incorrect
Using Process Splitter
[Disagressment, with, beliefs, is, by, definition, incorrect]
*/
