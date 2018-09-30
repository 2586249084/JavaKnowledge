package innerclasses;
//: innerclasses/Parcel9.java
// initialization. A briefer version of Parcel5.java.
// 初始化. 一个简短版本的Parcel5.java

public class Parcel9 {
	// Argument must be final to use inside
	// 在内部使用，参数必须是final的
	// anonymous inner class:
	// 匿名内部类:
	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;
			public String readLabel() { return label; }
		};
	}
	
	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");
		System.out.println(d.readLabel());
	}
}/*Output:
Tasmania
*///:~
