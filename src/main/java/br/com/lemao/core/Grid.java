package br.com.lemao.core;

import static br.com.lemao.game_element.Hero.HERO;
import static br.com.lemao.game_element.Target.TARGET_WITH_HERO;

import java.awt.Point;

import org.junit.Assert;

import br.com.lemao.game_element.GameElement;

public class Grid {

	private Cell[][] grid;
		
	public Grid(Cell[][] level) {
		grid = level;
	}
	
	public Cell getCellWithHero() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j].toString().equals(HERO) || grid[i][j].toString().equals(TARGET_WITH_HERO))
					return grid[i][j];
			}
		}
		
		Assert.fail("Ops, no cell with Hero found here! :(");
		return null;		
	}

	public Cell[][] getGrid() {
		return grid;
	}
	
	public GameElement getElement(Point position) {
		return getCell(position).getSecondaryElement();
	}
	
	public GameElement getElement(int x, int y) {
		return getElement(new Point(x, y));
	}
	
	public Cell getCell(Point position) {
		return grid[position.y][position.x];
	}
	
	public void setCell(Cell cell) {
		grid[cell.getPosition().y][cell.getPosition().x] = cell; 
	}
	
	@Override
	public String toString() {
		return grid.toString();
	}
	
}
