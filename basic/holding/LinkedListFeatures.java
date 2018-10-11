package holding;
//: holding/LinkedListFeatures.java

import typeinfo.pets.*;
import java.util.*;
import static util.Print.*;

public class LinkedListFeatures {

	public static void main(String[] args) {
		LinkedList<Pet> pets = 
				new LinkedList<Pet>(Pets.arrayList(5));
		println(pets);
		
		// Identical:
		// ��ȫ��ͬ��:
		println("pets.getFirst() : " + pets.getFirst());
		println("pets.element() : " + pets.element());
		
		// Only differs in empty-list behavior:
		// ֻ���ڿ��б�����Ϊ������ͬ:
		println("pets.peek() : " + pets.peek());
		
		// Identical; remove and return the first element:
		// ��ͬ��;ɾ�������ص�һ��Ԫ��
		println("pets.remove() : " + pets.remove());
		println("pets.removeFirst() : " + pets.removeFirst());
		
		// Only differs in empty-list behavior:
		// ֻ���ڿ��б�����Ϊ������ͬ:
		println("pets.poll() : " + pets.poll());
		println(pets);
		pets.addFirst(new Rat());
		println("After addFirst() : " + pets);
		pets.offer(Pets.randomPet());
		println("After offer() : " + pets);
		pets.add(Pets.randomPet());
		println("After add() : " + pets);
		pets.addLast(new Hamster());
		println("After addLast() : " + pets);
		println("pets.removeLast() : " + pets.removeLast());
	}

}/*Output:
[Rat Default, Manx Default, Cymric Default, Mutt Default, Pug Default]
pets.getFirst() : Rat Default
pets.element() : Rat Default
pets.peek() : Rat Default
pets.remove() : Rat Default
pets.removeFirst() : Manx Default
pets.poll() : Cymric Default
[Mutt Default, Pug Default]
After addFirst() : [Rat Default, Mutt Default, Pug Default]
After offer() : [Rat Default, Mutt Default, Pug Default, Cymric Default]
After add() : [Rat Default, Mutt Default, Pug Default, Cymric Default, Pug Default]
After addLast() : [Rat Default, Mutt Default, Pug Default, Cymric Default, Pug Default, Hamster Default]
pets.removeLast() : Hamster Default
*///:~
