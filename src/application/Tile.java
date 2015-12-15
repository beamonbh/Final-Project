package application;

/**
 * Tile is just a space that makes up the board.  It can see if a pawn
 * is on the the board or not.
 * @author Brielen Beamon 
 * @version (a version number or a date)
 */

public class Tile{
  private boolean inUse = false;
  private Pawn pawn;
  private int position;
  
  /**
   * Intializes constructor for Tile object.
   */
   public Tile(){
    
  }
  
  /**
   * @return boolean inUse
   */
  public boolean getInUse(){
      return inUse;
    }
    
  /**
   * @return int position
   */
  public int getPosition(){
      return position;
    }
  
  /**
   * @param boolean use is set to inUse
   */
  public void setInUse(boolean use){
      inUse = use;
    } 
  
  /**
   * @param int p sets position to p
   */
  public void setPosition(int p){
      if (p < 0)
        throw new IllegalArgumentException("Wrong number");
      position = p;
    }
    
  public void setPawn(Pawn p){
      if (p == null)
        throw new IllegalArgumentException("Pawn cannot be null");
      pawn = p;
    }  
    
  /**
   * @param Pawn p goes to position of the Tile
   */  
  public void pawnPosition(Pawn p){
      
      if (p == null)
        throw new IllegalArgumentException("Pawn cannot be null");
      if (getInUse()){
          
          pawn.remove();
          pawn.goHome();
          
          p.setPosition(position);
          setPawn(p);
          setInUse(true);
        }
        
      else{
          p.setPosition(position);
          setPawn(p);
          setInUse(true);
        }
    }
    
  /**
   * @param Pawn p removes pawn from the board
   */  
   public void removePawn(Pawn p){
      // exception should go here
      if (p == null){
        throw new IllegalArgumentException("Pawn cannot be null");}
      p.remove();
      
    }
   
   /**
    * Converts Tiles to strings
    */
    public String toString(){
    	return "[	Tile	]";
    }
  /**
   * A tester method to ensure that the try catch works.
   * It works!
   */  
  public static void main(String []args) {
        try {
            Pawn p = new Pawn(Color.RED);
            Tile t = new Tile();
            t.pawnPosition(null);
            
        } catch (IllegalArgumentException x) {
            System.out.println("Invalid integer! Please try again.");
        }
    }
}
