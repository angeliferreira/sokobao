package test.Utils;

import java.util.ArrayList;
import java.util.List;

import main.Grid;
import main.LevelConverter;

public class LevelTest {
	
	public static Grid gridTemplateLevel1MovingHeroNorth1CellEast3CellsAndHeroMoveBlockEast2Cells() {
		List<String> listTemplate = new ArrayList<String>();
		listTemplate.add("WWWWWWWWWW"); 
		listTemplate.add("W        W"); 
		listTemplate.add("W  B   X W"); 
		listTemplate.add("W      HBW");
		listTemplate.add("W        W");
		listTemplate.add("W     X  W");
		listTemplate.add("W   B    W");
		listTemplate.add("W X    B W");
		listTemplate.add("W     X  W");
		listTemplate.add("WWWWWWWWWW");
		
		return LevelConverter.templateToGrid(listTemplate);
	}

	public static Grid gridTemplateLevel1MovingHeroEast2CellsNorth2CellsAndHeroMoveBlockWest2Cells() {
		List<String> listTemplate = new ArrayList<String>();
		listTemplate.add("WWWWWWWWWW"); 
		listTemplate.add("W        W"); 
		listTemplate.add("WBH    X W"); 
		listTemplate.add("W     B  W");
		listTemplate.add("W        W");
		listTemplate.add("W     X  W");
		listTemplate.add("W   B    W");
		listTemplate.add("W X    B W");
		listTemplate.add("W     X  W");
		listTemplate.add("WWWWWWWWWW");
		
		return LevelConverter.templateToGrid(listTemplate);
	}

	public static Grid gridTemplateLevel1MovingHeroEast1CellNorth1CellAndHeroMoveBlockNorth1Cell() {
		List<String> listTemplate = new ArrayList<String>();
		listTemplate.add("WWWWWWWWWW"); 
		listTemplate.add("W  B     W"); 
		listTemplate.add("W  H   X W"); 
		listTemplate.add("W     B  W");
		listTemplate.add("W        W");
		listTemplate.add("W     X  W");
		listTemplate.add("W   B    W");
		listTemplate.add("W X    B W");
		listTemplate.add("W     X  W");
		listTemplate.add("WWWWWWWWWW");
		
		return LevelConverter.templateToGrid(listTemplate);
	}

	public static Grid gridTemplateLevel1MovingHeroEast2CellsSouth1CellAndHeroMoveBlockSouth2Cells() {
		List<String> listTemplate = new ArrayList<String>();
		listTemplate.add("WWWWWWWWWW"); 
		listTemplate.add("W        W"); 
		listTemplate.add("W  B   X W"); 
		listTemplate.add("W     B  W");
		listTemplate.add("W        W");
		listTemplate.add("W     X  W");
		listTemplate.add("W        W");
		listTemplate.add("W X H  B W");
		listTemplate.add("W   B X  W");
		listTemplate.add("WWWWWWWWWW");
		
		return LevelConverter.templateToGrid(listTemplate);
	}

	public static Grid gridTemplateLevel1WithHorizontalPositioningHeroBlockBlock() {
		List<String> listTemplate = new ArrayList<String>();
		listTemplate.add("WWWWWWWWWW"); 
		listTemplate.add("W        W"); 
		listTemplate.add("W      X W"); 
		listTemplate.add("W   HBB  W");
		listTemplate.add("W        W");
		listTemplate.add("W     X  W");
		listTemplate.add("W   B    W");
		listTemplate.add("W X    B W");
		listTemplate.add("W     X  W");
		listTemplate.add("WWWWWWWWWW");
		
		return LevelConverter.templateToGrid(listTemplate);
	}

	public static Grid gridTemplateLevel1WithHorizontalPositioningBlockBlockHero() {
		List<String> listTemplate = new ArrayList<String>();
		listTemplate.add("WWWWWWWWWW"); 
		listTemplate.add("W        W"); 
		listTemplate.add("W  BBH X W"); 
		listTemplate.add("W        W");
		listTemplate.add("W        W");
		listTemplate.add("W     X  W");
		listTemplate.add("W   B    W");
		listTemplate.add("W X    B W");
		listTemplate.add("W     X  W");
		listTemplate.add("WWWWWWWWWW");
		
		return LevelConverter.templateToGrid(listTemplate);
	}

