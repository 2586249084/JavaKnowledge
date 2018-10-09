package innerclasses.controller;
//: innerclasses/controller/GreenhouseControls.java
// This produces a special application of the 
// control system, all in a single class. Inner
// classes allow you to encapsulate different 
// functionality for each type of event.
// 这就产生了控制系统的特殊应用程序，所有这些都在一个类中.
// 内部类允许您为每种类型的事件封装不同的功能.

public class GreenhouseControls extends Controller{
	@SuppressWarnings("unused")
	private boolean light = false;
	
	public class LightOn extends Event {
		public LightOn(long delayTime) { super(delayTime); }
		
		public void action() {
			// Put hardware control code here to 
			// physically turn on the light.
			// 把硬件控制代码放在这里，物理上打开灯
			light = true;
		}
		
		public String toString() { return "Light is on"; }
	}
	
	public class LightOff extends Event {
		public LightOff(long delayTime) { super(delayTime); }
		
		public void action() {
			// Put hardware control code here to 
			// physically turn off the light.
			// 把硬件控制代码放在这里，物理上关闭灯
			light = false;
		}
		
		public String toString() { return "Light is off"; }
	}
	
	@SuppressWarnings("unused")
	private boolean water = false;
	public class WaterOn extends Event {
		public WaterOn(long delayTime) { super(delayTime); }
		
		public void action() {
			 // Put hardware control code here.
			water = true;
		}
		
		public String toString() { return "Greenhouse water is on"; }
	}
	
	public class WaterOff extends Event {
		public WaterOff(long delayTime) { super(delayTime); }
		
		public void action() {
			 // Put hardware control code here.
			water = false;
		}
		
		public String toString() { return "Greenhouse water is off"; }
	}
	
	@SuppressWarnings("unused")
	private String thermostat = "Day";
	public class ThermostatNight extends Event {
		public ThermostatNight(long delayTime) {
			super(delayTime);
		}
		
		public void action() {
			thermostat = "Night";
		}
		
		public String toString() { 
			return "Thermostat on night setting";
		}
	}
	
	public class ThermostatDay extends Event {
		public ThermostatDay(long delayTime) {
			super(delayTime);
		}
		
		public void action() {
			thermostat = "Day";
		}
		
		public String toString() { 
			return "Thermostat on day setting";
		}
	}
	
	// An example of an action() that inserts a 
	// new one of itself into the event list:
	// action()的一个例子，它将一个新的自身插入到事件列表中:
	public class Bell extends Event {
		public Bell(long delayTime) { super(delayTime); }
		
		public void action() {
			addEvent(new Bell(delayTime));
		}
		
		public String toString() { return "Bill!"; }
	}
	
	public class Restart extends Event {
		private Event[] eventList;
		
		public Restart(long delayTime, Event[] eventList) {
			super(delayTime);
			this.eventList = eventList;
			for(Event e : eventList)
				addEvent(e);
		}
		
		public void action() {
			for(Event e : eventList) {
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
		}
		
		public String toString() { return "Restarting system"; }
	}
	
	public static class Terminate extends Event {
		public Terminate(long delayTime) { super(delayTime); }
		
		public void action() { System.exit(0); }
		
		public String toString() { return "Terminate"; }
	}
}
