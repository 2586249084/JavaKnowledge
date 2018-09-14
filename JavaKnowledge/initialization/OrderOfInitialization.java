package initialization;
// initialization/OrderOfInitialization

import static commentUtil.Print.*;

/**
 * OrderOfInitialization 初始化顺序
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
 * 当动用构造器来创建Window对象时，你将看到一条信息
 * @author Mrzhang
 */
class Window{
	Window(int marker){
		println("Window (" + marker + ")");
	}
}

class House{
	Window w1 = new Window(1);// Before constructor 构造器之前
	
	House(){
		//Show that we're in the constructor: 显示我们在构造中
		println("House()");
		w3 = new Window(33);// Reinitialize w3 重新初始化w3
	}
	
	Window w2 = new Window(2);// After constructor 构造器之后
	
	void f() {
		println("f()");
	}
	
	Window w3 = new Window(3);// At end 在最后
}
