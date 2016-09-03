package br.com.lemao.directions;

import java.awt.Point;

public class South implements Direction {

	public Point newPosition(Point originalPosition) {
		return new Point(originalPosition.x, originalPosition.y + 1);
	}

}
