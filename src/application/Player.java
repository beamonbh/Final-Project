package application;

/**
 * Player is a class that constructs the human palyers within the game.
 * The player is set to the parameters name and color that sets the 
 * name and color to the player.
 * 
 */

import java.util.Scanner;
public class Player
{
    // instance variables - replace the example below with your own
    private String name;
    private Color playerColor;
    private boolean card;
    private boolean endTurn;
    private Card playerCard;
    /**
     * Constructor for objects of class Player
     * @param name string sets name
     * @param color Color sets color
     * @throws IllegalArgumentException if name.length() < 3
     * 
     */
    public Player(String name, Color color){
        if(name.length() < 3)
            throw new IllegalArgumentException("error");
        
		setColor(color);  
		setName(name); 
	}
	
	/**
	 * @param c Color sets color
	 */
	public void setColor(Color c){
		playerColor = c; 
	}
	
	/**
	 * @return Color playerColor
	 */
	public Color getColor(){
		return playerColor; 
	}
    
	/**
	 * sets boolean card to true
	 */
    public void drawnCard(){
        card = true;
    }
    
    /**
     * @param name String sets name
     */
    public void setName(String name){
        if(name.length() < 3)
            throw new IllegalArgumentException("error");
        name = this.name;
    }
    
    /**
     * @return String name
     */
    public String getName(){
        return name;
    }
    
    /**
     * Initializes the player's turn
     */
    public void playerTurn(){
        endTurn = false;
        while(!card){
            drawCard();
        }
        
    }
    
    /**
     * Creates boolean to ask player if they want a card.
     * If they do not enter YES program continues to ask question
     * until they do so.
     */
    public void drawCard(){
        Scanner getCard = new Scanner(System.in);
        System.out.print("Enter YES for next card: ");
        String input = getCard.next();
        while (!input.equals("YES")){
        	if(!input.equals("YES")){
        		System.out.print("Enter YES for next card: ");
        		input = getCard.next();
        	}
        	
        }
        drawnCard();
    }
    
    /**
     * @returns boolean endTurn to false.
     */
    public boolean endTurn(){
        assert endTurn();
        return endTurn = false;
    }
    
    /**
     * A test class that verifies that the Illegal Argument is caught.
     * It works!
     */
//    public static void main(String[] args){
//        try{
//          Scanner in = new Scanner(System.in); 
//          System.out.print("Enter a name larger than 3 characters: ");
//          String name = in.next();
//          Player player1 = new Player(name,Color.RED);
//        } catch(IllegalArgumentException x){
//            System.out.println("Please enter valid name. ");
//        }
//    }
}
