package exceptions;
//: exceptions/MultipleReturns.java

import static util.Print.*;

public class MultipleReturns {
	
	public static void f(int i) {
		println("Initialization that requires cleanup");
		try {
			println("Point 1");
			if (i == 1) return;
			println("Point 2");
			if (i == 2) return;
			println("Point 3");
			if (i == 3) return;
			println("End");
			return;
		} finally {
			println("Performing cleanup");
		}
	}
	
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++)
			f(i);
	}

}/*Output:
Initialization that requires cleanup
Point 1
Performing cleanup
Initialization that requires cleanup
Point 1
Point 2
Performing cleanup
Initialization that requires cleanup
Point 1
Point 2
Point 3
Performing cleanup
Initialization that requires cleanup
Point 1
Point 2
Point 3
End
Performing cleanup
*///:~
