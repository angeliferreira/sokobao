package main.gameElement;

import java.awt.Point;

public class Wall extends GameElement {

	public Wall(Point position) {
		this.position = position;
		this.singleName = 'W';
	}
	
	public boolean isWall() {
		return true;
	}
	
}
