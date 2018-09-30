package innerclasses;
//: innerclasses/TestBed.java
// Putting test code in a nested class.
// �����Դ������һ��Ƕ������

public class TestBed {
	
	public void f() { System.out.println("TestBed.f()"); }
	
	public static class Tester {
		public static void main(String[] args) {
			TestBed t = new TestBed();
			t.f();
		}
	}
}/*Output:
TestBed.f()
*///:~
