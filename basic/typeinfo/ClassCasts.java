package typeinfo;
//: typeinfo/ClassCasts.java

class Building { }

class House extends Building { }

public class ClassCasts {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Building building = new House();
		Class<House> houseType = House.class;
		House house = houseType.cast(building);
		house = (House)building;
	}

} ///:~
