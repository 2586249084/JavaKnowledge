package strings;
//: strings/SimpleRead.java

import java.io.*;

public class SimpleRead {

	public static BufferedReader input = new BufferedReader(
			new StringReader("Sir Robin of Camelot\n22 1.164679"));
	
	public static void main(String[] args) {
		try {
			System.out.println("What is your name?");
			String name = input.readLine();
			System.out.println(name);
			System.out.println("How old are you? What is your favorite double?");
			System.out.println("(input: <age> <double)");
			String numbers = input.readLine();
			System.out.println(numbers);
			String[] numArray = numbers.split(" ");
			int age = Integer.parseInt(numArray[0]);
			double favorite = Double.parseDouble(numArray[1]);
			System.out.format("Hi %s. \n", name);
			System.out.format("In 5 yeras you will be %d. \n", age + 5);
			System.out.format("My favorite double is %f.", favorite / 2);
		} catch (IOException e) {
			System.out.println("IO exception");
		}
	}

}/*Output:
What is your name?
Sir Robin of Camelot
How old are you? What is your favorite double?
(input: <age> <double)
22 1.164679
Hi Sir Robin of Camelot. 
In 5 yeras you will be 27. 
My favorite double is 0.582340.
*///:~
