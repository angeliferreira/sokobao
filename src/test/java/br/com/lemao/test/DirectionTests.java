package br.com.lemao.test;

import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

import br.com.lemao.directions.East;
import br.com.lemao.directions.North;
import br.com.lemao.directions.South;
import br.com.lemao.directions.West;

public class DirectionTests {
	
	@Test
	public void newPositionEast() {
		East east = new East();
		Point originalPosition = new Point(0, 0);
		
		Assert.assertEquals(new Point(1, 0), east.newPosition(originalPosition));
	}
	
	@Test
	public void newPositionWest() {
		West west = new West();
		Point originalPosition = new Point(1, 0);
		
		Assert.assertEquals(new Point(0, 0), west.newPosition(originalPosition));
	}
	
	@Test
	public void newPositionNorth() {
		North north = new North();
		Point originalPosition = new Point(0, 1);
		
		Assert.assertEquals(new Point(0, 0), north.newPosition(originalPosition));
	}
	
	@Test
	public void newPositionSouth() {
		South south = new South();
		Point originalPosition = new Point(0, 0);
		
		Assert.assertEquals(new Point(0, 1), south.newPosition(originalPosition));
	}

}
