package main.core;

import java.awt.Point;



public class BoardGame {

	private Cell[][] matrix;
	
	public BoardGame() {
		matrix = new Cell[5][5];
		
		for (int i = 0; i < this.matrix.length; i++) {
			for (int j = 0; j < this.matrix.length; j++) {
				matrix[i][j] = Cell.newCellWithDumbElement(new Point(j, i));
			}
		}
	}
	
	public String[] status() {
		
		String[] result = new String[5];
		String row = new String();
		
		for (int i = 0; i < this.matrix.length; i++) {
			for (int j = 0; j < this.matrix.length; j++) {
				row.concat(matrix[i][j].toString()); 
			}
			result[i] = row;
			row = new String();
		}
		return result;
	}	

}
