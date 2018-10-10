package holding;
//: holding/CollectionSequence.java

import java.util.*;
import typeinfo.pets.*;

public class CollectionSequence extends AbstractCollection<Pet> {

	private Pet[] pets = Pets.createArray(8);

	public int size() {
		return pets.length;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Iterator<Pet> iterator() {
		return new Iterator() {
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

}
