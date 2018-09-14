package initialization;
//: initialization/InitialValues2.java

import static commentUtil.Print.println;

/**
 * InitialValues2
 * Providing explicit initial values
 * 提供明确初始值
 * @author Mrzhang
 */
public class InitialValues2 {
	boolean t = true;
	char c = 'x';
	byte b = 47;
	short s = 0xff;
	int i = 99;
	long l = 1;
	float f = 3.14f;
	double d = 3.14159;
	
	void printInitialValues() {
		println("Data type     Initial value");
		println("boolean       " + t);
		println("char          [" + c + "]");
		println("byte          " + b);
		println("short         " + s);
		println("int           " + i);
		println("long          " + l);
		println("float         " + f);
		println("double        " + d);
	}
	
	public static void main(String[] args) {
		new InitialValues2().printInitialValues();
	}
}
