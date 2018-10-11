package holding;
//: holding/MultiIterableClass.java
// Adding several Adapter Method.
// 添加几个适配器方法

import java.util.*;

public class MultiIterableClass extends IterableClass {
	
	public Iterable<String> reversed() {
		return new Iterable<String>() {

			@Override
			public Iterator<String> iterator() {
				return new Iterator<String>() {

					private int current = words.length - 1;

					@Override
					public boolean hasNext() { return current > -1; }

					@Override
					public String next() { return words[current--]; }
					
				};
			}
			
		};
	}
	
	public Iterable<String> randomized() {
		return new Iterable<String>() {

			@Override
			public Iterator<String> iterator() {
				List<String> suffled = 
						new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(suffled, new Random(47));
				return suffled.iterator();
			}
			
		};
	}
	
	public static void main(String[] args) {
		MultiIterableClass mic = new MultiIterableClass();
		for (String s : mic.reversed())
			System.out.print(s + " ");
		System.out.println();
		for (String s : mic.randomized())
			System.out.print(s + " ");
		System.out.println();
		for (String s : mic)
			System.out.print(s + " ");
	}
	
}/*Output:
banana-shaped. be to Earth the know we how is that And 
is banana-shaped. Earth that how the be And we know to 
And that is how we know the Earth to be banana-shaped. 
*///:~
