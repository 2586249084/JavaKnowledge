package initialization;
//: initialization/SimpleConstructor.java

/**
 * SimpleConstructor �򵥹�����
 * û�в����Ĺ�����
 * @author Mrzhang
 */
public class SimpleConstructor {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Rock();
		}
	}
}

class Rock{
	Rock(){
		System.out.print("Rock ");
	}
}
