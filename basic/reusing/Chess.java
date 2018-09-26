package reusing;
//: reusing/Chess.java
// Inheritance, constructors and arguments.
// 继承, 构造器和参数

import static util.Print.*;

class Game{
	Game(int i) {
		println("Game constructor with arg = " + i);
	}
	
	Game() {
		println("Game constructor no arg");
	}
}

class BoardGame extends Game{
	BoardGame() {
		super(22);
		println("BoardGame constructor no arg");
	}
	
	BoardGame(int i) { 
		super(11);
		println("BoardGame constructor with arg = " + i);
	}
}

public class Chess extends BoardGame{
	Chess() {
		super(33);
		println("Chess constructor");
	}
	
	public static void main(String[] args) {
		Chess x = new Chess();
		x.toString();
	}
}
