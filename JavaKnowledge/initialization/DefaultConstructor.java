package initialization;
//: initialization/DefaultConstructor.java

/**
 * DefaultConstructor 默认构造器('无参'构造器)
 * @author Mrzhang
 */
public class DefaultConstructor {
	public static void main(String[] args) {
		Bird bird = new Bird();
		System.out.println(bird);
	}
}

class Bird{}
