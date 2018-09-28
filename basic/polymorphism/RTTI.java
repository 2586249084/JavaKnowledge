package polymorphism;
//: polymorphism/RTTI.java
// Downcasting & Runtime type information.
// ����ת�ͺ�����ʱ������Ϣ

class Useful {
	public void f() {};
	public void g() {};
}

class MoreUseful extends Useful {
	public void f() {};
	public void g() {};
	public void u() {};
	public void v() {};
	public void w() {};
}

public class RTTI {
	public static void main(String[] args) {
		Useful[] x = {
			new Useful(),
			new MoreUseful()
		};
		x[0].f();
		x[1].f();
		// Compile time: method not found in Useful:
		// ����ʱ��:δ��Useful�з��ֵķ���
		//! x[1].w();
		((MoreUseful)x[1]).w();
		((MoreUseful)x[0]).u();
	}
}///:~
