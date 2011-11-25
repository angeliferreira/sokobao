package main;

import java.awt.Point;

public class Grid {

	private Character[][] matrix;
		
	public Grid(Character[][] level) {
		this.matrix = level;
	}
	
	public boolean isDesiredPositionAWall(Point desiredPosition) {
		return (this.getMatrix()[desiredPosition.y][desiredPosition.x] == 'W');
	}

	public boolean isDesiredPositionABlock(Point desiredPosition) {
		return (this.getMatrix()[desiredPosition.y][desiredPosition.x] == 'B');
	}

	public boolean isDesiredPositionABlockOrWall(Point desiredPosition) {
		return (isDesiredPositionABlock(desiredPosition) || isDesiredPositionAWall(desiredPosition));
	}
	
	public void setPositionWithValue(Point position, Character character) {
		this.getMatrix()[position.y][position.x] = character;
	}
	
	public Point getHeroInitialPosition() {
		for (int i = 0; i < this.getMatrix().length; i++) {
			for (int j = 0; j < this.getMatrix().length; j++) {
				if (this.getMatrix()[i][j] == 'H') return new Point(j, i);
			}
		}
		return null;		
	}

	public Character[][] getMatrix() {
		return matrix;
	}
	
}
