//: generics/LatentReflection.java
// Using Reflection to produce latent typing.
// 使用反射产生潜在的类型.
package generics;

import java.lang.reflect.*;
import static util.Print.*;

// Does not implement Performs:
// 未实现执行:
class Mime {

	public void walkAgainTheWind() {

	}

	public void sit() {
		println("Pretending to sit");
	}

	public void pushInvisibleWalls() {

	}

	public String toString() {
		return "Mime";
	}

}

class SmartDog {

	public void speak() {
		println("Woof!");
	}

	public void sit() {
		println("Sitting");
	}

	public void reproduce() {

	}

}

class CommunicateReflectively {

	public static void perform(Object speaker) {
		Class<?> spkr = speaker.getClass();
		try {
			try {
				Method speak = spkr.getMethod("speak");
				speak.invoke(speaker);
			} catch (NoSuchMethodException exception) {
				println(speaker + " cannot speak");
			}
			try {
				Method sit = spkr.getMethod("sit");
				sit.invoke(speaker);
			} catch (NoSuchMethodException exception) {
				println(speaker + " cannot sit");
			}
		} catch (Exception exception) {
			throw new RuntimeException(speaker.toString(), exception);
		}
	}

}

public class LatentReflection {

	public static void main(String[] args) {
		CommunicateReflectively.perform(new SmartDog());
		CommunicateReflectively.perform(new Robot());
		CommunicateReflectively.perform(new Mime());
	}

}/* Output:
Woof!
Sitting
Click!
Clank!
Mime cannot speak
Pretending to sit
*///:~
