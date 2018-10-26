package util;
//: util/BasicGenerator.java
// Automatically create a Generator, given a class
// with a default (no-argument) constructor.
// 自动创建一个生成器，给定一个带有默认(无参数)构造函数的类.

public class BasicGenerator<T> implements Generator<T> {
	
	private Class<T> type;

	public BasicGenerator(Class<T> type) {
		this.type = type;
	}

	@Override
	public T next() {
		try {
			// Assumes type is a public class:
			// 假设类型是一个公共类:
			return type.newInstance();
		} catch (Exception exception) {
			throw new RuntimeException();
		}
	}
	
	public static <T> Generator<T> create(Class<T> type) {
		return new BasicGenerator<T>(type);
	}
	
}
