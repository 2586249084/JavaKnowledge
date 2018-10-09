package innerclasses.controller;
//: innerclasses/controller/Controller.java
// The reusable framework for control systems.
// ���ڿ���ϵͳ�Ŀ����ÿ��

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
			// ��һ��������������Ͳ�����ѡ��Ԫ�ص�ʱ���޸��б�:
			for(Event e : new ArrayList<Event>(eventList))
				if (e.ready()) {
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
		}
	}
}