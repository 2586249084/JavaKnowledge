package typeinfo.pets;
//: typeinfo/pets/PetCreator.java
// Creates random sequences of Pets.
// 创建随机的宠物序列

import java.util.*;

public abstract class PetCreator {
	
	private Random rand = new Random(47);
	
	// The List of the different types of Pet to create:
	// 不同类型的宠物的列表
	public abstract List<Class<? extends Pet>> types();
	
	public Pet randomPet() { // Create one random Pet 创建一个随机宠物
		int n = rand.nextInt(types().size());
		try {
			return types().get(n).newInstance();
		} catch(InstantiationException error) {
			throw new RuntimeException();
		} catch(IllegalAccessException error) {
			throw new RuntimeException();
		}
	}
	
	public Pet[] createArray(int size) {
		Pet[] result = new Pet[size];
		for(int i = 0; i < size; i++)
			result[i] = randomPet();
		return result;
	}
	
	public ArrayList<Pet> arrayList(int size) {
		ArrayList<Pet> result = new ArrayList<Pet>();
		Collections.addAll(result, createArray(size));
		return result;
	}
	
}
