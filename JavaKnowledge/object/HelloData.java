package object;
//: object/HelloData.java

import java.util.Date;

/** The first Thinking in java example program.
 * Displays a string and today's date
 * @author Bruce Eckel
 * @author Mrzhang
 * @author www.MindView.net
 * @version 4.0
 */
public class HelloData {
	
	/** Entrv point to class & application.
	 * @param args array of string aguments
	 * @throws exceptinos No exceptions thrown
	 */
	public static void main(String[] args) {
		System.out.println("Hello,it's ");
		System.out.println(new Date());
	}
	
}
/* Output: (55% match)
 * 
*///:~