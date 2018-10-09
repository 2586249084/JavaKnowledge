package innerclasses;
//:innerclasses/MultiImplementation.java
// With concrete or abstract classes, inner 
// classes are the only way to produce the effect 
// of "multiple" implementation inheritance
// ���˾���Ļ������࣬�ڲ����ǲ��������ء�ʵ�ּ̳�Ч����Ψһ����

class D {}

abstract class E{}

class Z extends D {
	E makeE() {
		return new E() {};
	}
}

public class MultiImplementation {
	static void tasksD(D d) {}
	static void tasksE(E e) {}
	
	public static void main(String[] args) {
		Z z = new Z();
		tasksD(z);
		tasksE(z.makeE());
	}
}
