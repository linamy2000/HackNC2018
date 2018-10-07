import java.util.*;

public class Main {
	public static void main(String[] args) {
		Character player;
		
		// Description of game
		System.out.println("Welcome to Hello Dream World! Created by the Dream Team that only dreams!");
		Scanner scan = new Scanner(System.in);
		
		// Enter name
		System.out.println("Please enter the name of your character!: ");
		String name = scan.nextLine();
		
		System.out.println("Please choose your character's job. Archer, Warrior, Clown, Astronaut, or Wizard: ");
		String job = scan.next();
		
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
			job = scan.next();
		}
		
		if (job.equals("Archer") || (job.equals("archer"))) {
			System.out.println("Welcome " + name + " the " + job + "!");
			System.out.println("Your initial health is 110 and your strength is 35.");
			player = new Character(name, job, 110, 35);
		}
		
		if (job.equals("Warrior") || job.equals("warrior")) {
			System.out.println("Welcome " + name + " the " + job + "!");
			System.out.println("Your initial health is 90 and your strength is 45.");
			player = new Character(name, job, 90, 45);
		}
		
		if (job.equals("Clown") || job.equals("clown")) {
			System.out.println("Welcome " + name + " the " + job + "!");
			System.out.println("Your initial health is 120 and your strength is 30.");
			player = new Character(name, job, 120, 30);
		}
		
		if (job.equals("Astronaut") || job.equals ("astronaut")) {
			System.out.println("Welcome " + name + " the " + job + "!");
			System.out.println("Your initial health is 100 and your strength is 40.");
			player = new Character(name, job, 100, 40);
		}
		
		if (job.equals("Wizard") || job.equals ("wizard")) {
			System.out.println("Welcome " + name + " the " + job + "!");
			System.out.println("Your initial health is 80 and your strength is 50.");
			player = new Character(name, job, 80, 50);
		}
	}
}