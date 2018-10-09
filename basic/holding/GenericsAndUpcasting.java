package holding;
//: holding/GenericsAndUpcasting.java

import java.util.*;

class GrannySmith extends Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}
class Braeburn extends Apple {}
 
public class GenericsAndUpcasting {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());
		for(Apple apple : apples)
			System.out.println(apple.id() + "\t" + apple);
	}
}/*Output:
0	holding.GrannySmith@7852e922
1	holding.Gala@4e25154f
2	holding.Fuji@70dea4e
3	holding.Braeburn@5c647e05
*///:~
