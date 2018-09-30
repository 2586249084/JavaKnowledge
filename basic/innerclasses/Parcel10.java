package innerclasses;
//: innerclasses/Parcel10.java
// Using "instance initialization" to perform
// constructor on an anonymous inner class.
// 使用“实例初始化”在匿名内部类上执行构造器

public class Parcel10 {
	public Destination 
		destination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			// Instance initialization for each object:
			// 每个对象的实例初始化:
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
