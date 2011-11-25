package main;

import java.awt.Point;

public class Sokobao2000 {

	private Grid grid;
	private Point heroPosition;
	
	public Sokobao2000() {
		this.grid = LevelGame.gridLevel1();
		this.heroPosition = this.grid.getHeroInitialPosition();
	}

	public void moveHeroEast() {
		int j = this.heroPosition.x;
		int i = this.heroPosition.y;
		Point heroDesiredPosition = new Point(j+1, i);
		if (isDesiredPositionAWall(heroDesiredPosition)) return;
		if (isDesiredPositionABlock(heroDesiredPosition)) {
			Point blockDesiredPosition = new Point(j+2, i);
			if (isDesiredPositionABlockOrWall(blockDesiredPosition)) return;
			this.grid.setPositionWithValue(blockDesiredPosition, 'B');
		}
		this.grid.setPositionWithValue(this.heroPosition, ' ');
		this.grid.setPositionWithValue(heroDesiredPosition, 'H');
		this.heroPosition = heroDesiredPosition;
	}

	public void moveHeroWest() {
		int j = this.heroPosition.x;
		int i = this.heroPosition.y;
		Point heroDesiredPosition = new Point(j-1, i);
		if (isDesiredPositionAWall(heroDesiredPosition)) return;
		if (isDesiredPositionABlock(heroDesiredPosition)) {
			Point blockDesiredPosition = new Point(j-2, i);
			if (isDesiredPositionABlockOrWall(blockDesiredPosition)) return;
			this.grid.setPositionWithValue(blockDesiredPosition, 'B');
		}
		this.grid.setPositionWithValue(this.heroPosition, ' ');
		this.grid.setPositionWithValue(heroDesiredPosition, 'H');
		this.heroPosition = heroDesiredPosition;
	}
	
	public void moveHeroNorth() {
		int j = this.heroPosition.x;
		int i = this.heroPosition.y;
		Point heroDesiredPosition = new Point(j, i-1);
		if (isDesiredPositionAWall(heroDesiredPosition)) return;
		if (isDesiredPositionABlock(heroDesiredPosition)) {
			Point blockDesiredPosition = new Point(j, i-2);
			if (isDesiredPositionABlockOrWall(blockDesiredPosition)) return;
			this.grid.setPositionWithValue(blockDesiredPosition, 'B');
		}
		this.grid.setPositionWithValue(this.heroPosition, ' ');
		this.grid.setPositionWithValue(heroDesiredPosition, 'H');
		this.heroPosition = heroDesiredPosition;
	}

	public void moveHeroSouth() {
		int j = this.heroPosition.x;
		int i = this.heroPosition.y;
		Point heroDesiredPosition = new Point(j, i+1);
		if (isDesiredPositionAWall(heroDesiredPosition)) return;
		if (isDesiredPositionABlock(heroDesiredPosition)) {
			Point blockDesiredPosition = new Point(j, i+2);
			if (isDesiredPositionABlockOrWall(blockDesiredPosition)) return;
			this.grid.setPositionWithValue(blockDesiredPosition, 'B');
		}
		this.grid.setPositionWithValue(this.heroPosition, ' ');
		this.grid.setPositionWithValue(heroDesiredPosition, 'H');
		this.heroPosition = heroDesiredPosition;
	}
	
	private boolean isDesiredPositionAWall(Point desiredPosition) {
		return this.grid.isDesiredPositionAWall(desiredPosition);
	}

	private boolean isDesiredPositionABlockOrWall(Point desiredPosition) {
		return this.grid.isDesiredPositionABlockOrWall(desiredPosition);
	}

	private boolean isDesiredPositionABlock(Point desiredPosition) {
		return this.grid.isDesiredPositionABlockOrWall(desiredPosition);
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
		this.heroPosition = this.grid.getHeroInitialPosition();
	}

	public Grid getGrid() {
		return this.grid;
	}

	public Point getHeroPosition() {
		return this.heroPosition;
	}
	
	public void setHeroPosition(Point heroNewPosition) {
		this.grid.setPositionWithValue(heroPosition, ' ');
		this.grid.setPositionWithValue(heroNewPosition, 'H');
		this.heroPosition = heroNewPosition;
	}

}
