//: generics/Mixins.java
package generics;

import java.util.*;

interface TimeStamped { 
	long getStamp();
}

class TimeStampedImp implements TimeStamped {

	private final long timeStamp;
	
	public TimeStampedImp() {
		timeStamp = new Date().getTime();
	}
	
	@Override
	public long getStamp() {
		return timeStamp;
	}
	
}

interface SerialNumbered {
	long getSerialNumber();
}

class SerialNumberedImp implements SerialNumbered {

	private static long counter = 1;
	
	private final long serialNumber = counter++;
	
	@Override
	public long getSerialNumber() {
		return serialNumber;
	}
	
}

interface Basic {
	public void set(String value);
	public String get();
}

class BasicImp implements Basic {
	
	private String value;

	@Override
	public void set(String value) {
		this.value = value;
	}

	@Override
	public String get() {
		return value;
	}
	
}

class Mixin extends BasicImp implements TimeStamped, SerialNumbered {

	private TimeStamped timeStamped = new TimeStampedImp();
	
	private SerialNumbered serialNumber = new SerialNumberedImp();
	
	@Override
	public long getSerialNumber() {
		return timeStamped.getStamp();
	}

	@Override
	public long getStamp() {
		return serialNumber.getSerialNumber();
	}
	
}

public class Mixins {

	public static void main(String[] args) {
		Mixin mixin1 = new Mixin(), mixin2 = new Mixin();
		mixin1.set("test string 1");
		mixin2.set("test string 2");
		System.out.println(mixin1.get() + " " + 
		mixin1.getStamp() + " " + mixin1.getSerialNumber());
		System.out.println(mixin2.get() + " " + 
		mixin2.getStamp() + " " + mixin2.getSerialNumber());
	}

}/* Output:
test string 1 1 1541401641113
test string 2 2 1541401641113
*///:~
