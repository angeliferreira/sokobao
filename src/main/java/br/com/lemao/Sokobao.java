package br.com.lemao;

import static br.com.lemao.game_element.Block.BLOCK;
import static br.com.lemao.game_element.Wall.WALL;

import java.awt.Point;

import br.com.lemao.core.GameLevel;
import br.com.lemao.core.Grid;
import br.com.lemao.direction.Direction;
import br.com.lemao.direction.East;
import br.com.lemao.direction.North;
import br.com.lemao.direction.South;
import br.com.lemao.direction.West;
import br.com.lemao.game_element.GameElementFactory;

public class Sokobao {

	private Grid grid;
		
	public Sokobao() {
		grid = GameLevel.gridLevel1();
	}
	
	public Sokobao(Grid grid) {
		this.grid = grid;
	}

	public void moveHeroEast() {
		moveHero(new East());
	}

	public void moveHeroWest() {
		moveHero(new West());
	}
	
	public void moveHeroNorth() {
		moveHero(new North());
	}

	public void moveHeroSouth() {
		moveHero(new South());
	}
	
	public Grid getGrid() {
		return grid;
	}
	
	private void moveHero(Direction direction) {
		Point originalHeroPosition = grid.getCellWithHero().getPosition();
		Point desiredPosition = direction.newPosition(originalHeroPosition);
		
		if (isDesiredPositionAWall(desiredPosition))
			return;
		
		if (!isDesiredPositionABlock(desiredPosition)) {
			moveGameElement(originalHeroPosition, desiredPosition);
			return;
		}
		
		Point blockDesiredPosition = direction.newPosition(desiredPosition);
		
		if (isDesiredPositionABlockOrWall(blockDesiredPosition))
			return;
		
		moveGameElements(originalHeroPosition, desiredPosition, blockDesiredPosition);
	}
	
	private boolean isDesiredPositionAWall(Point desiredPosition) {
		return WALL.equals(grid.getElement(desiredPosition).toString());
	}
	
	private boolean isDesiredPositionABlock(Point desiredPosition) {
		return BLOCK.equals(grid.getElement(desiredPosition).toString());
	}
	
	public void moveGameElement(Point originalHeroPosition, Point desiredPosition) {
		moveGameElements(originalHeroPosition, desiredPosition, null);
	}
	
	private void moveGameElements(Point originalHeroPosition, Point desiredPosition, Point blockDesiredPosition) {
		if(blockDesiredPosition != null)
			grid.getCell(blockDesiredPosition).setSecondaryElement(grid.getElement(desiredPosition));
		
		grid.getCell(desiredPosition).setSecondaryElement(grid.getElement(originalHeroPosition));
		grid.getCell(originalHeroPosition).setSecondaryElement(GameElementFactory.newDumbElement());
	}
	
	private boolean isDesiredPositionABlockOrWall(Point desiredPosition) {
		return isDesiredPositionABlock(desiredPosition) || isDesiredPositionAWall(desiredPosition);
	}
	
}
