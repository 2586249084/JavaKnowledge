package innerclasses;
//: innerclasses/Parcel7.java
// Returning an instance of an anonymous inner class.
// ����һ�������ڲ����ʵ��

public class Parcel7 {
	public Contents contents() {
		return new Contents() { // Insert a class definition:����һ���ඨ��
			private int i = 11;
			public int value() { return i; }
		}; // Semicolon required in this case:�������������Ҫ�ֺ�
	}
	
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
		System.out.println(c.value());
	}
}/*Output:
11
*///:~
