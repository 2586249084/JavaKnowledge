package innerclasses;
//: innerclasses/Games.java
// Using anonymous inner classes with the Game framework.
// 使用带有游戏框架的匿名内部类

import static util.Print.*;

interface Game {
	boolean move();
}

interface GameFactory {
	Game getGame(); 
}

class Checkers implements Game {
	private Checkers() {}
	private int moves = 0;
	private static final int MOVES = 3;
	public boolean move() {
		println("Checkers move " + moves);
		return ++moves != MOVES;
	}
	public static GameFactory factory = new GameFactory() {
		public Game getGame() {
			return new Checkers();
		}
	};
}

class Chess implements Game {
	private Chess() {}
	private int moves = 0;
	private static final int MOVES = 4;
	public boolean move() {
		println("Chess move " + moves);
		return ++moves != MOVES;
	}
	public static GameFactory factory = new GameFactory() {
		public Game getGame() {
			return new Chess();
		}
	};
}

public class Games {
	public static void playGame(GameFactory factory) {
		Game game = factory.getGame();
		while(game.move());
	}
	
	public static void main(String[] args) {
		playGame(Checkers.factory);
		playGame(Chess.factory);
	}
}/*Output:
Checkers move 0
Checkers move 1
Checkers move 2
Chess move 0
Chess move 1
Chess move 2
Chess move 3
*///:~
