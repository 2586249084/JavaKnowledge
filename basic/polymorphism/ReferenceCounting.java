package polymorphism;
//: polymorphism/ReferenceCounting.java
// Cleaning up shared member objects.
// 清理共享成员对象

import static util.Print.*;

class Shared {
	private int refCount = 0;
	private static long counter = 0;
	private final long id = counter++;
	
	public Shared() {
		println("Creating " + this);
	}
	
	public void addRef() {
		refCount++;
	}
	
	protected void dispose() {
		if (--refCount == 0) {
			println("Disposing " + this);
		}
	}
	
	public String toString() {
		return "Shared " + id;
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	
	public Composing(Shared shared) {
		println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	
	protected void dispose() {
		println("disposing " + this);
		shared.dispose();
	}
	
	public String toString() {
		return "Composing " + id;
	}
}

public class ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = {
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
		};
		for (Composing c : composing)
			c.dispose();
	}
}/*Output:
Creating Shared 0
Creating Composing 0
Creating Composing 1
Creating Composing 2
Creating Composing 3
Creating Composing 4
disposing Composing 0
disposing Composing 1
disposing Composing 2
disposing Composing 3
disposing Composing 4
Disposing Shared 0
*/
