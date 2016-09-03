package br.com.lemao;

import br.com.lemao.directions.East;
import br.com.lemao.directions.North;
import br.com.lemao.directions.South;
import br.com.lemao.directions.West;

public class Sokobao {

	private Grid grid;
		
	public Sokobao() {
		// TODO
		grid = LevelGame.gridLevel1();
	}
	
	public Sokobao(Grid grid) {
		this.grid = grid;
	}

	public void moveHeroEast() {
		grid.moveHero(new East());
	}

	public void moveHeroWest() {
		grid.moveHero(new West());
	}
	
	public void moveHeroNorth() {
		grid.moveHero(new North());
	}

	public void moveHeroSouth() {
		grid.moveHero(new South());
	}
	
	public Grid getGrid() {
		return grid;
	}
	
}
