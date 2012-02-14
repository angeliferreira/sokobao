package main.core;

import main.gameElement.GameElement;
import main.gameElement.GameElementFactory;

public class Cell {

	private GameElement primaryElement;
	private GameElement secondaryElement;

	private Cell() { }
	
	private Cell(GameElement gameElement) {
		Cell cell = new Cell();
		cell.setSecondaryElement(gameElement);
	}

	public static Cell newCellWithDumbElement() {
		Cell cell = new Cell();
		cell.setSecondaryElement(GameElementFactory.newInstance(' '));
		return cell;
	}

	public static Cell newCellWithWallElement() {
		Cell cell = new Cell();
		cell.setSecondaryElement(GameElementFactory.newInstance('W'));
		return cell;
	}
	
	public GameElement getSecondaryElement() {
		return secondaryElement;
	}

	private void setSecondaryElement(GameElement gameElement) {
		secondaryElement = gameElement;
	}

	public GameElement getPrimaryElement() {
		return primaryElement;
	}

	@Override
	public String toString() {
		return getSecondaryElement().toString();
	}
}
