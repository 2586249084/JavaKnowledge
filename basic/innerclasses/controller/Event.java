package innerclasses.controller;
//: innerclasses/controller/Event.java
// The common methods for any control event.
// 任何控制事件的通用方法

public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	public Event(long delayTime) {
		this.delayTime = delayTime;
		start();
	}
	
	public void start() { // Allows restarting
		eventTime = System.nanoTime() + delayTime;
	}
	
	public boolean ready() {
		return System.nanoTime() >= eventTime;
	}
	
	public abstract void action();
}
