package main;

import java.util.List;

public class LevelConverter {

	public static Grid templateToGrid(List<String> templateList) {
		Character[][] array = new Character[10][10];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = templateList.get(i).charAt(j);
			}
		}
		return new Grid(array);
	}

}
