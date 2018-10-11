package holding;
//: holding/AdapterMethodIdiom.java
// The "Adapter Method" idiom allows you to use foreach
// with additional kinds of Iterables.
// “适配器方法”这个习语允许您使用其他类型的迭代器来使用

import java.util.*;

class ReversibleArrayList<T> extends ArrayList<T> {
	
	private static final long serialVersionUID = 1L;

	public ReversibleArrayList(Collection<T> c) { super(c); }
	
	public Iterable<T> reversed(){
		return new Iterable<T>() {

			@Override
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					
					private int current = size() - 1;

					@Override
					public boolean hasNext() { return current > -1; }

					@Override
					public T next() { return get(current--); }
					
					public void remove() {
						throw new UnsupportedOperationException();
					}
					
				};
			}
			
		};
	}
	
}

public class AdapterMethodIdiom {

	public static void main(String[] args) {
		ReversibleArrayList<String> ral = 
				new ReversibleArrayList<String>(
				Arrays.asList("To be or not to be".split(" ")));
		
		// Grabs the ordinary iterator via iterator():
		// 通过iterator()获取普通的迭代器:
		for (String s : ral)
			System.out.print(s + " ");
		System.out.println();
		
		// Hand it the Iterable of you choice:
		// 把它交给你选择
		for (String s : ral.reversed()) 
			System.out.print(s + " ");
	}
	
}/*Output:
To be or not to be 
be to not or be To 
*///:~
