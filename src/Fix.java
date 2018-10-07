// Beating up the monster is working now. Still need to make player killable.

import java.util.Random;
import java.util.Scanner;
import Characters.Character;

import Characters.Monster;

public class Fix {
	
	public static int PLAYER_ROW = 0;
	public static int PLAYER_COL = 0;
	
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
	    
	    else if(boardChoice == 2) {
	    	
	    	
	    }
	    
	    else {
	    	
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
		int chance = rando.nextInt(4) + 1;
		boolean isMonster = true;
		if (chance > 1)
			isMonster = false;
		return isMonster;
	}
	
	public static void battle(Character p) {
		String[] theQuestions = {"1 + 1","3 + 5","2 + 2","29 + 13","50 + 61","11 - 1","20 + 10","15 - 12","4 - 1","26 - 4","100 - 99","2 x 2","3 x 2","17 x 0","28 x 1","28 / 7","40 / 10","30 / 6","9 ^ 2","Edwin has 3 eggs in one hand and 4 eggs in another hand. How many eggs does Edwin have in total?","Sahil has 5 mangoes. He is hungry and eats 2 mangoes. How many mangoes does Sahil have left?","Shara has 9 shirts. She gives a shirt to each of her 9 friends. How many shirts does Shara have left?","Arpita has 10 birthday cakes. 5 friends have birthdays this week. How many cakes would each friend get?","Lindsay has 8 apples in her basket. She wants to split the apples between 4 people. How many apples does each person get?","Simran has 2 hands and 4 flowers in each hand. How many flowers does she have in total?","Jeff made 45 blueberry pancakes for his friend's birthday party. There will be 15 people at the party. How many pancakes will each person at the party get?","Amy has 4 bananas. She cuts each banana into 4 pieces. How many pieces of bananas does she have?"};
        int[] theAnswers = {2,8,4,42,111,10,30,3,3,22,1,4,6,0,28,4,4,5,81,7,3,0,2,2,8,3,16,12};
        
        Monster bob = new Monster(100, 20);
        
        while (bob.monsterIsAlive()) {
        	Random rand = new Random();
	        int index = rand.nextInt(theQuestions.length);
	        System.out.println(theQuestions[index]);
	        
	        Scanner answerInput = new Scanner(System.in);
	        int userAnswer = answerInput.nextInt();
	        if (theAnswers[index] == userAnswer) {
	        	System.out.println("Correct!");
	        	bob.monsterDamaged(p.getStrength());
	        	System.out.println(p.getName() + " hit the monster for " + p.getStrength() + " damage.");
	        } else {
	        	System.out.println("Incorrect :(");
	        	p.playerDamaged(bob.getStrength());
	        	System.out.println("The monster hit " + p.getName() + " for " + bob.getStrength() + " damage.");
	        }
        }
	}
	
	public static void move(char[][] gamearray, Character p) {
        Scanner console = new Scanner(System.in);
        System.out.println("Which way would you like to move (WASD)?: ");
        char inputDirection = console.next().charAt(0);
        System.out.println(inputDirection);

		if(inputDirection == 'W') {
			if (PLAYER_ROW != 0 && gamearray[PLAYER_ROW-1][PLAYER_COL] != 'X') {
				PLAYER_ROW --;
				if(encounter())  {
					battle(p);
				}
			}
			else 
				System.out.println("Invalid Move!");
		}
		
		else if(inputDirection == 'A')
			if (PLAYER_COL != 0 && gamearray[PLAYER_ROW][PLAYER_COL-1] != 'X') {
				PLAYER_COL --;
				if(encounter())  {
					battle(p);
			}
			} else 
				System.out.println("Invalid Move!");
		else if(inputDirection == 'S')
			if (PLAYER_ROW != 15 && gamearray[PLAYER_ROW+1][PLAYER_COL] != 'X') {
				PLAYER_ROW ++;
				if(encounter())  {
					battle(p);
				}
			} else 
				System.out.println("Invalid Move!");
		else //if(inputDirection == 'D')
			if (PLAYER_COL != 15 && gamearray[PLAYER_ROW][PLAYER_COL+1] != 'X') {
				PLAYER_COL ++;
				if(encounter())  {
					battle(p);
				}
			} else 
				System.out.println("Invalid Move!");
        
		clearBoard(gamearray);
		initBoard(gamearray);
		printBoard(gamearray);
        //console.close();
	}
	
	public static String getName() {
		Scanner nameScan = new Scanner(System.in);
		String name = nameScan.next();
		return name;
	}
	
	public static void main(String[] args) {
		//input of initial data
		
		System.out.println("Welcome to Hello Dream World! Created by the Dream Team that can only dream!");
		Scanner console = new Scanner(System.in);
		
		// Enter name
		System.out.print("Please enter a name for your character: ");
		String name = console.next();
		
		System.out.println();
		
		System.out.print("Please choose your character's job. Archer, Warrior, Clown, Astronaut, or Wizard: ");
		String job = console.next();
		
		System.out.println();
		
		String[] inputs = {"Archer", "Warrior", "Clown", "Astronaut", "Wizard", "archer", "warrior", "clown", "astronaut", "wizard"};
		
		boolean input = false;
		
		for (int i = 0; i < 10; i++) {
			if (job.equals(inputs[i])) {
				input = true;
				break;
			}
		}
		
		if (!input) {
			System.out.println("There was an error in your input. Please check your spelling. ");
			job = console.next();
		}
		
		Character player;
		
		if (job.equals("Archer") || job.equals("archer")) {
			System.out.println("Welcome " + name + " the " + job + "!");
			System.out.println("Your initial health is 110 and your strength is 35.");
			player = new Character(name, job, 110, 35);
		}
		
		else if (job.equals("Warrior") || job.equals("warrior")) {
			System.out.println("Welcome " + name + " the " + job + "!");
			System.out.println("Your initial health is 90 and your strength is 45.");
			player = new Character(name, job, 90, 45);
		}
		
		else if (job.equals("Clown") || job.equals("clown")) {
			System.out.println("Welcome " + name + " the " + job + "!");
			System.out.println("Your initial health is 120 and your strength is 30.");
			player = new Character(name, job, 120, 30);
		}
		
		else if (job.equals("Astronaut") || job.equals ("astronaut")) {
			System.out.println("Welcome " + name + " the " + job + "!");
			System.out.println("Your initial health is 100 and your strength is 40.");
			player = new Character(name, job, 100, 40);
		}
		
		else {//(job.equals("Wizard") || job.equals ("wizard")) {
			System.out.println("Welcome " + name + " the " + job + "!");
			System.out.println("Your initial health is 80 and your strength is 50.");
			player = new Character(name, job, 80, 50);
		}
		

		//GAME STARTS!
		char[][] gamearray = new char[16][16];
		initBoard(gamearray);
		printBoard(gamearray);
		while(!((PLAYER_ROW == 15) && (PLAYER_COL == 15)) && (player.playerIsAlive())) {
			move(gamearray, player);	
		}

		if(player.playerIsAlive() == false) {
			System.out.println("Game Over. :(");
		} else {
			System.out.println("Congratz You Won!! :)");
		}
	}
}
