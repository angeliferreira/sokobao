package br.com.lemao.direction;

import java.awt.Point;

public class East implements Direction {

	public Point newPosition(Point originalPosition) {
		return new Point(originalPosition.x + 1, originalPosition.y);
	}

}
