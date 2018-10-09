package holding;
//: holding/PrintingContainers.java
// Containers print themselves automatically.
// 集装箱自动打印

import java.util.*;
import static util.Print.*;

public class PrintingContainers {
	
	static Collection<String> fill(Collection<String> collection) {
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		collection.add("animal");
		return collection;
	}
	
	static Map<String, String> fill(Map<String, String> map) {
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Spot");
		map.put("dog", "Esico");
		map.put("animal", "Bosco");
		return map;
	}
	
	public static void main(String[] args) {
		println("ArrayList:" + fill(new ArrayList<String>()));
		println("LinkedList:" + fill(new LinkedList<String>()));
		println("HashSet:" + fill(new HashSet<String>()));
		println("TreeSet:" + fill(new TreeSet<String>()));
		println("LinkedHashSet:" + fill(new LinkedHashSet<String>()));
		println("HashMap:" + fill(new HashMap<String, String>()));
		println("TreeMap" + fill(new TreeMap<String, String>()));
		println("LinkedHashMap:" + fill(new LinkedHashMap<String, String>()));
	}
}/*Output:
ArrayList:[rat, cat, dog, dog]
LinkedList:[rat, cat, dog, dog]
HashSet:[rat, cat, dog]
TreeSet:[cat, dog, rat]
LinkedHashSet:[rat, cat, dog]
HashMap:{rat=Fuzzy, cat=Spot, dog=Bosco}
TreeMap{cat=Spot, dog=Bosco, rat=Fuzzy}
LinkedHashMap:{rat=Fuzzy, cat=Spot, dog=Bosco}
*///:~
