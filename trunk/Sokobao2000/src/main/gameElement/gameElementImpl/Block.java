package main.gameElement.gameElementImpl;

import java.awt.Point;

import main.gameElement.GameElement;

public class Block extends GameElement {

	public Block(Point position) {
		this.position = position;
		this.singleName = 'B';
	}
	
	public Block() {
		setSingleName('B');
	}

	public boolean isBlock() {
		return true;
	}
	
}
