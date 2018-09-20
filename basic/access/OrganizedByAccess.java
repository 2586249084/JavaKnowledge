package access;
//: access/OrganizedByAccess.java

public class OrganizedByAccess {
	public void pub1() {/*...*/}
	public void pub2() {/*...*/}
	public void pub3() {/*...*/}
	private void privately1(int i) {/*...*/}
	private void privately2() {/*...*/}
	private int i;
	{
		privately1(i);
		privately2();
	}
}
