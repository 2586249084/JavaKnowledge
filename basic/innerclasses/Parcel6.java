package innerclasses;
//: innerclasses/Parcel6.java
// Nesting a class within a scope.
// �ڷ�Χ��Ƕ����

public class Parcel6 {
	private String internalTracking(boolean b) {
		if(b) {
			class TrackingSlip {
				private String id;
				
				TrackingSlip(String s) {
					id = s;
				}
				
				String getSlip() { return id; }
			}
			
			TrackingSlip ts = new TrackingSlip("slip");
			return ts.getSlip();
		} else {
			return "....";
		}
		// Can't use it here! Out of scope:
		// ����������ʹ��!������Χ:
		//! TrackingSlip ts = new TrackingSlip("adsf");
	}
	
	public void track() {
		System.out.println(internalTracking(true));
	}
	
	public static void main(String[] args) {
		Parcel6 p = new Parcel6();
		p.track();
	}
}/*Output:
slip
*///:~
