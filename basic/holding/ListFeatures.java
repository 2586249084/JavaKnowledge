package holding;
//: holding/ListFeatures.java

import typeinfo.pets.*;
import java.util.*;
import static util.Print.*;

public class ListFeatures {
	
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Pet> pets = Pets.arrayList(7);
		println("1 : " + pets);
		Hamster h = new Hamster();
		pets.add(h); // Automatically resizes 自动调整大小
		println("2 : " + pets);
		println("3 : " + pets.contains(h));
		pets.remove(h); // Remove by object 删除的对象
		Pet p = pets.get(2);
		println("4 : " + p + " " + pets.indexOf(p));
		Pet cymric = new Cymric();
		println("5 : " + pets.indexOf(cymric));
		println("6 : " + pets.remove(cymric));
		// Must be the exact object:
		// 必须是准确的物体:
		println("7 : " + pets.remove(p));
		println("8 : " + pets);
		pets.add(3, new Mouse()); // Insert at an index 插入索引
		println("9 : " + pets);
		
		List<Pet> sub = pets.subList(1, 4);
		println("subList : " + sub);
		println("10 : " + pets.containsAll(sub));
		Collections.sort(sub); // In-place sort 就地排序
		println("sorted subList : " + sub);
		// Order is not important in containsAll():
		// containsAll()中顺序不重要:
		println("11 : " + pets.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up 打乱顺序
		println("shuffled subList : " + sub);
		println("12 : " + pets.containsAll(sub));
		
		List<Pet> copy = new ArrayList<Pet>(pets);
		sub = Arrays.asList(pets.get(1), pets.get(4));
		println("sub : " + sub);
		copy.retainAll(sub);
		println("13 : " + copy);
		copy = new ArrayList<Pet>(pets); // Get a fresh copy 得到一个新拷贝
		copy.remove(2); // Remove by index 通过索引删除
		println("14 : " + copy);
		copy.removeAll(sub); // Only removes exact objects 只移除精确的对象
		println("15 : " + copy);
		copy.set(1, new Mouse()); // Replace an element 替换一个元素
		println("16 : " + copy);
		copy.addAll(2, sub); // Insert a list in the middle 在中间插入一个列表
		println("17 : " + copy);
		println("18 : " + pets.isEmpty());
		pets.clear(); // Remove all elements 移除所有元素
		println("19 : " + pets);
		println("20 : " + pets.isEmpty());
		pets.addAll(Pets.arrayList(4));
		println("21 : " + pets);
		Object[] o = pets.toArray();
		println("22 : " + o[3]);
		Pet[] pa = pets.toArray(new Pet[0]);
		println("23 : " + pa[3].id());
	}
	
}/*Output:
1 : [Rat Default, Manx Default, Cymric Default, Mutt Default, Pug Default, Cymric Default, Pug Default]
2 : [Rat Default, Manx Default, Cymric Default, Mutt Default, Pug Default, Cymric Default, Pug Default, Hamster Default]
3 : true
4 : Cymric Default 2
5 : -1
6 : false
7 : true
8 : [Rat Default, Manx Default, Mutt Default, Pug Default, Cymric Default, Pug Default]
9 : [Rat Default, Manx Default, Mutt Default, Mouse Default, Pug Default, Cymric Default, Pug Default]
subList : [Manx Default, Mutt Default, Mouse Default]
10 : true
sorted subList : [Manx Default, Mutt Default, Mouse Default]
11 : true
shuffled subList : [Mutt Default, Manx Default, Mouse Default]
12 : true
sub : [Mutt Default, Pug Default]
13 : [Mutt Default, Pug Default]
14 : [Rat Default, Mutt Default, Mouse Default, Pug Default, Cymric Default, Pug Default]
15 : [Rat Default, Mouse Default, Cymric Default, Pug Default]
16 : [Rat Default, Mouse Default, Cymric Default, Pug Default]
17 : [Rat Default, Mouse Default, Mutt Default, Pug Default, Cymric Default, Pug Default]
18 : false
19 : []
20 : true
21 : [Manx Default, Cymric Default, Rat Default, EgyptianMau Default]
22 : EgyptianMau Default
23 : 14
*///:~
