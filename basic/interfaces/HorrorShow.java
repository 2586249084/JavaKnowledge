package interfaces;
//: interfaces/HorrorShow.java
// Extending an interface with inheritance.
// 用继承来扩展接口

import static util.Print.*;

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	public void destroy() { println("DragonZilla.destroy()"); }
	public void menace() { println("DragonZilla.menace()"); }
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void destroy() { println("VeryBadVampire.destroy()"); }
	public void menace() { println("VeryBadVampire.menace()"); }
	public void kill() { println("VeryBadVampire.kill()"); }
	public void drinkBlood() { println("VeryBadVampire.drinkBlood()"); }
}

public class HorrorShow {
	static void u(Monster b) { b.menace(); }
	
	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}
	
	static void w(Lethal l) { l.kill(); }

	public static void main(String[] args) {
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
}/*Output:
DragonZilla.menace()
DragonZilla.menace()
DragonZilla.destroy()
VeryBadVampire.menace()
VeryBadVampire.menace()
VeryBadVampire.destroy()
VeryBadVampire.kill()
*/
