package innerclasses;
//: innerclasses/Parcel3.java
// Using .new to create instances of inner class.
// ʹ��.new�������ڲ����ʵ��

public class Parcel3 {
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
	
	public static void main(String[] args) {
		Parcel3 p = new Parcel3();
		// Must use instance of outer class 
		// to create an instance of the inner class:
		// ����ʹ��������ʵ���������ڲ����ʵ��
		@SuppressWarnings("unused")
		Parcel3.Contents pc = p.new Contents();
		@SuppressWarnings("unused")
		Parcel3.Destination pd = p.new Destination("zhangpeng");
	}
}/*Output:
*///:~
