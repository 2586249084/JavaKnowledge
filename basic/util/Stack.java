package util;
//: util/Stack.java
// Making a stack from a LinkedList.
// 从一个LinkedList中创建一个堆栈

import java.util.*;

public class Stack<T> {
	private LinkedList<T> storge = new LinkedList<T>();
	public void push(T v) { storge.addFirst(v); }
	public T peek() { return storge.getFirst(); }
	public T pop() { return storge.removeFirst(); }
	public boolean empty() { return storge.isEmpty(); }
	public String toString() { return storge.toString(); }
}
