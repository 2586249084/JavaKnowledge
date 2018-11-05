//: generics/DogsAndRobots.java
// No latent typing in Java.
// Java中没有潜在的类型.

package generics;

import typeinfo.pets.*;
import static util.Print.*;

class PerformingDog extends Dog implements Performs {

	@Override
	public void speak() {
		println("Woof!");
	}

	@Override
	public void sit() {
		println("Sitting");
	}
	
	public void reproduce() { }
	
}

class Robot implements Performs {

	@Override
	public void speak() {
		println("Click!");
	}

	@Override
	public void sit() {
		println("Clank!");
	}
	
	public void oilChange() { }
	
}

class Communicate {
	
	public static <T extends Performs> 
	void perform(T performer) {
		performer.speak();
		performer.sit();
	}
	
}

public class DogsAndRobots {

	public static void main(String[] args) {
		PerformingDog dog = new PerformingDog();
		Robot robot = new Robot();
		Communicate.perform(dog);
		Communicate.perform(robot);
	}

}/* Output:
Woof!
Sitting
Click!
Clank!
*///:~
