package innerclasses;
//: innerclasses/Parcel11.java
// Nested classes (static inner class)
// Ƕ����(��̬�ڲ���)

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
		// Ƕ������԰���������̬Ԫ��:
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