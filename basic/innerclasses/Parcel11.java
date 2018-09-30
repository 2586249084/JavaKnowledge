package innerclasses;
//: innerclasses/Parcel11.java
// Nested classes (static inner class)
// 嵌套类(静态内部类)

public class Parcel11 {
	private static class ParcelContents implements Contents {
		private int i = 11;
		public int value() { return i; }
	}
	
	protected static class ParcelDestination 
	implements Destination {
		private String label;
		private ParcelDestination(String whereTo) {
			label = whereTo;
		}
		public String readLabel() { return label; }
		
		// Nested classes can contain other static elements:
		// 嵌套类可以包含其他静态元素:
		public static void f() {};
		static int x = 10;
		static class AnotherLevel {
			public static void f() {}
			static int x = 10;
		}
	}
	
	public static Destination destination(String s) {
		return new ParcelDestination(s);
	}
	
	public static Contents contents() {
		return new ParcelContents();
	}
	
	public static void main(String[] args) {
		Contents c = contents();
		Destination d = destination("Tasmania");
		System.out.println(c.value());
		System.out.println(d.readLabel());
	}
}/*Output:
11
Tasmania
*///:~
