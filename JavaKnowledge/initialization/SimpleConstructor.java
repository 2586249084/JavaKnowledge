package initialization;
//: initialization/SimpleConstructor.java

/**
 * SimpleConstructor 简单构造器
 * 没有参数的构造器
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
