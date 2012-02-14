package main.gameElement.gameElementImpl;

import java.awt.Point;

import main.gameElement.GameElement;

public class Target extends GameElement {

	public Target(Point position) {
		this.position = position;
		this.singleName = 'X';
	}
	
	public Target() {
		setSingleName('X');
	}

	public boolean isTarget() {
		return true;
	}
	
}
