package typeinfo;
//: typeinfo/ModifyingPrivateFields.java

import java.lang.reflect.*;

class WithPrivateFinalField {
	
	private int i = 1;
	
	private final String s = "I'm totally safe";
	
	private String s2 = "Am I safe?";
	
	public String toString() { 
		return "i = " + i + ", " + s + ", " + s2;
	}
	
}

public class ModifyingPrivateFields {

	public static void main(String[] args) throws Exception {
		WithPrivateFinalField pf = new WithPrivateFinalField();
		System.out.println(pf);
		Field field = pf.getClass().getDeclaredField("i");
		field.setAccessible(true);
		System.out.println("field.getInt(pf) : " + field.getInt(pf));
		field.setInt(pf, 47);
		System.out.println(pf);
		field = pf.getClass().getDeclaredField("s");
		field.setAccessible(true);
		System.out.println("field.get(pf) : " + field.get(pf));
		field.set(pf, "No, you're not");
		System.out.println(pf);
		field = pf.getClass().getDeclaredField("s2");
		field.setAccessible(true);
		System.out.println("field.get(pf)" + field.get(pf));
		field.set(pf, "No, you're not!");
		System.out.println(pf);
	}

}/*Output:
i = 1, I'm totally safe, Am I safe?
field.getInt(pf) : 1
i = 47, I'm totally safe, Am I safe?
field.get(pf) : I'm totally safe
i = 47, I'm totally safe, Am I safe?
field.get(pf)Am I safe?
i = 47, I'm totally safe, No, you're not!
*///:~
