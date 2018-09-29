package innerclasses;
//: innerclasses/Parcel1.java
// Creating inner classes.
// 创建内部类

public class Parcel1 {
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
	
	// Using inner classes looks just like
	// using any other class, within Parcel1:
	// 使用内部类看起来就像在Parcel1中使用任何其他类一样
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println("Destination.readLabel() : " + d.readLabel());
		System.out.println("Contents.value() : " + c.value());
	}
	
	public static void main(String[] args) {
		Parcel1 p = new Parcel1();
		p.ship("Tasmania");
	}
}/*Output:
Destination.readLabel() : Tasmania
Contents.value() : 11
*/
