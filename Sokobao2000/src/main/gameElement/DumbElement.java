package main.gameElement;

import java.awt.Point;

public class DumbElement extends GameElement {

	public DumbElement(Point position) {
		this.position = position;
		this.singleName = ' ';
	}
	
	public boolean isDumbElement() {
		return true;
	}
	
}
