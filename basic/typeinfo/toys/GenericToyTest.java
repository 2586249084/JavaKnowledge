package typeinfo.toys;
//: typeinfo/toys/GenericToyTest.java
// Testing class Class.

public class GenericToyTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		Class<FancyToy> ftClass = FancyToy.class;
		
		// Produces exact type:
		// �����ľ�������:
		FancyToy tancyToy = ftClass.newInstance();
		Class<? super FancyToy> up = ftClass.getSuperclass();
		
		// This won't compile:
		// �ⲻ�����:
		//! Class<Toy> up2 = ftClass.getSuperclass();
		
		// Only produces Object:
		// ֻ����������:
		Object object = up.getSuperclass();
	}

} ///:~
