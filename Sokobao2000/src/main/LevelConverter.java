package main;

import java.awt.Point;
import java.util.List;

import main.core.Cell;

public class LevelConverter {

	public static Grid templateToGrid(List<String> templateList) {
		Grid grid = new Grid(new Cell[10][10]);
		
		for (int i = 0; i < grid.getGrid().length; i++) {
			for (int j = 0; j < grid.getGrid().length; j++) {
				Cell cell = Cell.newInstance(String.valueOf(templateList.get(i).charAt(j)), new Point(j, i));
				grid.setCell(cell);
			}
		}
		
		return grid;
	}

}
