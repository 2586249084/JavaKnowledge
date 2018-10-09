package holding;

import java.util.*;

//: holding/AsListInference.java
// Arrays.asList() makes its best guess about type.
// Arrays.asList()�����ͽ�������õĲ²�

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
		// Won't compile:�������:
		// List<Snow> snow2 = 
		//		Arrays.asList(new Light(), new Heavy());
		// Compiler says:
		// found(�ҵ�)   :java.util.List<Power>
		// required(����):java.util.List<Snow>
		
		// Collections.addAll() doesn't get confused:
		// Collections.addAll()���ᱻ����
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		
		// Give a hint using an
		// explicit type argument specification:
		// ʹ����ʽ���Ͳ����淶����һ����ʾ:
		List<Snow> snow4 = 
				Arrays.<Snow>asList(new Light(), new Heavy());
		System.out.println(snow1.toString());
		System.out.println(snow4.toString());
		// System.out.println(snow2.toString());
	}
}
