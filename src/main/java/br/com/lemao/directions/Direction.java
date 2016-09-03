package br.com.lemao.directions;

import java.awt.Point;

public interface Direction {

	Point newPosition(Point originalPosition);
	
}
