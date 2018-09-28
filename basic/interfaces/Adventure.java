package interfaces;
//: interfaces/Adventure.java
// Multiple interfaces.
// 多重接口

import static util.Print.*;

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

class ActionCharacter {
	public void fight() { println("ActionChararcter.fight()"); }
}

class Hero extends ActionCharacter 
	implements CanFight, CanSwim, CanFly{
	public void swim() { println("Hero.swim()"); }
	public void fly() { println("Hero.fly()"); }
}

public class Adventure {
	public static void t(CanFight x) { x.fight(); }
	public static void u(CanSwim x) { x.swim(); }
	public static void v(CanFly x) { x.fly(); }
	public static void w(ActionCharacter x) { x.fight(); }
	public static void main(String[] args) {
		Hero hero = new Hero();
		t(hero);
		u(hero);
		v(hero);
		w(hero);
	}
}/*Output:
ActionChararcter.fight()
Hero.swim()
Hero.fly()
ActionChararcter.fight()
*/
