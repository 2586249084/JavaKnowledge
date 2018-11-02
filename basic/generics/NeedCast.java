package generics;
//: generics/NeedCast.java

import java.io.*;
import java.util.*;

public class NeedCast {

	@SuppressWarnings({ "unchecked", "unused", "resource" })
	public void f(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(
		  new FileInputStream(args[0]));
		List<Widget> shapes = (List<Widget>)in.readObject();
	}
	
} ///:~
