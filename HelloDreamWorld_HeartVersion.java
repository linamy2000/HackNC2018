import java.util.Random;
import java.util.Scanner;

public class HelloDreamWorld_HeartVersion {
	
	public static int PLAYER_ROW = 0;
	public static int PLAYER_COL = 0;
	public static int heart = 5;
	
	public static void initBoard(char[][] gamearray) {
		Random rand = new Random();
		int boardChoice = rand.nextInt(3) + 1;
		boardChoice = 1;
		
	    for(int grow = 0; grow <= 15; grow ++)
	    {
	        for(int gcol = 0; gcol <= 15; gcol ++)
	        {
	            //Initializing all array slots
	            gamearray[grow][gcol] = ' ';
	        }
	    }
	    
	    if(boardChoice == 1) {
	    	for(int i = 0; i <= 5; i ++ ) {
	    		gamearray[i][1] = 'X';	
	    	}
	    	for(int i = 7; i <= 11; i ++ ) {
	    		gamearray[i][1] = 'X';	
	    	}
	    	gamearray[7][0] = 'X';
	    	for(int i = 11; i <= 13; i ++ ) {
	    		gamearray[i][2] = 'X';	
	    	}
	    	for(int i = 13; i <= 15; i ++ ) {
	    		gamearray[i][0] = 'X';	
	    	}
	    	gamearray[15][1] = 'X';
	    	gamearray[15][2] = 'X';
	    	for(int i = 1; i <= 9; i ++ ) {
	    		gamearray[i][3] = 'X';	
	    	}
	    	for(int i = 4; i <= 9; i ++ ) {
	    		gamearray[1][i] = 'X';	
	    	}
	    	gamearray[2][9] = 'X';
	    	gamearray[3][9] = 'X';
	    	for(int i = 5; i <= 8; i ++ ) {
	    		gamearray[3][i] = 'X';	
	    	}
	    	for(int i = 11; i <= 15; i ++ ) {
	    		gamearray[1][i] = 'X';	
	    	}
	    	gamearray[2][11] = 'X';
	    	gamearray[3][11] = 'X';
	    	gamearray[3][12] = 'X';
	    	gamearray[3][13] = 'X';
	    	gamearray[3][14] = 'X';
	    	for(int i = 5; i <= 15; i ++ ) {
	    		gamearray[5][i] = 'X';	
	    	}
	    	for(int i = 5; i <= 14; i ++ ) {
	    		gamearray[7][i] = 'X';	
	    	}
	    	gamearray[6][5] = 'X';
	    	for(int i = 4; i <= 8; i ++ ) {
	    		gamearray[9][i] = 'X';	
	    	}
	    	for(int i = 10; i <= 15; i ++ ) {
	    		gamearray[9][i] = 'X';	
	    	}
	    	gamearray[10][8] = 'X';
	    	for(int i = 4; i <= 8; i ++ ) {
	    		gamearray[11][i] = 'X';	
	    	}
	    	for(int i = 10; i <= 15; i ++ ) {
	    		gamearray[11][i] = 'X';	
	    	}
	    	for(int i = 12; i <= 14; i ++ ) {
	    		gamearray[i][4] = 'X';	
	    	}
	    	for(int i = 11; i <= 14; i ++ ) {
	    		gamearray[13][i] = 'X';	
	    	}
	    	for(int i = 11; i <= 14; i ++ ) {
	    		gamearray[14][i] = 'X';	
	    	}
	    	gamearray[14][5] = 'X';
	    	gamearray[14][6] = 'X';
	    	gamearray[14][7] = 'X';
	    	gamearray[13][7] = 'X';
	    	gamearray[13][8] = 'X';
	    	gamearray[13][9] = 'X';
	    	gamearray[14][9] = 'X';
	    	gamearray[15][9] = 'X';
	    	gamearray[15][14] = 'X';
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
	
	public static boolean encounter() {
		Random rando = new Random();
		int chance = rando.nextInt(3) + 1;
		boolean isMonster = true;
		if (chance > 1)
			isMonster = false;
		return isMonster;
	}
	
	public static boolean question() {
		String[] theQuestions = {"1 + 1","3 + 5","2 + 2","29 + 13","50 + 61","11 - 1","20 + 10","15 - 12","4 - 1","26 - 4","100 - 99","2 x 2","3 x 2","17 x 0","28 x 1","28 / 7","40 / 10","30 / 6","9 ^ 2","Edwin has 3 eggs in one hand and 4 eggs in another hand. How many eggs does Edwin have in total?","Sahil has 5 mangoes. He is hungry and eats 2 mangoes. How many mangoes does Sahil have left?","Shara has 9 shirts. She gives a shirt to each of her 9 friends. How many shirts does Shara have left?","Arpita has 10 birthday cakes. 5 friends have birthdays this week. How many cakes would each friend get?","Lindsay has 8 apples in her basket. She wants to split the apples between 4 people. How many apples does each person get?","Simran has 2 hands and 4 flowers in each hand. How many flowers does she have in total?","Jeff made 45 blueberry pancakes for his friend's birthday party. There will be 15 people at the party. How many pancakes will each person at the party get?","Amy has 4 bananas. She cuts each banana into 4 pieces. How many pieces of bananas does she have?"};
        int[] theAnswers = {2,8,4,42,111,10,30,3,3,22,1,4,6,0,28,4,4,5,81,7,3,0,2,2,8,3,16,12};
        
        Random rand = new Random();
        int index = rand.nextInt(theQuestions.length);
        System.out.println(theQuestions[index]);
        boolean rightWrong = false;
        boolean looping = true;
        while (looping) {
	        try {
		        Scanner answerInput = new Scanner(System.in);
		        int userAnswer = answerInput.nextInt();
		        if (theAnswers[index] == userAnswer) {
		        	System.out.println("Correct!");
		        	rightWrong = true;
		        	looping = false;
		        	// Continue here for battle sequence!
		        } else {
		        	System.out.println("Wrong!");
		        	System.out.println("The Correct Answer is " + theAnswers[index]);
		        	rightWrong = false;
		        	looping = false;
		        }
	        }
	        catch (Exception e) {
	        	System.out.println("Please enter a number as your answer!s");
	        }
        }
        return rightWrong;
	}
	
	public static void move(char[][] gamearray) {
		
        Scanner console = new Scanner(System.in);
        System.out.println("Which way would you like to move(WASD)?: ");
        char inputDirection = console.next().charAt(0);

		if(inputDirection == 'W') {
			if (PLAYER_ROW != 0 && gamearray[PLAYER_ROW-1][PLAYER_COL] != 'X') {
				PLAYER_ROW --; 
				if(encounter()) {
					System.out.println("Eeeeek! You have encountered a DRACULA. Answer the next math question right to beat it.");
					if(question())
						System.out.println("You have destroyed the monster! :D");
					else 
						heart--;
				}
			}
			else 
				System.out.println("Invalid Move!");
		}
		else if(inputDirection == 'A') {
			if (PLAYER_COL != 0 && gamearray[PLAYER_ROW][PLAYER_COL-1] != 'X') {
				PLAYER_COL --; 
				if(encounter()) {
					System.out.println("Eeeeek! You have encountered a MUMMY. Answer the next math question right to beat it.");
					if(question())
						System.out.println("You have destroyed the monster! :D");
					else 
						heart--;
				}
			}
			else {
				System.out.println("Invalid Move!");
			}
		}
		else if(inputDirection == 'S') {
			if (PLAYER_ROW != 15 && gamearray[PLAYER_ROW+1][PLAYER_COL] != 'X') {
				PLAYER_ROW ++;
				if(encounter()) {
					System.out.println("Eeeeek! You have encountered an EVIL PUMPKIN. Answer the next math question right to beat it.");
					if(question())
						System.out.println("You have destroyed the monster! :D");
					else 
						heart--;
				}
			}
			else 
				System.out.println("Invalid Move!");
		}
		else {//if(inputDirection == 'D') 
			if (PLAYER_COL != 15 && gamearray[PLAYER_ROW][PLAYER_COL+1] != 'X')
				PLAYER_COL ++;
				if(encounter()) {
					System.out.println("Eeeeek! You have encountered a SLIME monster. Answer the next math question right to beat it.");
					if(question())
						System.out.println("You have destroyed the monster! :D");
					else 
						heart--;
				}
			else 
				System.out.println("Invalid Move!");
		}
		for(int i = 0; i < heart; i++ ) {
			System.out.print("<3 ");
		}
		System.out.println("");
		clearBoard(gamearray);
		initBoard(gamearray);
		printBoard(gamearray);
        //console.close();
	}
	
	public static void main(String[] args) {
		//input of initial data
		
		System.out.println("Welcome to Hello Dream World: ~SPOOKY~ HALLOWEEN! Created by the Dream Team that can only dream!");
		Scanner console = new Scanner(System.in);
		
		// Enter name
		System.out.println("Please enter the name of your character!: ");
		String name = console.next();
		
		System.out.println("Please choose your character: Archer, Warrior, Clown, Astronaut, or Wizard: ");
		String job = console.next();
		

		//GAME STARTS!
		char[][] gamearray = new char[16][16];
		initBoard(gamearray);
		printBoard(gamearray);
		while(!((PLAYER_ROW == 15) && (PLAYER_COL == 15)) && (heart != 0))
			move(gamearray);
		
		if (heart == 0) {
			System.out.println("Game over. Better luck next time! :)");
		}
		else {
			System.out.println("Congratulations! You have killed all the monster and completed the challenge! You won!! :)");
		}
		
	}
}