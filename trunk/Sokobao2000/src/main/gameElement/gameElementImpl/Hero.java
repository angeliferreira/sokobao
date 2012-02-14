package main.gameElement.gameElementImpl;

import java.awt.Point;

import main.gameElement.GameElement;

public class Hero extends GameElement {

	public Hero(Point position) {
		this.position = position;
		setSingleName('H');
	}
	
	public Hero() {
		setSingleName('H');
	}

	public boolean isHero() {
		return true;
	}
	
}
