package br.com.lemao.direction;

import java.awt.Point;

public class North implements Direction {

	public Point newPosition(Point originalPosition) {
		return new Point(originalPosition.x, originalPosition.y - 1);
	}

}
