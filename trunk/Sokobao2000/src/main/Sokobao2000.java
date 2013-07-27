package main;

import main.directions.East;
import main.directions.North;
import main.directions.South;
import main.directions.West;

public class Sokobao2000 {

	private Grid grid;
		
	public Sokobao2000() {
		grid = LevelGame.gridLevel1();
	}
	
	public Sokobao2000(Grid grid) {
		this.grid = grid;
	}

	public void moveHeroEast() {
		grid.moveHero(East.getInstance());
	}

	public void moveHeroWest() {
		grid.moveHero(West.getInstance());
	}
	
	public void moveHeroNorth() {
		grid.moveHero(North.getInstance());
	}

	public void moveHeroSouth() {
		grid.moveHero(South.getInstance());
	}
	
	public Grid getGrid() {
		return grid;
	}
	
}
