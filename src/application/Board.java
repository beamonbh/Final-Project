package application;

/**
 * Write a description of class Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class Board {
  private ArrayList<Tile> board;

  private HomeTile redHome;
  private HomeTile blueHome;
  private HomeTile yelHome;
  private HomeTile greenHome;

  private FinishTile redEnd;
  private FinishTile blueEnd;
  private FinishTile yelEnd;
  private FinishTile greenEnd;

  public Board() {
    board = new ArrayList<Tile>(21);

    redHome = new HomeTile(Color.RED);
    blueHome = new HomeTile(Color.BLUE);
    yelHome = new HomeTile(Color.YELLOW);
    greenHome = new HomeTile(Color.GREEN);

    redEnd = new FinishTile(Color.RED);
    blueEnd = new FinishTile(Color.BLUE);
    yelEnd = new FinishTile(Color.YELLOW);
    greenEnd = new FinishTile(Color.GREEN);

    for (int i = 0; i < 21; i++){
        Tile space = new Tile();
        space.setPosition(i);
        board.add(space);
    }
    board.set(0, redHome);
    board.set(board.size()-1, redEnd);
    for (Tile t : board){
    	System.out.println(t.toString());
    }
    
  }

  public boolean pawnPosition(int x){
      return board.get(x).getInUse();
    }

  public void removePawn(int x){
      if (pawnPosition(x)){
          board.get(x);
        }

    }

  public Tile getTile(int x){
      return board.get(x);
    }

  public void pawnHomePosition(Pawn p){
      if (p.getColor() == Color.RED){
          redHome.setPawn(p);
        }
      if (p.getColor() == Color.BLUE){
          blueHome.setPawn(p);
        }
      if (p.getColor() == Color.YELLOW){
          yelHome.setPawn(p);
        }
      if (p.getColor() == Color.GREEN){
          greenHome.setPawn(p);
        }
    }

  public void pawnEndPosition(Pawn p){
      if (p.getColor() == Color.RED){
          redEnd.setPawn(p);
        }
      if (p.getColor() == Color.BLUE){
          blueEnd.setPawn(p);
        }
      if (p.getColor() == Color.YELLOW){
          yelEnd.setPawn(p);
        }
      if (p.getColor() == Color.GREEN){
          greenEnd.setPawn(p);
        }
    }
  public static void main(String[] args){
	  Board b = new Board();
	  System.out.print(b);
  }
  
}
