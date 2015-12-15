package application;

/**
 * Write a description of class Pawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pawn
{
    // instance variables - replace the example below with your own
    private Color color;
    private Integer position;
    private boolean atHome = false;
    private boolean atEnd = false;
    private Integer tile;

    /**
     * Constructor for objects of class Pawn
     */
    public Pawn(Color color)
    {
        // initialise instance variables
        color = this.color;
    }

    /**
     * A
     */
    public void setPosition(Integer location)
    {
        // put your code here
        position = location;
    }
    
    public Color getColor(){
        return color;
    }
    
    public int getPosition(){
        return position;
    }
    
    public void leaveHome(){
        atHome = false;
    }
    
    public void goHome(){
        atHome = true;
        position = null;
        atEnd = false;
    }
    
    public void goToFinish(){
        atHome = false;
        position = null;
        atEnd = true;
    }
    
    public void remove(){
        atHome = false;
        position = null;
        atEnd = false;
        tile = null;
    }
    
    public Integer getTile(){
        return tile;
    }
}