package main.gameElement;


import main.gameElement.gameElementImpl.Block;
import main.gameElement.gameElementImpl.EmptyElement;
import main.gameElement.gameElementImpl.Hero;
import main.gameElement.gameElementImpl.Target;
import main.gameElement.gameElementImpl.Wall;

public class GameElementFactory {
	
	public static GameElement newHero() {
		return new Hero();
	}

	public static GameElement newWall() {
		return new Wall();
	}

	public static GameElement newBlock() {
		return new Block();
	}

	public static GameElement newDumbElement() {
		return new DumbElement();
	}

}
