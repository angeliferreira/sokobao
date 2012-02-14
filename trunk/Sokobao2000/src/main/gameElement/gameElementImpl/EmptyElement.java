package main.gameElement.gameElementImpl;

import java.awt.Point;

import main.gameElement.GameElement;

public class EmptyElement extends GameElement {

	public EmptyElement(Point position) {
		this.position = position;
		this.singleName = ' ';
	}
	
	public EmptyElement() {
		setSingleName(' ');
	}

	public boolean isDumbElement() {
		return true;
	}
	
}
