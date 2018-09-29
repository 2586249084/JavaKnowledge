package innerclasses;
//: innerclasses/Parcel7.java
// Returning an instance of an anonymous inner class.
// 返回一个匿名内部类的实例

public class Parcel7 {
	public Contents contents() {
		return new Contents() { // Insert a class definition:插入一个类定义
			private int i = 11;
			public int value() { return i; }
		}; // Semicolon required in this case:在这种情况下需要分号
	}
	
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
		System.out.println(c.value());
	}
}/*Output:
11
*///:~
