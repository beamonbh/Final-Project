package application;

/**
 * Class FinishTile is the object where the Pawn has to get to win the game.
 * The class sets the Pawn at its position to win
 * 
 */
public class FinishTile extends Tile
{
    // instance variables - replace the example below with your own
    private Color color;

    /**
     * Constructor for objects of class FinishTile
     * @param Color color sets the color of the FinishTile
     */
    public FinishTile(Color color)
    {
        // initialise instance variables
        color = this.color;
    }

    /**
     * @param Pawn p places the pawn at the FinishTile location
     * @throws IllegalArgumentException if p equals null.
     * This won't usually happen.
     * Prints out to win the game.
     * 
     */
    public void setPawn(Pawn p){
        if (p == null)
        throw new IllegalArgumentException("Pawn cannot be null");
        p.goToFinish();
        System.out.println("Winner!");
    }
    
    /**
     * Converts Tiles to strings
     */
     public String toString(){
     	return "[	Finish   ]";
     }
}
