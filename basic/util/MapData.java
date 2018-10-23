package util;
//: util/MapData.java
// A map filled with data using a generator object.
// ʹ������������������ݵ�ӳ��.

import java.util.*;

@SuppressWarnings({"serial", "unchecked", "rawtypes"})
public class MapData<K, V> extends LinkedHashMap<K, V> {
	
	// A single Pair Generator:
	// һ��������Pair������:
	public MapData(Generator<Pair<K, V>> generator, int quantity) {
		for (int i = 0; i < quantity; i++) {
			Pair<K, V> pair = generator.next();
			put(pair.key, pair.value);
		}
	}
	
	// Two separate Generators:
	// ����������������:
	public MapData(Generator<K> generatorKey, Generator<V> generatorValue,
			int quantity) {
		for (int i = 0; i < quantity; i++) {
			put(generatorKey.next(), generatorValue.next());
		}
	}
	
	// A key Generator and a single value:
	// һ������������һ��ֵ:
	public MapData(Generator<K> generatorKey, V value, int quantity) {
		for (int i = 0; i < quantity; i++) {
			put(generatorKey.next(), value);
		}
	}
	
	// An Iterator and a value Generator:
	// ��������ֵ������:
	public MapData(Iterable<K> iteratorKey, Generator<V> generatorValue) {
		for (K key : iteratorKey) {
			put(key, generatorValue.next());
		}
	}
	
	// An Iterator and a single value:
	// �������͵���ֵ:
	public MapData(Iterable<K> iteratorKey, V value) {
		for (K key : iteratorKey) {
			put(key, value);
		}
	}
	
	// Generic convenience methods:
	// ͨ�õļ�㷽��:
	public static <K, V> MapData<K, V> 
	map(Generator<Pair<K, V>> generator, int quantity) {
		return new MapData(generator, quantity);
	}
	
	public static <K, V> MapData<K, V> 
	map(Generator<K> generatorKey, Generator<V> generatorValue, int quantity) {
		return new MapData(generatorKey, generatorValue, quantity);
	}
	
	public static <K, V> MapData<K, V>
	map(Generator<K> generatorKey, V value, int quantity) {
		return new MapData(generatorKey, value, quantity);
	}
	
	public static <K, V> MapData<K, V> 
	map(Iterable<K> iteratorKey, Generator<V> generatorValue) {
		return new MapData(iteratorKey, generatorValue);
	}
	
	public static <K, V> MapData<K, V> 
	map(Iterable<K> iteratorKey, V value) {
		return new MapData(iteratorKey, value);
	}
	
} ///:~
