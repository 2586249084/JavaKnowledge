package interfaces;
//: interfaces/Factories.java

import static util.Print.*;

interface Service {
	void method1();
	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {
	Implementation1() {} // package access
	public void method1() { println("Implementation1 method1"); }
	public void method2() { println("Implementation1 method2"); }
}

class Implementation1Factory implements ServiceFactory {
	public Service getService() {
		return new Implementation1();
	}
}

class Implementation2 implements Service {
	Implementation2() {} // package access
	public void method1() { println("Implementation2 method1"); }
	public void method2() { println("Implementation2 method2"); }
}

class Implementation2Factory implements ServiceFactory {
	public Service getService() {
		return new Implementation2();
	}
}

public class Factories {
	public static void serviceConsumer(ServiceFactory factory) {
		Service s = factory.getService();
		s.method1();
		s.method2();
	}
	
	public static void main(String[] args) {
		serviceConsumer(new Implementation1Factory());
		// Implementations are completely interchangeable:
		// 实现是完全可互换的
		serviceConsumer(new Implementation2Factory());
	}
}/*Output:
Implementation1 method1
Implementation1 method2
Implementation2 method1
Implementation2 method2
*/
