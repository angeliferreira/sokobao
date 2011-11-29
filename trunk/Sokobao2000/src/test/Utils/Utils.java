package test.Utils;

import main.Grid;


public class Utils {
	
	public static String bidimensionalArrayAsStringOfElementsConcatenated(Grid grid) {
		String line = new String();

		for (int i = 0; i < grid.getMatrix().length; i++) {
			for (int j = 0; j < grid.getMatrix().length; j++) {
				line = line + grid.getMatrix()[i][j].getSingleName();
			}
		}
				
		return line;
	}
	
	public static String gridTemplateLevel1() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  B   X W"; 
		template = template + "W     B  W";
		template = template + "W H      W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1MovingHeroEast1Cell() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  B   X W"; 
		template = template + "W     B  W";
		template = template + "W  H     W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1MovingHeroWest1Cell() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  B   X W"; 
		template = template + "W     B  W";
		template = template + "WH       W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1MovingHeroNorth1Cell() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  B   X W"; 
		template = template + "W H   B  W";
		template = template + "W        W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1MovingHeroSouth1Cell() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  B   X W"; 
		template = template + "W     B  W";
		template = template + "W        W";
		template = template + "W H   X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroEast6Cells() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  B   X W"; 
		template = template + "W     B  W";
		template = template + "W       HW";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroNorth3Cells() {
		String template =     "WWWWWWWWWW";
		template = template + "W H      W"; 
		template = template + "W  B   X W"; 
		template = template + "W     B  W";
		template = template + "W        W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroEast1CellAndSouth4Cells() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  B   X W"; 
		template = template + "W     B  W";
		template = template + "W        W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W  H  X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroNorth2CellsAndHeroMoveBlockEast1Cell() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  HB  X W"; 
		template = template + "W     B  W";
		template = template + "W        W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroEast2CellsNorth2CellsAndHeroMoveBlockWest1Cell() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W BH   X W"; 
		template = template + "W     B  W";
		template = template + "W        W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroEast1CellNorth1CellAndHeroMoveBlockNorth1Cell() {
		String template =     "WWWWWWWWWW";
		template = template + "W  B     W"; 
		template = template + "W  H   X W"; 
		template = template + "W     B  W";
		template = template + "W        W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroEast2CellsSouth1CellAndHeroMoveBlockSouth1Cell() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  B   X W"; 
		template = template + "W     B  W";
		template = template + "W        W";
		template = template + "W     X  W";
		template = template + "W   H    W";
		template = template + "W X B  B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroNorth1CellEast3CellsAndHeroMoveBlockEast2Cells() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  B   X W"; 
		template = template + "W      HBW";
		template = template + "W        W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroEast2CellsNorth2CellsAndHeroMoveBlockWest2Cells() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "WBH    X W"; 
		template = template + "W     B  W";
		template = template + "W        W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroEast2CellsSouth1CellAndHeroMoveBlockSouth2Cells() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  B   X W"; 
		template = template + "W     B  W";
		template = template + "W        W";
		template = template + "W     X  W";
		template = template + "W        W";
		template = template + "W X H  B W";
		template = template + "W   B X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1WithHorizontalPositioningHeroBlockBlock() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W      X W"; 
		template = template + "W   HBB  W";
		template = template + "W        W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1WithHorizontalPositioningBlockBlockHero() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  BBH X W"; 
		template = template + "W        W";
		template = template + "W        W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1WithVerticalPositioningBlockBlockHero() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  B   X W"; 
		template = template + "W  B     W";
		template = template + "W  H     W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1WithVerticalPositioningHeroBlockBlock() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  B   X W"; 
		template = template + "W        W";
		template = template + "W   H    W";
		template = template + "W   B X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1WithHeroOnTheTarget() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  B   H W"; 
		template = template + "W     B  W";
		template = template + "W        W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1WithHorizontalPositioningTargetHero() {
		String template =     "WWWWWWWWWW";
		template = template + "W        W"; 
		template = template + "W  B   XHW"; 
		template = template + "W     B  W";
		template = template + "W        W";
		template = template + "W     X  W";
		template = template + "W   B    W";
		template = template + "W X    B W";
		template = template + "W     X  W";
		template = template + "WWWWWWWWWW";
		return template;
	}

}
