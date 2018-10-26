package util;
//: util/BasicGenerator.java
// Automatically create a Generator, given a class
// with a default (no-argument) constructor.
// �Զ�����һ��������������һ������Ĭ��(�޲���)���캯������.

public class BasicGenerator<T> implements Generator<T> {
	
	private Class<T> type;

	public BasicGenerator(Class<T> type) {
		this.type = type;
	}

	@Override
	public T next() {
		try {
			// Assumes type is a public class:
			// ����������һ��������:
			return type.newInstance();
		} catch (Exception exception) {
			throw new RuntimeException();
		}
	}
	
	public static <T> Generator<T> create(Class<T> type) {
		return new BasicGenerator<T>(type);
	}
	
}
