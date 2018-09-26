package reusing;
//: reusing/Hide.java
// Overloading a base-class method name in a derived
// class does not hide the base-class version.
// 在派生类中重载基类方法名并不隐藏基类版本

import static util.Print.*;

class Homer {
	char doh(char c) {
		println("doh(char)");
		return 'd';
	}
	
	float doh(float f) {
		println("doh(float)");
		return 1.0f;
	}
}

class Milhouse {}

class Bart extends Homer {
	void doh(Milhouse m) {
		println("doh(Milhouse)");
	}
	
	@Override
	char doh(char c) {
		return super.doh(c);
	}
}

public class Hide {
	public static void main(String[] args) {
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
	}
}/* Output:
doh(flaot)
doh(char)
doh(float)
doh(Mighouse)
*/
