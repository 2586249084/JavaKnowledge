package holding;
//: holding/CollectionSequence.java

import java.util.*;
import typeinfo.pets.*;

public class CollectionSequence extends AbstractCollection<Pet> {

	private Pet[] pets = Pets.createArray(8);

	public int size() {
		return pets.length;
	}
	
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;

			public boolean hasNext() {
				return index < pets.length;
			}

			public Pet next() {
				return pets[index++];
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		CollectionSequence c = new CollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}

}/*Output:
0 : Rat Default 1 : Manx Default 2 : Cymric Default 3 : Mutt Default 4 : Pug Default 5 : Cymric Default 6 : Pug Default 7 : Manx Default 
0 : Rat Default 1 : Manx Default 2 : Cymric Default 3 : Mutt Default 4 : Pug Default 5 : Cymric Default 6 : Pug Default 7 : Manx Default 
*///:~
