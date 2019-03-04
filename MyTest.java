import hw4.CFPlayer;
import hw4.RandomAI;
import hw4.CFGame;
import hw4.FredSunAI;
import hw4.ConsoleCF;

public class MyTest{
	public static void main(String[] args){
		RandomAI random = new RandomAI();
		//CFGame game = new CFGame();
		FredSunAI fred = new FredSunAI();

		//ConsoleCF cf = new ConsoleCF(fred);
		//cf.playOut();
		//System.out.println("The winner is " + cf.getWinner());


    CFPlayer ai1 = new FredSunAI();
    CFPlayer ai2 = new RandomAI();
    int n = 10000;
    int winCount = 0;
    for (int i = 0; i < n; i++) {
      ConsoleCF game = new ConsoleCF(ai1, ai2);
      game.playOut();
      if (game.getWinner() == ai1.getName())  
        winCount++;
    }
    System.out.print(ai1.getName() + " wins ");
    System.out.print(((double) winCount)/((double) n) * 100 + "%");
    System.out.print(" of the time.");
/*
int victor = 0;
int player_turn = 0;
for ( int zz = 0; zz < 2000; zz ++) {
			CFGame game = new CFGame();

	int[][] game2 = new int[7][6];
	game2 = game.getState();

	for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 6; j++) {
        if (game2[i][j] == -1)
          System.out.print('B');
        else if (game2[i][j] == 0)
          System.out.print('0');
        else if (game2[i][j] == 1)
          System.out.print('R');
      }
      System.out.print("\n");
    }

    ///*
    int turn = 0;
    while (!game.isGameOver()) {
    	turn++;
    System.out.print("\n");
	game2 = game.getState();

	for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 6; j++) {
        if (game2[i][j] == -1)
          System.out.print('X');
        else if (game2[i][j] == 0)
          System.out.print('0');
        else if (game2[i][j] == 1)
          System.out.print('R');
      }
      System.out.print("\n");
    }
    if (player_turn % 2 == 1) {
    	if (turn % 2 == 1)
    		game.play(random.nextMove(game));
    	else
	    	game.play(fred.nextMove(game));
	} else {
    	if (turn % 2 == 0)
    		game.play(random.nextMove(game));
    	else
	    	game.play(fred.nextMove(game));
	}

	}//*/

/*
	game.play(3);game.play(2);game.play(2);game.play(4);game.play(1); game.play(4); game.play(4);
	game.play(3);game.play(3);game.play(6);
      	game2 = game.getState();

	for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 6; j++) {
        if (game2[i][j] == -1)
          System.out.print('X');
        else if (game2[i][j] == 0)
          System.out.print('0');
        else if (game2[i][j] == 1)
          System.out.print('R');
      }
      System.out.print("\n");
    }	
	game.play(fred.nextMove(game));

	

      System.out.print("\n");
      	game2 = game.getState();

	//return finished game
	for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 6; j++) {
        if (game2[i][j] == -1)
          System.out.print('X');
        else if (game2[i][j] == 0)
          System.out.print('0');
        else if (game2[i][j] == 1)
          System.out.print('R');
      }
      System.out.print("\n");
    }	

    if (player_turn % 2 == 1 && game.winner() == -1)
    	victor++;
    else if (player_turn % 2 == 0 && game.winner() == 1)
    	victor++;


    if (game.winner() == 1) 
    	System.out.println("Red wins.");
    else if (game.winner() == -1) {
    	System.out.println("Black wins.");
    } else
    	System.out.println("Y'all bad");
player_turn++;
}
System.out.println("Fred's AI won " + (double)victor/2000*100 + " % out of 2000");
*/
	}
}