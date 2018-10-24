package typeinfo;
//: typeinfo/NullRobot.java

// Using a dynamic proxy to create a Null Object.
// 使用动态代理创建空对象.

import java.lang.reflect.*;
import java.util.*;
import util.*;

class NullRobotProxyHandler implements InvocationHandler {

	private String nullName;

	private Robot proxied = new NRobot();

	NullRobotProxyHandler(Class<? extends Robot> type) {
		nullName = type.getSimpleName() + " NullRobot";
	}

	private class NRobot implements Null, Robot {

		@Override
		public String name() {
			return nullName;
		}

		@Override
		public String model() {
			return nullName;
		}

		@Override
		public List<Operation> operations() {
			return Collections.emptyList();
		}

	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(proxied, args);
	}

}

public class NullRobot {

	public static Robot newNullRobot(Class<? extends Robot> type) {
		return (Robot) Proxy.newProxyInstance(
				NullRobot.class.getClassLoader(), 
				new Class[] { Null.class, Robot.class }, 
				new NullRobotProxyHandler(type));
	}

	public static void main(String[] args) {
		Robot[] bots = {
				new SnowRemovalRobot("SnowBee"), 
				newNullRobot(SnowRemovalRobot.class)
		};
		for (Robot robot : bots)
			Robot.Test.test(robot);
	}

}/*Output:
Robot name : SnowBee
Robot model : SnowRobot Series 11
SnowBee can shovel snow
SnowBee shoveling snow
SnowBee can chip ice
SnowBee chipping ice
SnowBee can clear the roof
SnowBeeclearing roof
[Null Robot]
Robot name : SnowRemovalRobot NullRobot
Robot model : SnowRemovalRobot NullRobot
*///:~
