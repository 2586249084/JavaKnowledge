package initialization;
// initialization/OrderOfInitialization

import static commentUtil.Print.*;

/**
 * OrderOfInitialization ��ʼ��˳��
 * @author Mrzhang
 */
public class OrderOfInitialization {
	public static void main(String[] args) {
		House h = new House();
		h.f();
	}
}

/**
 * Window
 * When the constructor is called to create a Window object, you'll see a message
 * �����ù�����������Window����ʱ���㽫����һ����Ϣ
 * @author Mrzhang
 */
class Window{
	Window(int marker){
		println("Window (" + marker + ")");
	}
}

class House{
	Window w1 = new Window(1);// Before constructor ������֮ǰ
	
	House(){
		//Show that we're in the constructor: ��ʾ�����ڹ�����
		println("House()");
		w3 = new Window(33);// Reinitialize w3 ���³�ʼ��w3
	}
	
	Window w2 = new Window(2);// After constructor ������֮��
	
	void f() {
		println("f()");
	}
	
	Window w3 = new Window(3);// At end �����
}
