package br.com.lemao.utils;

import br.com.lemao.core.Grid;

public class Utils {
	
	public static String bidimensionalArrayAsStringOfElementsConcatenated(Grid grid) {
		StringBuilder line = new StringBuilder();

		for (int i = 0; i < grid.getGrid().length; i++) {
			for (int j = 0; j < grid.getGrid().length; j++) {
				line.append(grid.getGrid()[i][j].toString());
			}
		}
				
		return line.toString();
	}
	
}
