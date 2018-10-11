package holding;
//: holding/NonCollectionSequence.java

import typeinfo.pets.*;
import java.util.*;

class PetSequence {
	protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence {
	
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
		 NonCollectionSequence nc = new NonCollectionSequence();
		 InterfaceVsIterator.display(nc.iterator());
	}
	
}/*Output:
0 : Rat Default 1 : Manx Default 2 : Cymric Default 3 : Mutt Default 4 : Pug Default 5 : Cymric Default 6 : Pug Default 7 : Manx Default 
*///:~
