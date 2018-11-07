//: generics/SimpleQueue.java
// 
package generics;

import java.util.*;

public class SimpleQueue<T> implements Iterable<T> {
	
	private LinkedList<T> storage = new LinkedList<T>();
	
	public void add(T t) {
		storage.add(t);
	}
	
	public T get() {
		return storage.poll();
	}

	@Override
	public Iterator<T> iterator() {
		return storage.iterator();
	}

}
