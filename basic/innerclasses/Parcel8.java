package innerclasses;
//: innerclasses/Parcel8.java
// Calling the base-class constructor.
// 调用基类构造器

public class Parcel8 {
	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
			public int value() {
				return super.value() * 47;
			}
		};
	}
	
	public static void main(String[] args) {
		Parcel8 p = new Parcel8();
		System.out.println(p.wrapping(8).value());
	}
}/*Output:
376
*///:~
