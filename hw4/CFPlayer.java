package hw4;

public interface CFPlayer {
	  public static int nRows = 6; public static int nCols = 7;

  int nextMove(CFGame g);
  //return value of getName cannot be "draw"
  String getName();
}