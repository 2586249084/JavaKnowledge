package exceptions;
//: exceptions/Human.java
// Catching exception hierarchies.
// 捕捉异常层次结构

@SuppressWarnings("serial")
class Annoyance extends Exception {}

@SuppressWarnings("serial")
class Sneeze extends Annoyance {}

public class Human {

	public static void main(String[] args) {
		// Catch the exact type:
		// 捕捉准确的类型
		try {
			throw new Sneeze();
		} catch(Sneeze s) {
			System.out.println("Catch Sneeze");
		} catch(@SuppressWarnings("hiding") Annoyance a) {
			System.out.println("Catch Annoyance");
		}
		
		// Catch the base type:
		// 捕获基本类型
		try {
			throw new Sneeze();
		} catch(Annoyance a) {
			System.out.println("Catch Annoyance");
		}
	}

}/*Output:
Catch Sneeze
Catch Annoyance
*///:~
