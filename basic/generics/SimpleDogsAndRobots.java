//: generics/SimpleDogsAndRobots.java
// Removing the generic; code still works.
// ɾ������;������Ȼ����
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
