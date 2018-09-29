package innerclasses;
//: innerclasses/Parcel2.java
// Returning a reference to an inner class.
// 返回对内部类的引用

public class Parcel2 {
	class Contents {
		private int i = 11;
		public int value() { return i; }
	}
	
	class Destination {
		private String label;
		Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel() { return label; }
	}
	
	public Destination to(String s) {
		return new Destination(s);
	}
	
	public Contents contents() {
		return new Contents();
	}
	
	public void ship(String dest) {
		Contents c = contents();
		Destination d = to(dest);
		System.out.println("Destination.readLabel() : " + d.readLabel());
		System.out.println("Contents.value() : " + c.value());
	}
	
	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.ship("Tasmania");
		
		Parcel2 q = new Parcel2();
		// Defining references to inner classes:
		// 定义对内部类的引用
		Parcel2.Contents c = q.contents();
		Parcel2.Destination d = q.to("Borneo");
		System.out.println("Destination.readLabel() : " + d.readLabel());
		System.out.println("Contents.value() : " + c.value());
	}
}/*Output:
Destination.readLabel() : Tasmania
Contents.value() : 11
Destination.readLabel() : Borneo
Contents.value() : 11
*/
