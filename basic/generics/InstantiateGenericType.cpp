//: generics/InstantiateGenericType.cpp
// C++, not Java!

template<class T> class Foo {
	T x; // Create a field of type T 创建类型为T的字段
	T* y; // Pointer to T 指向T
public:
	// Initialize the pointer:
	// 初始化指针:
	Foo() { y = new T(); }
};

class Bar {};

int main() {
	Foo<Bar> fb;
	Foo<int> fi; // ...and it works with primitives 它与原语一起工作
} ///:~
