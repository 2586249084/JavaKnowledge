package typeinfo;
//: typeinfo/ShowMethods.java
// Using reflection to show all the methods of a class,
// even if the methods are defined in the base class.
// 使用反射显示类的所有方法，即使这些方法是在基类中定义的.

import java.lang.reflect.*;
import java.util.regex.*;
import static util.Print.*;

public class ShowMethods {
	
	private static String usage = 
			"usage : \n"
			+ "ShowMethods qualified.class.name\n"
			+ "To show all methods in class or : \n"
			+ "ShowMethods qualified.class.name.word\n"
			+ "To search for methods involving 'word'";
	
	private static Pattern pattern = Pattern.compile("\\w+\\.");

	public static void main(String[] args) {
		if (args.length < 1) {
			println(usage);
			System.exit(0);
		}
		@SuppressWarnings("unused")
		int lines = 0;
		try {
			Class<?> c = Class.forName(args[0]);
			Method[] methods = c.getMethods();
			Constructor<?>[] constructors = c.getConstructors();
			if (args.length == 1) {
				for (Method method : methods)
					println(pattern.matcher(method.toString()).replaceAll(""));
				for(Constructor<?> constructor : constructors)
					println(pattern.matcher(constructor.toString()).replaceAll(""));
				lines = methods.length + constructors.length;
			} else {
				for (Method method : methods)
					if (method.toString().indexOf(args[1]) != -1) {
						println(pattern.matcher(method.toString()).replaceAll(""));
						lines++;
					}
				for (Constructor<?> constructor : constructors)
					if (constructor.toString().indexOf(args[1]) != -1) {
						println(pattern.matcher(constructor.toString()).replaceAll(""));
						lines++;
					}
			}
		} catch (ClassNotFoundException exception) {
			println("No such class : " + exception);
		}
	}

}
