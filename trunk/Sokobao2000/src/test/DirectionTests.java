package test;

import java.awt.Point;

import main.directions.East;
import main.directions.North;
import main.directions.South;
import main.directions.West;

import org.junit.Assert;
import org.junit.Test;

public class DirectionTests {
	
	@Test
	public void newPositionEast() {
		East east = East.getInstance();
		Point originalPosition = new Point(0, 0);
		
		Assert.assertEquals(new Point(1, 0), east.newPosition(originalPosition));
	}
	
	@Test
	public void newPositionWest() {
		West west = West.getInstance();
		Point originalPosition = new Point(1, 0);
		
		Assert.assertEquals(new Point(0, 0), west.newPosition(originalPosition));
	}
	
	@Test
	public void newPositionNorth() {
		North north = North.getInstance();
		Point originalPosition = new Point(0, 1);
		
		Assert.assertEquals(new Point(0, 0), north.newPosition(originalPosition));
	}
	
	@Test
	public void newPositionSouth() {
		South south = South.getInstance();
		Point originalPosition = new Point(0, 0);
		
		Assert.assertEquals(new Point(0, 1), south.newPosition(originalPosition));
	}

}
