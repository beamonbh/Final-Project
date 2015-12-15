package application;

/**
 * Write a description of class StartTile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomeTile extends Tile
{
    // instance variables - replace the example below with your own
    
    private Tile startTile;
    private Color color;
    private Pawn pawn;

    /**
     * Constructor for objects of class HomeTile
     */
    public HomeTile(Color color)
    {
        // initialise instance variables
        color = this.color;
    }
    
    /**
     * @param Pawn pawn sets pawn to HomeTile
     */
    public void setPawn(Pawn pawn){
        if (pawn == null)
        throw new IllegalArgumentException("Pawn cannot be null");
        if (pawn.getColor() == this.color){
            pawn.goHome();
            
        }
    }
    
    /**
     * @returns pawn after removing it from the HomeTile
     */
    public Pawn removePawn(){
        pawn.leaveHome();
        return pawn;
    }
    
    /**
     * Converts Tiles to strings
     */
     public String toString(){
     	return "[	Home	]";
     }
}
