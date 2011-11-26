package main;

import java.awt.Point;

import main.directions.Direction;

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
	
	public Point getHeroPosition() {
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
	
//	TODO -> CHANGE RETURN TO GameElement
	public Character getElement(Point position) {
		return this.matrix[position.y][position.x];
	}
	
	public void move(Point position, Direction direction) {
		Point desiredPosition = direction.newPosition(position); 
		if (isDesiredPositionAWall(desiredPosition)) return;
		if (isDesiredPositionABlock(desiredPosition)) {
			Point blockDesiredPosition = direction.newPosition(desiredPosition); 
			if (isDesiredPositionABlockOrWall(blockDesiredPosition)) return;
			this.updatePositions(desiredPosition, blockDesiredPosition);
		}
		this.updatePositions(position, desiredPosition);
	}
	
	public void updatePositions(Point oldPosition, Point newPosition) {
//		GameElement element = this.getElement(oldPosition);
		Character element = this.getElement(oldPosition);
		
//		this.matrix[oldPosition.y][oldPosition.x] = new DumbElement();
		this.matrix[oldPosition.y][oldPosition.x] = ' ';
		
		this.matrix[newPosition.y][newPosition.x] = element;
	}

}
