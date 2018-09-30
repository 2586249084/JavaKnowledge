package innerclasses;
//: innerclasses/Parcel10.java
// Using "instance initialization" to perform
// constructor on an anonymous inner class.
// ʹ�á�ʵ����ʼ�����������ڲ�����ִ�й�����

public class Parcel10 {
	public Destination 
		destination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			// Instance initialization for each object:
			// ÿ�������ʵ����ʼ��:
			{
				cost = Math.round(price);
				if(cost > 100)
					System.out.println("Over budget!");
			}
			
			private String label = dest;
			public String readLabel() { return label; }
		};
	}
	
	public static void main(String[] args) {
		Parcel10 p = new Parcel10();
		Destination d = p.destination("Tasmania", 101.395F);
		System.out.println(d.readLabel());
	}
}/*Output:
Over budget!
Tasmania
*///:~
