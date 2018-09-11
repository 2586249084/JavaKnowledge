package commentUtil;

// import java.util.Date;

public class Print {
	
	public static void print(Object object) {
		/* if (object instanceof String) {
			System.out.println(object);
		} else if (object instanceof Date) {
			System.out.println(object);
		} else {
			throw new IllegalArgumentException("Argument 'object' is wrong!");
		} */
		System.out.print(object);
	}
	
	public static void println(Object object) {
		System.out.println(object);
	}

}
