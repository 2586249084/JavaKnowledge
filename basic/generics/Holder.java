package generics;
//: generics/Holder.java

public class Holder<T> {
	
	private T value;

	public Holder() { }

	public Holder(T value) { this.value = value; }
	
	public void set(T value) { this.value = value; }
	
	public T get() { return value; }
	
	@Override
	public boolean equals(Object obj) {
		return value.equals(obj);
	}

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Holder<Apple> apple = new Holder<Apple>(new Apple());
		Apple d = apple.get();
		apple.set(d);
		
		// Cannot upcast:
		// 不能向上转型
		//! Holder<Fruit> fruit = apple;
		
		// OK
		Holder<? extends Fruit> fruit = apple;
		Fruit p = fruit.get();
		
		// Return 'Object':
		// 返回Object:
		d = (Apple) fruit.get();
		
		try {
			// No warning
			// 无警告
			Orange c = (Orange)fruit.get();
			System.out.println(c);
		} catch (Exception exception) {
			System.out.println(exception);
		}
		
		// Cannot call set()
		// 不能调用set()
		//! fruit.set(new Apple());
		//! fruit.set(new Fruit());
		
		// OK
		System.out.println("fruit.equals(d) : " + fruit.equals(d));
		System.out.println("fruit.equals(p) : " + fruit.equals(p));
	}

}/* Output:
java.lang.ClassCastException: generics.Apple cannot be cast to generics.Orange
fruit.equals(d) : true
fruit.equals(p) : true
*///:~
