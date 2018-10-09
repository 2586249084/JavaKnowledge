package holding;
//: holding/StackCollision.java

import java.util.*;

public class StackCollision {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for(String s : "My dog has fleas".split(" "))
			stack.push(s);
		while(!stack.empty())
			System.out.print(stack.pop() + " ");
	}	
}/*Output:
fleas has dog My 
*///:~
