import java.util.Random;
import java.util.Scanner;

public class HelloDreamWorld {
	
	public static int PLAYER_ROW = 0;
	public static int PLAYER_COL = 0;
	
	public static void initBoard(char[][] gamearray) {
	    for(int grow = 0; grow <= 15; grow ++)
	    {
	        for(int gcol = 0; gcol <= 15; gcol ++)
	        {
	            //Initializing all array slots
	            gamearray[grow][gcol] = ' ';
	        }
	    }
	}
	    
	public static void clearBoard(char[][] gamearray) {
	    for(int grow = 0; grow <= 15; grow ++)
	    {
	        for(int gcol = 0; gcol <= 15; gcol ++)
	        {
	            //Initializing all array slots
	            gamearray[grow][gcol] = ' ';
	        }
	    }
	}
	    
	public static void printBoard(char[][] gamearray) {
	    gamearray[PLAYER_ROW][PLAYER_COL] = 'P';
		
		for(int grow = 0; grow <= 15; grow ++)
	    {
	        System.out.println("------------------------------------------------------------------");
	        //System.out.println();

	        for(int gcol = 0; gcol <= 15; gcol ++)
	        {
	        	System.out.print(" " + (char)124 + " " + gamearray[grow][gcol]);
	        }
	        System.out.print(" " + (char)124);
	        System.out.println();
	    }
	    System.out.print("------------------------------------------------------------------");
	    System.out.println();
	    System.out.println();
	    System.out.println();
	}
	
	public static void move(char[][] gamearray) {
        Scanner console = new Scanner(System.in);
        System.out.println("Which way would you like to move(WASD)?: ");
        char inputDirection = console.next().charAt(0);

		if(inputDirection == 'W')
			if (PLAYER_ROW != 0)
				PLAYER_ROW --; 
			else 
				System.out.println("Can't leave the world!");
		else if(inputDirection == 'A')
			if (PLAYER_COL != 0)
				PLAYER_COL --;
			else 
				System.out.println("Can't leave the world!");
		else if(inputDirection == 'S')
			if (PLAYER_ROW != 15)
				PLAYER_ROW ++;
			else 
				System.out.println("Can't leave the world!");
		else //if(inputDirection == 'D')
			if (PLAYER_COL != 15)
				PLAYER_COL ++;
			else 
				System.out.println("Can't leave the world!");
        
		clearBoard(gamearray);
		printBoard(gamearray);
        console.close();
	}
	
	public static void main(String[] args) {
		char[][] gamearray = new char[16][16];
		
		initBoard(gamearray);
		printBoard(gamearray);
		while((PLAYER_ROW < 15) && (PLAYER_COL < 15))
			move(gamearray);
	}
}