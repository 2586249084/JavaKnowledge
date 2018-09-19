package initialization;
//:initialization/InitialValues.java

import static util.Print.*;

/**
 * InitialValues ���ݳ�ʼ��
 * Shows default initial values 
 * չʾĬ�ϳ�ʼֵ
 * @author Mrzhang
 */
public class InitialValues {
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	InitialValues reference;
	
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
		println("reference     " + reference);
	}
	
	public static void main(String[] args) {
		InitialValues iv = new InitialValues();
		iv.printInitialValues();
		/* You could also say:
		 new InitialValues().printInitialValues();
		 */
	}
}
