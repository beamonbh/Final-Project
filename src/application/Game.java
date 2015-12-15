package application;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class Game
{
    // instance variables - replace the example below with your own
    private static Player player1;
    private static Player player2;
    private static Player player3;
    private static Player player4;

    private static Board board = new Board();

    private static boolean gameOver = false;

    private static Pawn redPawn;
    private static Pawn bluePawn;
    private static Pawn yelPawn;
    private static Pawn greenPawn;

    private static int player1Moves;
    private static int player2Moves;
    private static int player3Moves;
    private static int player4Moves;



    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialize instance variables

    }

    public static void play(){
    	Scanner in = new Scanner(System.in);
        System.out.print("Player 1 enter your name :");
        String name1 = in.next();
        Scanner question = new Scanner(System.in);
        System.out.print("Player 2 enter your name :");
        String name2 = question.next();
        Scanner out = new Scanner(System.in);
        System.out.print("Player 3 enter your name :");
        String name3 = out.next();
        Scanner inn = new Scanner(System.in);
        System.out.print("Player 4 enter your name :");
        String name4 = inn.next();

        player1 = new Player(name1,Color.RED);
        player2 = new Player(name2,Color.BLUE);
        player3 = new Player(name3,Color.YELLOW);
        player4 = new Player(name4,Color.GREEN);

        redPawn = new Pawn(Color.RED);
        bluePawn = new Pawn(Color.BLUE);
        yelPawn = new Pawn(Color.YELLOW);
        greenPawn = new Pawn(Color.GREEN);

        board.pawnHomePosition(redPawn);
        board.pawnHomePosition(bluePawn);
        board.pawnHomePosition(yelPawn);
        board.pawnHomePosition(greenPawn);

        player1Moves = 0;
        player2Moves = 0;
        player3Moves = 0;
        player4Moves = 0;

        FileWriter myWriter;
        try{
        	myWriter = new FileWriter("Winners.txt",true);
        while(!gameOver){
            Scanner sorry = new Scanner(System.in);
            System.out.println("Player 1s turn!");
            player1.playerTurn();
            Card card1 = new Card();
            System.out.println(card1.drawCard());
            if (card1.moves() == 0){
                System.out.print("Which player do you want to send home?: ");
                String sorryPlayer = sorry.next();
                if (sorryPlayer.equals(player1.getName())){
                    redPawn.goHome();
                }
                if (sorryPlayer.equals(player2.getName())){
                    bluePawn.goHome();
                }
                if (sorryPlayer.equals(player3.getName())){
                    yelPawn.goHome();
                }
                if (sorryPlayer.equals(player4.getName())){
                    greenPawn.goHome();
                }
            }
            else {
            	player1Moves += card1.moves();
                board.getTile(player1Moves).pawnPosition(redPawn);
                System.out.println(player1.getName() + " is at " + redPawn.getPosition());
            }
            if(player1Moves > board.size()){
            	System.out.println(player1.getName() + "Wins!");
            	myWriter.write(player1.getName());
            	gameOver = true;
            }
            player1.endTurn();


            player2.playerTurn();
            System.out.println("Player 2s turn!");
            card1 = new Card();
            System.out.println(card1.drawCard());
            if (card1.moves() == 0){
                System.out.print("Which player do you want to send home?: ");
                String sorryPlayer = sorry.next();
                if (sorryPlayer.equals(player1.getName())){
                    redPawn.goHome();
                }
                if (sorryPlayer.equals(player2.getName())){
                    bluePawn.goHome();
                }
                if (sorryPlayer.equals(player3.getName())){
                    yelPawn.goHome();
                }
                if (sorryPlayer.equals(player4.getName())){
                    greenPawn.goHome();
                }
            }

            else {
            	player2Moves += card1.moves();
                board.getTile(player2Moves).pawnPosition(bluePawn);
                System.out.println(player2.getName() + " is at " + bluePawn.getPosition());
            }
            if(player2Moves > board.size()){
            	System.out.println(player2.getName() + "Wins!");
            	myWriter.write(player2.getName());
            	gameOver = true;
            }
            player2.endTurn();


            player3.playerTurn();
            card1 = new Card();
            System.out.println("Player 3s turn!");
            System.out.println(card1.drawCard());
            if (card1.moves() == 0){
                System.out.print("Which player do you want to send home?: ");
                String sorryPlayer = sorry.next();
                if (sorryPlayer.equals(player1.getName())){
                    redPawn.goHome();
                }
                if (sorryPlayer.equals(player2.getName())){
                    bluePawn.goHome();
                }
                if (sorryPlayer.equals(player3.getName())){
                    yelPawn.goHome();
                }
                if (sorryPlayer.equals(player4.getName())){
                    greenPawn.goHome();
                }
            }

            else {
            	player3Moves += card1.moves();
                board.getTile(player3Moves).pawnPosition(redPawn);
                System.out.println(redPawn.getPosition());
            }
            if(player3Moves > board.size()){
            	System.out.println(player3.getName() + "Wins!");
            	myWriter.write(player3.getName());
            	gameOver = true;
            }
            player3.endTurn();


            player4.playerTurn();
            System.out.println("Player 4s turn!");
            card1 = new Card();
            System.out.println(card1.drawCard());
            if (card1.moves() == 0){
                System.out.print("Which player do you want to send home?: ");
                String sorryPlayer = sorry.next();
                if (sorryPlayer.equals(player1.getName())){
                    redPawn.goHome();
                }
                if (sorryPlayer.equals(player2.getName())){
                    bluePawn.goHome();
                }
                if (sorryPlayer.equals(player3.getName())){
                    yelPawn.goHome();
                }
                if (sorryPlayer.equals(player4.getName())){
                    greenPawn.goHome();
                }
            }

            else {
            	player4Moves += card1.moves();
                board.getTile(player4Moves).pawnPosition(redPawn);
                System.out.println(redPawn.getPosition());
            }
            if(player4Moves > board.size()){
            	System.out.println(player4.getName() + "Wins!");
            	myWriter.write(player4.getName());
            	gameOver = true;
            }
            player4.endTurn();
        }
        }
        catch (IOException e){

        }


    }
}