	public static Grid gridTemplateLevel1WithVerticalPositioningBlockBlockHero() {
		List<String> listTemplate = new ArrayList<String>();
		listTemplate.add("WWWWWWWWWW"); 
		listTemplate.add("W        W"); 
		listTemplate.add("W  B   X W"); 
		listTemplate.add("W  B     W");
		listTemplate.add("W  H     W");
		listTemplate.add("W     X  W");
		listTemplate.add("W   B    W");
		listTemplate.add("W X    B W");
		listTemplate.add("W     X  W");
		listTemplate.add("WWWWWWWWWW");
		
		return LevelConverter.templateToGrid(listTemplate);
	}

	public static Grid gridTemplateLevel1WithVerticalPositioningHeroBlockBlock() {
		List<String> listTemplate = new ArrayList<String>();
		listTemplate.add("WWWWWWWWWW"); 
		listTemplate.add("W        W"); 
		listTemplate.add("W  B   X W"); 
		listTemplate.add("W        W");
		listTemplate.add("W   H    W");
		listTemplate.add("W   B X  W");
		listTemplate.add("W   B    W");
		listTemplate.add("W X    B W");
		listTemplate.add("W     X  W");
		listTemplate.add("WWWWWWWWWW");
		
		return LevelConverter.templateToGrid(listTemplate);
	}
	
	public static Grid gridTemplateLevel1WithHorizontalPositioningHeroBlockTarget() {
		List<String> listTemplate = new ArrayList<String>();
		listTemplate.add("WWWWWWWWWW"); 
		listTemplate.add("W        W"); 
		listTemplate.add("W  B   X W"); 
		listTemplate.add("W        W");
		listTemplate.add("W        W");
		listTemplate.add("W   HBX  W");
		listTemplate.add("W   B    W");
		listTemplate.add("W X    B W");
		listTemplate.add("W     X  W");
		listTemplate.add("WWWWWWWWWW");
		
		return LevelConverter.templateToGrid(listTemplate);
	}
	
	public static Grid gridTemplateLevel1WithHorizontalPositioningTargetBlockHero() {
		List<String> listTemplate = new ArrayList<String>();
		listTemplate.add("WWWWWWWWWW"); 
		listTemplate.add("W        W"); 
		listTemplate.add("W  B   X W"); 
		listTemplate.add("W        W");
		listTemplate.add("W        W");
		listTemplate.add("W     XBHW");
		listTemplate.add("W   B    W");
		listTemplate.add("W X    B W");
		listTemplate.add("W     X  W");
		listTemplate.add("WWWWWWWWWW");
		
		return LevelConverter.templateToGrid(listTemplate);
	}
	
	public static Grid gridTemplateLevel1WithVerticalPositioningTargetBlockHero() {
		List<String> listTemplate = new ArrayList<String>();
		listTemplate.add("WWWWWWWWWW"); 
		listTemplate.add("W        W"); 
		listTemplate.add("W  B   X W"); 
		listTemplate.add("W     B  W");
		listTemplate.add("W        W");
		listTemplate.add("W     X  W");
		listTemplate.add("W     B  W");
		listTemplate.add("W X   HB W");
		listTemplate.add("W     X  W");
		listTemplate.add("WWWWWWWWWW");
		
		return LevelConverter.templateToGrid(listTemplate);
	}
	
	public static Grid gridTemplateLevel1WithVerticalPositioningHeroBlockTarget() {
		List<String> listTemplate = new ArrayList<String>();
		listTemplate.add("WWWWWWWWWW"); 
		listTemplate.add("W        W"); 
		listTemplate.add("W  B   X W"); 
		listTemplate.add("W     H  W");
		listTemplate.add("W     B  W");
		listTemplate.add("W     X  W");
		listTemplate.add("W   B    W");
		listTemplate.add("W X    B W");
		listTemplate.add("W     X  W");
		listTemplate.add("WWWWWWWWWW");
		
		return LevelConverter.templateToGrid(listTemplate);
	}
	
//  INITIAL GRID LEVEL 1
//	("WWWWWWWWWW") 
//	("W        W"); 
//	("W  B   X W"); 
//	("W     B  W");
//	("W H      W");
//	("W     X  W");
//	("W   B    W");
//	("W X    B W");
//	("W     X  W");
//	("WWWWWWWWWW");

}
