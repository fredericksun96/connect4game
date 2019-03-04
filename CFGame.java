package hw4;

public class CFGame {
  //state[i][j]= 0 means the i,j slot is empty
  //state[i][j]= 1 means the i,j slot has red
  //state[i][j]=-1 means the i,j slot has black
  private final int[][] state;
  private boolean isRedTurn;
  
  {
    state = new int[7][6];
    for (int i=0; i<7; i++)
      for (int j=0; j<6; j++)
        state[i][j] = 0;
    isRedTurn = true; //red goes first
  }
    
  public int[][] getState() {
    int[][] ret_arr = new int[7][6];
    for (int i=0; i<7; i++)
      for (int j=0; j<6; j++)
        ret_arr[i][j] = state[i][j];
    return ret_arr;
  }
  
  public boolean isRedTurn() {
    return isRedTurn;
  }
  
  public boolean play(int c) {
    c -= 1; //just to make c now zero-indexed.
    int temp_row = 0;
    //make a while loop that will check if the column c has any empty spots. 
    //if not, return false
    while (state[temp_row][c] != 0 && temp_row < 6) { 
      temp_row++;
    }
    if (temp_row == 6) //that is, if temp_row is out of range
      return false;
    else if (isRedTurn)
      state[temp_row][c] = 1;
    else
      state[temp_row][c] = -1;

    return true;
  }
  
  public boolean isGameOver() {
    return false;
  }
  
  public int winner() {
    return 0;
  }

  public static void main(String[] args) {
    CFGame game = new CFGame();
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 7; j++) {
        System.out.print(game.state[i][j]);
      }
      System.out.print("\n");
    }
    //System.out.println(game.isRedTurn());
    System.out.println(game.getState());
  }
}
