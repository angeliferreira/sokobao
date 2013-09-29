package test.Utils;

import main.Grid;


public class Utils {
	
	public static String bidimensionalArrayAsStringOfElementsConcatenated(Grid grid) {
		String line = new String();

		for (int i = 0; i < grid.getGrid().length; i++) {
			for (int j = 0; j < grid.getGrid().length; j++) {
				line = line + grid.getGrid()[i][j].toString();
			}
		}
				
		return line;
	}
	
	public static String gridTemplateLevel1() {
		String template =     
				    "WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W     B  W";
		template += "W H      W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1MovingHeroEast1Cell() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W     B  W";
		template += "W  H     W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1MovingHeroWest1Cell() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W     B  W";
		template += "WH       W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1MovingHeroNorth1Cell() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W H   B  W";
		template += "W        W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1MovingHeroSouth1Cell() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W     B  W";
		template += "W        W";
		template += "W H   X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroEast6Cells() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W     B  W";
		template += "W       HW";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroNorth3Cells() {
		String template =     
					"WWWWWWWWWW";
		template += "W H      W"; 
		template += "W  B   X W"; 
		template += "W     B  W";
		template += "W        W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroEast1CellAndSouth4Cells() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W     B  W";
		template += "W        W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W  H  X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroNorth2CellsAndHeroMoveBlockEast1Cell() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  HB  X W"; 
		template += "W     B  W";
		template += "W        W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroEast2CellsNorth2CellsAndHeroMoveBlockWest1Cell() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W BH   X W"; 
		template += "W     B  W";
		template += "W        W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroEast1CellNorth1CellAndHeroMoveBlockNorth1Cell() {
		String template =     
					"WWWWWWWWWW";
		template += "W  B     W"; 
		template += "W  H   X W"; 
		template += "W     B  W";
		template += "W        W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroEast2CellsSouth1CellAndHeroMoveBlockSouth1Cell() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W     B  W";
		template += "W        W";
		template += "W     X  W";
		template += "W   H    W";
		template += "W X B  B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroNorth1CellEast3CellsAndHeroMoveBlockEast2Cells() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W      HBW";
		template += "W        W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroEast2CellsNorth2CellsAndHeroMoveBlockWest2Cells() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "WBH    X W"; 
		template += "W     B  W";
		template += "W        W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1MovingHeroEast2CellsSouth1CellAndHeroMoveBlockSouth2Cells() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W     B  W";
		template += "W        W";
		template += "W     X  W";
		template += "W        W";
		template += "W X H  B W";
		template += "W   B X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1WithHorizontalPositioningHeroBlockBlock() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W      X W"; 
		template += "W   HBB  W";
		template += "W        W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1WithHorizontalPositioningBlockBlockHero() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  BBH X W"; 
		template += "W        W";
		template += "W        W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1WithVerticalPositioningBlockBlockHero() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W  B     W";
		template += "W  H     W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1WithVerticalPositioningHeroBlockBlock() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W        W";
		template += "W   H    W";
		template += "W   B X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1WithHeroOnTheTarget() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   # W"; 
		template += "W     B  W";
		template += "W        W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1WithBlockOnTheTarget() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W        W";
		template += "W        W";
		template += "W    H$  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1WithBlockOnTheTarget1() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W        W";
		template += "W        W";
		template += "W     $H W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1WithBlockOnTheTarget2() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W     B  W";
		template += "W        W";
		template += "W     $  W";
		template += "W     H  W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1WithBlockOnTheTarget3() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W        W";
		template += "W     H  W";
		template += "W     $  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1WithHeroOnTheTargetAfterMoveBlockNorth() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W     B  W";
		template += "W     B  W";
		template += "W     #  W";
		template += "W        W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1WithHeroOnTheTargetAfterMoveBlockSouth() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W        W";
		template += "W        W";
		template += "W     #  W";
		template += "W   B B  W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1WithHeroOnTheTargetAfterMoveBlockEast() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W        W";
		template += "W        W";
		template += "W     #B W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1WithHeroOnTheTargetAfterMoveBlockWest() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W        W";
		template += "W        W";
		template += "W    B#  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}

	public static String gridTemplateLevel1WithHorizontalPositioningTargetHero() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   XHW"; 
		template += "W     B  W";
		template += "W        W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1WithHorizontalPositioningHeroTarget() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B  HX W"; 
		template += "W     B  W";
		template += "W        W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1WithVerticalPositioningHeroTarget() {
		String template =     
					"WWWWWWWWWW";
		template += "W      H W"; 
		template += "W  B   X W"; 
		template += "W     B  W";
		template += "W        W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}
	
	public static String gridTemplateLevel1WithVerticalPositioningTargetHero() {
		String template =     
					"WWWWWWWWWW";
		template += "W        W"; 
		template += "W  B   X W"; 
		template += "W     BH W";
		template += "W        W";
		template += "W     X  W";
		template += "W   B    W";
		template += "W X    B W";
		template += "W     X  W";
		template += "WWWWWWWWWW";
		return template;
	}

}
