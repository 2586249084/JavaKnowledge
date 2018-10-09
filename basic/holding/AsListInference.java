package holding;

import java.util.*;

//: holding/AsListInference.java
// Arrays.asList() makes its best guess about type.
// Arrays.asList()对类型进行了最好的猜测

class Snow {}
class Power extends Snow {}
class Light extends Power {}
class Heavy extends Power {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {
	public static void main(String[] args) {
		List<Snow> snow1 = 
				Arrays.asList(new Crusty(), new Slush(), new Power());
		// Won't compile:不会编译:
		// List<Snow> snow2 = 
		//		Arrays.asList(new Light(), new Heavy());
		// Compiler says:
		// found(找到)   :java.util.List<Power>
		// required(必需):java.util.List<Snow>
		
		// Collections.addAll() doesn't get confused:
		// Collections.addAll()不会被混淆
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		
		// Give a hint using an
		// explicit type argument specification:
		// 使用显式类型参数规范给出一个提示:
		List<Snow> snow4 = 
				Arrays.<Snow>asList(new Light(), new Heavy());
		System.out.println(snow1.toString());
		System.out.println(snow4.toString());
		// System.out.println(snow2.toString());
	}
}
