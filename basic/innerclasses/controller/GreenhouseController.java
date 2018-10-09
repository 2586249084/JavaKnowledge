package innerclasses.controller;
//: innerclasses/controller/GreenhouseController.java
// Configure and execute the greenhouse system.
// 配置和执行温室系统

public class GreenhouseController {
	public static void main(String[] args) {
		GreenhouseControls gc = new GreenhouseControls();
		// Instead of hard-wiring, you could parse
		// configuration information from a text file here:
		// 你可以从一个文本文件中解析配置信息，而不是硬连接:
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
			gc.new ThermostatNight(0),
			gc.new LightOn(200),
			gc.new LightOff(400),
			gc.new WaterOn(600),
			gc.new WaterOff(800),
			gc.new ThermostatDay(1400)
		};
		
		gc.addEvent(gc.new Restart(2000, eventList));
		if (args.length == 1) {
			gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
		}
		gc.run();
	}
}/*Output:
Bill!
Thermostat on night setting
Light is on
Light is off
Greenhouse water is on
Greenhouse water is off
Thermostat on day setting
Restarting system
Terminate
*///:~
