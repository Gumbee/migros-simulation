package Tiles;

import Screen.Color;
import Screen.Display;
import Screen.Map;
import Tiles.TileType;


import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Tile {

    // the string that will be printed out to the map
    protected char displayChar;

    protected int positionX;
    protected int positionY;

    private Color backgroundColor;
    private Color stringColor;

    // space between the individual tiles
    private int tilePadding = 0;

    // whether the tile moves or not
    private boolean isStatic = false;

<<<<<<< HEAD
	//private TileType type;

	List<Item> items;	
=======
	private TileType type;
>>>>>>> 6678ed2e6f1e7401e4d709556ee825440d2424a4

    public Tile(char displayChar, int positionX, int positionY){
        this(displayChar, positionX, positionY, true, Color.BLUE, Color.NOBACKGROUND, TileType.EMPTY);
    }

    public Tile(char displayChar, int positionX, int positionY, boolean isStatic){
        this(displayChar, positionX, positionY, isStatic, Color.BLUE, Color.NOBACKGROUND, TileType.EMPTY);
    }

    public Tile(char displayChar, int positionX, int positionY, Color stringColor, Color backgroundColor){
        this(displayChar, positionX, positionY, true, stringColor, backgroundColor, TileType.EMPTY);
    }

    public Tile(char displayChar, int positionX, int positionY, boolean isStatic, Color stringColor, Color backgroundColor, TileType type){
        this.backgroundColor = backgroundColor;
        this.displayChar = displayChar;
        this.stringColor = stringColor;
        this.positionX = positionX;
        this.positionY = positionY;
        this.isStatic = isStatic;
<<<<<<< HEAD
	    //this.type = type;
=======
		this.type = type;	
>>>>>>> 6678ed2e6f1e7401e4d709556ee825440d2424a4
    }

    /**
     * Calculate this tile's position in the next frame in this function.
     * This would for example be where you implement a path finding algorithm.
     *
	 * This function must be overridden. Right now the movement is random and mainly for debugging
     */
    public void getNextFrame(){
		int newX = positionX, newY = positionY;
       	int x;
       	int y;


<<<<<<< HEAD
		/*switch(type) {
=======
		switch(type) {
>>>>>>> 6678ed2e6f1e7401e4d709556ee825440d2424a4
			case ITEM:
				
			break;
			case COUNTER:
			break;
			case WALL:
			break;
			case PERSON:
            x = new Random().nextInt(3) - 1;
            y = new Random().nextInt(3) - 1;

            if (Map.canPopulate(positionX + x, positionY + y, Map.nextFrameMap)) {
               	newX = newX + x;
               	newY = newY + y;
<<<<<<< HEAD
           	}
        	
			default:        	
		*/

        Map.populateTile(this, Map.nextFrameMap, newX, newY);
        this.positionX = newX;
        this.positionY = newY;

=======
               	movementPossible = true;
           	}
        	
			default:        	
				

       		Map.populateTile(this, Map.nextFrameMap, newX, newY);
			this.positionX = newX;
        	this.positionY = newY;
        	

		}
>>>>>>> 6678ed2e6f1e7401e4d709556ee825440d2424a4
    }


    public void printTile(){
        String formatString = tilePadding>0?"%-"+tilePadding+"s":"%s";
        System.out.print(String.format(formatString, Display.makeColor(""+displayChar, stringColor, backgroundColor) + ""));
    }

    final public boolean isStatic() { return isStatic; }

    final public char getDisplayCharacter() { return displayChar; }

}
