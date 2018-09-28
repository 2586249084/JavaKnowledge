package polymorphism;
//: polymorphism/Transmogrify.java
// Dynamically changing the behavior of an object
// via composition (the "State" design pattern)
// 通过组合动态改变对象的行为("State"设计模式)

import static util.Print.*;

class Actor {
	public void act() {};
}

class HappyActor extends Actor {
	public void act() { println("HappyActor"); }
}

class SadActor extends Actor {
	public void act() { println("SadActor"); }
}

class Stage {
	private Actor actor = new HappyActor();
	public void change() { actor = new SadActor(); }
	public void performPlay() { actor.act(); }
}

public class Transmogrify {
	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}
}/*Output:
HappyActor
SadActor
*/
