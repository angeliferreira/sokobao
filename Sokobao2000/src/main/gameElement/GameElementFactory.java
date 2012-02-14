package main.gameElement;

import java.awt.Point;

import main.gameElement.gameElementImpl.Block;
import main.gameElement.gameElementImpl.EmptyElement;
import main.gameElement.gameElementImpl.Hero;
import main.gameElement.gameElementImpl.Target;
import main.gameElement.gameElementImpl.Wall;

public class GameElementFactory {
	
	public static GameElement newInstance(char elementSingleName, Point position) {
		
		if (elementSingleName == 'H') return new Hero(position);
		
		if (elementSingleName == 'W') return new Wall(position);
		
		if (elementSingleName == 'B') return new Block(position);
		
		if (elementSingleName == 'X') return new Target(position);
		
		if (elementSingleName == ' ') return new EmptyElement(position);
		
		return null;
	}

	public static GameElement newInstance(char elementSingleName) {
		if (elementSingleName == 'H') return new Hero();
		if (elementSingleName == 'W') return new Wall();
		if (elementSingleName == 'B') return new Block();
		if (elementSingleName == ' ') return new EmptyElement();
		if (elementSingleName == 'X') return new Target();
		
		return null;
	}

}
