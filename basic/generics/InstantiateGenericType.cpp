//: generics/InstantiateGenericType.cpp
// C++, not Java!

template<class T> class Foo {
	T x; // Create a field of type T ��������ΪT���ֶ�
	T* y; // Pointer to T ָ��T
public:
	// Initialize the pointer:
	// ��ʼ��ָ��:
	Foo() { y = new T(); }
};

class Bar {};

int main() {
	Foo<Bar> fb;
	Foo<int> fi; // ...and it works with primitives ����ԭ��һ����
} ///:~
