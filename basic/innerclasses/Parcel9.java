package innerclasses;
//: innerclasses/Parcel9.java
// initialization. A briefer version of Parcel5.java.
// ��ʼ��. һ����̰汾��Parcel5.java

public class Parcel9 {
	// Argument must be final to use inside
	// ���ڲ�ʹ�ã�����������final��
	// anonymous inner class:
	// �����ڲ���:
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
