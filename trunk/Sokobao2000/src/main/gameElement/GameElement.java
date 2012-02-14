package main.gameElement;

import java.awt.Point;

public abstract class GameElement {
	
	protected Point position;
	protected char singleName;

	public void setPosition(Point position) {
		this.position = position;
	}

	public Point getPosition() {
		return position;
	}

	public void setSingleName(char singleName) {
		this.singleName = singleName;
	}

	public char getSingleName() {
		return singleName;
	}
	
	public boolean isHero() {
		return false;
	}
	
	public boolean isWall() {
		return false;
	}
	
	public boolean isBlock() {
		return false;
	}
	
	public boolean isDumbElement() {
		return false;
	}
	
	public boolean isTarget() {
		return false;
	}
	
	@Override
	public String toString() {
		return String.valueOf(getSingleName());
	}
	
}
