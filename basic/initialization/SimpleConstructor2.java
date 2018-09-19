package initialization;
//: initialization/SimpleConstructor2.java

/**
 * SimpleConstructor2 简单构造器
 * 构造器可以有参数
 * @author Mrzhang
 */
public class SimpleConstructor2 {
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			new Rock2(i);
		}
	}
}

class Rock2{
	Rock2(int i){
		System.out.print("Rock " + i + " ");
	}
}
