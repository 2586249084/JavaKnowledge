package generics;
//: generics/ErasureAndInheritance.java

class GenericBase<T> {
	
	private T element;
	
	public void set(T arg) { arg = element; }
	
	public T get() { return element; }
	
}

class DerivedOne<T> extends GenericBase<T> { }

@SuppressWarnings("rawtypes")
class DerivedTwo extends GenericBase { }

//! class DerivedThree extends GenericBase<?> { } 

public class ErasureAndInheritance {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		DerivedTwo d2 = new DerivedTwo();
		Object obj = d2.get();
		d2.set(obj);
	}
	
} ///:~
