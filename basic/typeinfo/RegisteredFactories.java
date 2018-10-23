package typeinfo;
//: typeinfo/RegisteredFactories.java
// Registering Class Factories in the base class.
// 在基类中注册类工厂.

import typeinfo.factory.*;
import java.util.*;

class Part {
	
	public String toString() {
		return getClass().getSimpleName();
	}
	
	static List<Factory<? extends Part>> partFactories = 
			new ArrayList<Factory<? extends Part>>();
	
	private static Random rand = new Random(47);
	
	public static Part createRandom() {
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
	
	static {
		partFactories.add(new FuelFilter.FactoryClass());
		partFactories.add(new AirFilter.FactoryClass());
		partFactories.add(new CabinAirFilter.FactoryClass());
		partFactories.add(new OilFilter.FactoryClass());
		partFactories.add(new FanBelt.FactoryClass());
		partFactories.add(new GeneratorBelt.FactoryClass());
		partFactories.add(new PowerSteeringBelt.FactoryClass());
	}
	
}

class Filter extends Part { }

class FuelFilter extends Filter {
	// Create a Class Factory for each specific type:
	// 为每个特定类型创建一个类工厂:
	public static class FactoryClass implements Factory<FuelFilter> {

		@Override
		public FuelFilter create() {
			return new FuelFilter();
		}
		
	}
	
}

class AirFilter extends Filter {
	
	public static class FactoryClass implements Factory<AirFilter> {

		@Override
		public AirFilter create() {
			return new AirFilter();
		}
		
	}
	
}

class CabinAirFilter extends Filter {
	
	public static class FactoryClass implements Factory<CabinAirFilter> {

		@Override
		public CabinAirFilter create() {
			return new CabinAirFilter();
		}
		
	}
	
}

class OilFilter extends Filter {
	
	public static class FactoryClass implements Factory<OilFilter> {

		@Override
		public OilFilter create() {
			return new OilFilter();
		}
		
	}
	
}

class Belt extends Part { }

class FanBelt extends Belt {
	
	public static class FactoryClass implements Factory<FanBelt> {

		@Override
		public FanBelt create() {
			return new FanBelt();
		}
		
	}
	
}

class GeneratorBelt extends Belt {
	
	public static class FactoryClass implements Factory<GeneratorBelt> {

		@Override
		public GeneratorBelt create() {
			return new GeneratorBelt();
		}
		
	}
	
}

class PowerSteeringBelt extends Belt {
	
	public static class FactoryClass implements Factory<PowerSteeringBelt> {

		@Override
		public PowerSteeringBelt create() {
			return new PowerSteeringBelt();
		}
		
	}
	
}

public class RegisteredFactories {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println(Part.createRandom());
	}

}/*Output:
PowerSteeringBelt
CabinAirFilter
PowerSteeringBelt
AirFilter
GeneratorBelt
CabinAirFilter
FuelFilter
GeneratorBelt
GeneratorBelt
FuelFilter
*///:~
