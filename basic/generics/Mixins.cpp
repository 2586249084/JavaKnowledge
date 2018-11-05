//: generics/Mixins.cpp
#include <string>
#include <ctime>
#include <iostream>
using namespace std;

template<class T> class TimeStamped : public T {
	long timeStamp;
public :
	TimeStamped() { timeStamp = time(0); }
	long getStamp() { return timeStamp; }
};

template<class T> class SerialNumbered : public T {
	long serialNumber;
	static long counter;
public :
	SerialNumbered() { serialNumber = counter++; }
	long getSerialNumber() { return serialNumber; }
};

// Define and initialize the static storage:
// ����ͳ�ʼ����̬�洢:
template<class T> long SerialNumbered<T> : : counter = 1;

class Basic {
	string value;
public :
	void set(string value) { this->value = value; }
	string get(){ return value; }
};

int main() {
	TimeStamped<SerialNumbered<Basic>> mixin1, mixin2;
	mixin1.set("test string 1");
	mixin1.set("test string 2");
	cout << mixin1.get() << " " << mixin1.getStamp() <<
	  " " << mixin1.getSerialNumber() << endl;
	cout << mixin2.get() << " " << mixin2.getStamp() <<
	  " " << mixin2.getSerialNumber() << endl;
}/* Output:

*///:~