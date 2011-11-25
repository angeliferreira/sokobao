package main.gameElement;

import java.awt.Point;

public abstract class GameElement {
	
	private Point position;

	public void setPosition(Point position) {
		this.position = position;
	}

	public Point getPosition() {
		return position;
	}
	
}
