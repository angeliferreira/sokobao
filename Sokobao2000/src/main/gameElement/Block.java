package main.gameElement;

import java.awt.Point;

public class Block extends GameElement {

	public Block(Point position) {
		this.position = position;
		this.singleName = 'B';
	}
	
	public boolean isBlock() {
		return true;
	}
	
}
