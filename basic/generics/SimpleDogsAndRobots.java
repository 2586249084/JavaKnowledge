//: generics/SimpleDogsAndRobots.java
// Removing the generic; code still works.
// 删除泛型;代码仍然工作
package generics;

class CommunicateSimplely {
	
	static void perform(Performs performer) {
		performer.speak();
		performer.sit();
	}
	
}

public class SimpleDogsAndRobots {

	public static void main(String[] args) {
		CommunicateSimplely.perform(new PerformingDog());
		CommunicateSimplely.perform(new Robot());
	}

}/* Output:
Woof!
Sitting
Click!
Clank!
*///;~
