package generics;
//: generics/CaptureConversion.java

public class CaptureConversion {

	static <T> void f1(Holder<T> holder) {
		T t = holder.get();
		System.out.println(t.getClass().getSimpleName());
	}
	
	static void f2(Holder<?> holder) {
		f1(holder);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Holder raw = new Holder<Integer>(1);
		// f1(raw); // Produces warnings 产生警告
		f2(raw);
		Holder rawBasic = new Holder();
		rawBasic.set(new Object()); // Warning
		f2(rawBasic); // No warning
		
		// Upcast to Holder<?>, still figures it out:
		// 向上的Holder< ?>，还是算出来的:
		Holder<?> wildcarded = new Holder<Double>(1.0);
		f2(wildcarded);
	}

}/* Output:
Integer
Object
Double
*///:~
