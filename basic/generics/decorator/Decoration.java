//: generics/decorator/Decoration.java
package generics.decorator;

import java.util.*;

class Basic {

	private String value;

	public void set(String value) {
		this.value = value;
	}

	public String get() {
		return value;
	}

}

class Decorator extends Basic {

	protected Basic basic;

	public Decorator(Basic basic) {
		this.basic = basic;
	}

	public void set(String value) {
		basic.set(value);
	}

	public String get() {
		return basic.get();
	}

}

class TimeStamped extends Decorator {

	private final long timeStamp;

	public TimeStamped(Basic basic) {
		super(basic);
		timeStamp = new Date().getTime();
	}

	public long getStamp() {
		return timeStamp;
	}

}

class SerialNumbered extends Decorator {

	private static long counter = 1;

	private final long serialNumber = counter++;

	public SerialNumbered(Basic basic) {
		super(basic);
	}

	public long getSerialNumber() {
		return serialNumber;
	}

}

public class Decoration {

	public static void main(String[] args) {
		TimeStamped t = new TimeStamped(new Basic());
		TimeStamped t2 = new TimeStamped(new SerialNumbered(new Basic()));
		//! t2.getSerialNumber(); // Not available 无法使用
		SerialNumbered s = new SerialNumbered(new Basic());
		SerialNumbered s2 = new SerialNumbered(new TimeStamped(new Basic()));
		//! s2.getStamp(); // Not available 无法使用
		t.set("test string t1");
		t2.set("test string t2");
		s.set("test string s1");
		s2.set("test string s2");
		System.out.println(t.get() + " " + t.getStamp());
		System.out.println(t2.get() + " " + t2.getStamp());
		System.out.println(s.get() + " " + s.getSerialNumber());
		System.out.println(s2.get() + " " + s2.getSerialNumber());
	}

}
