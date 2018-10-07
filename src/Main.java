package Character;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Character player;
		
		// Description of game
		System.out.println("Welcome to Hello Dream World! Created by the Dream Team that only dreams!");
		Scanner scan = new Scanner(System.in);
		
		// Enter name
		System.out.println("Please enter the name of your character!: ");
		String name = scan.next();
		
		System.out.println("Please choose your character. Archer, Warrior, Clown, Astronaut, or Wizard: ");
		String job = scan.next();
		
		if (!job.equals("Archer") || !job.equals("Warrior") || !job.equals("Clown") || !job.equals("Astronaut") || !job.equals("Wizard") || !job.equals("archer") || !job.equals("warrior") || !job.equals("clown") || !job.equals("astronaut") || !job.equals("wizard")) {
			System.out.println("There was an error in your input, please enter your character exactly as specified. ");
			job = scan.next();
		}
		
		if (job.equals("Archer")) {
			System.out.println("Welcome " + name + " the " + job + "!");
			System.out.println("Your initial health points and strength are 110 and 35");
			player = new Character(name, job, 110, 35);
		}
		
		if (job.equals("Warrior")) {
			System.out.println("Welcome " + name + " the " + job + "!");
			System.out.println("Your initial health points and strength are 90 and 45");
			player = new Character(name, job, 90, 45);
		}
		
		if (job.equals("Clown")) {
			System.out.println("Welcome " + name + " the " + job + "!");
			System.out.println("Your initial health points and strength are 120 and 30");
			player = new Character(name, job, 120, 30);
		}
		
		if (job.equals("Astronaut")) {
			System.out.println("Welcome " + name + " the " + job + "!");
			System.out.println("Your initial health points and strength are 100 and 40");
			player = new Character(name, job, 100, 40);
		}
		
		if (job.equals("Wizard")) {
			System.out.println("Welcome " + name + " the " + job + "!");
			System.out.println("Your initial health points and strength are 80 and 50");
			player = new Character(name, job, 80, 50);
		}
		
		
	}
}
