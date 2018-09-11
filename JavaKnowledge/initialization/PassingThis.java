package initialization;
//:initialization/PassingThis.java

/**
 * PassingThis
 * @author Mrzhang
 */
public class PassingThis {
	public static void main(String[] args) {
		new Person().eat(new Apple());
	}
}

class Person{
	public void eat(Apple apple) {
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy" + peeled);
	}
}

class Peeler{
	static Apple peel(Apple apple) {
		return apple;
	}
}

class Apple{
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}
