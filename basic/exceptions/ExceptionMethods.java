package exceptions;
//: exceptions/ExceptionMethods.java
// Demonstrating the Exception Methods.
// 演示例外方法

import static util.Print.*;

public class ExceptionMethods {
	
	public static void main(String[] args) {
		try {
			throw new Exception("My Exception");
		} catch (Exception error) {
			println("Caught Exception");
			println("getMessage() : " + error.getMessage());
			println("getLocalizedMessage() : " + error.getLocalizedMessage());
			println("toString() : " + error.toString());
			print("printStackTrace() : ");
			error.printStackTrace(System.out);
		}
	}
	
}/*Output:
Caught Exception
getMessage() : My Exception
getLocalizedMessage() : My Exception
toString() : java.lang.Exception: My Exception
printStackTrace() : java.lang.Exception: My Exception
	at exceptions.ExceptionMethods.main(ExceptionMethods.java:12)
*///:~
