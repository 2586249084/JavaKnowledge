package generics;
//: generics/Manipulation.java

class Manipulator<T> {
	
	@SuppressWarnings("unused")
	private T obj;
	
	public Manipulator(T x) { obj = x; }
	
	// Error: cannot find symbol: method f():
	// 错误:找不到符号:方法f():
	public void manipulate() { 
		//! obj.f(); 
	}
	
}

//: generics/ManipulatorTwo.java

class ManipulatorTwo<T extends HasF> {
	
	private T obj;
	
	public ManipulatorTwo(T x) { obj = x; }
	
	public void manipulate() { obj.f(); }
	
}

//: generics/ManipulatorThree.java

class ManipulatorThree {
	
	private HasF obj;
	
	public ManipulatorThree(HasF x) { obj = x; }
	
	public void manipulate() { obj.f(); }
	
}

//: generics/ReturnGenericType.java

class ReturnGenericType<T extends HasF> {
	
	private T obj;
	
	public ReturnGenericType(T x) { obj = x; }
	
	public T get() { return obj; }
	
}

public class Manipulation {

	public static void main(String[] args) {
		HasF hf = new HasF();
		Manipulator<HasF> manipulator = 
				new Manipulator<HasF>(hf);
		manipulator.manipulate();
	}

} ///:~
