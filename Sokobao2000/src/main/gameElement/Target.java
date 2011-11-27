package main.gameElement;

import java.awt.Point;

public class Target extends GameElement {

	public Target(Point position) {
		this.position = position;
		this.singleName = 'X';
	}
	
	public boolean isTarget() {
		return true;
	}
	
}
