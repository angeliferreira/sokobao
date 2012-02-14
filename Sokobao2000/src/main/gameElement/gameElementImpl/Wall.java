package main.gameElement.gameElementImpl;

import java.awt.Point;

import main.gameElement.GameElement;

public class Wall extends GameElement {

	public Wall(Point position) {
		this.position = position;
		this.singleName = 'W';
	}
	
	public Wall() {
		setSingleName('W');
	}
	
	public boolean isWall() {
		return true;
	}
	
}
