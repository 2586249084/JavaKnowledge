package innerclasses.controller;
//: innerclasses/controller/Controller.java
// The reusable framework for control systems.
// 用于控制系统的可重用框架

import java.util.*;

public class Controller {
	private List<Event> eventList = new ArrayList<Event>();
	public void addEvent(Event c) {
		eventList.add(c);
	}
	public void run() {
		while(eventList.size() > 0) {
			// Make a copy so you're not modifying the list
			// while you're selecting the elements in it:
			// 做一个拷贝，这样你就不会在选择元素的时候修改列表:
			for(Event e : new ArrayList<Event>(eventList))
				if (e.ready()) {
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
		}
	}
}
