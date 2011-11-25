package main;

import java.awt.Point;

import main.directions.Direction;
import main.directions.East;
import main.gameElement.GameElement;

public class Grid {

	private Character[][] matrix;
		
	public Grid(Character[][] level) {
		this.matrix = level;
	}
	
	public boolean isDesiredPositionAWall(Point desiredPosition) {
		return (this.matrix[desiredPosition.y][desiredPosition.x] == 'W');
	}

	public boolean isDesiredPositionABlock(Point desiredPosition) {
		return (this.matrix[desiredPosition.y][desiredPosition.x] == 'B');
	}

	public boolean isDesiredPositionABlockOrWall(Point desiredPosition) {
		return (isDesiredPositionABlock(desiredPosition) || isDesiredPositionAWall(desiredPosition));
	}
	
	public void setPositionWithValue(Point position, Character character) {
		this.matrix[position.y][position.x] = character;
	}
	
	public Point getHeroInitialPosition() {
		for (int i = 0; i < this.matrix.length; i++) {
			for (int j = 0; j < this.matrix.length; j++) {
				if (this.matrix[i][j] == 'H') return new Point(j, i);
			}
		}
		return null;		
	}

	public Character[][] getMatrix() {
		return matrix;
	}
	
//	public GameElement getElement(Point position) {
//		return this.matrix[position.y][position.x];
//	}
//	
//	public void move(GameElement element, Direction direction) {
//		Point desiredPosition = direction.newPosition(element.getPosition()); 
//		if (isDesiredPositionAWall(desiredPosition)) return;
//		if (isDesiredPositionABlock(desiredPosition)) {
//			Point blockDesiredPosition = direction.newPosition(this.getElement(desiredPosition).getPosition()); 
//			if (isDesiredPositionABlockOrWall(blockDesiredPosition)) return;
//			this.setPositionWithValue(blockDesiredPosition, 'B');
//		}
//		this.setPositionWithValue(this.heroPosition, ' ');
//		this.setPositionWithValue(desiredPosition, 'H');
//		this.heroPosition = desiredPosition;
//	}
	
}
