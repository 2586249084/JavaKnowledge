package innerclasses;
//: innerclasses/Parcel7b.java
// Expanded version of Pacel7.java
// ��չ�汾��Pacel7.java

public class Parcel7b {
	class MyContents implements Contents {
		private int i = 11;
		public int value() { return i; }
	}
	
	public Contents contents() { return new MyContents(); }
	
	public static void main(String[] args) {
		Parcel7b p = new Parcel7b();
		Contents c = p.contents();
		System.out.println(c.value());
	}
}/*Output:
11
*///:~
