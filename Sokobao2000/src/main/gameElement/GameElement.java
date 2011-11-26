package main.gameElement;

import java.awt.Point;

public abstract class GameElement {
	
	protected Point position;

	public void setPosition(Point position) {
		this.position = position;
	}

	public Point getPosition() {
		return position;
	}
	
}
