package application;

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
public class Card
{
    // instance variables - replace the example below with your own
    private int value;
    private ArrayList<String> message;
    private Random randCard;
    private int randNum;
    
    /**
     * Constructor for objects of class Card
     */
    public Card()
    {
        // initialise instance variables
        message = new ArrayList<String>();
        message.add("Sorry!");
        message.add("One");
        message.add("Two");
        message.add("Three");
        message.add("Four");
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String drawCard()
    {
        // put your code here
        randCard = new Random();
        randNum = randCard.nextInt(message.size());
        return message.get(randNum);
    }
    
    public int moves(){
        return randNum;
    }
    
    public static void main(String[] args){
        Card test = new Card();
        System.out.println(test.drawCard());
        System.out.println(test.moves());
        
    }
}