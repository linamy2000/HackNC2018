/* Main: */

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

             if (!job.equals("Archer") || !job.equals("Warrior") || !job.equals("Clown") || !job.equals("Astronaut") || !job.equals("Wizard")) {

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

 

/* Character: */

package Character;

 

public class Character {

       // Declare instance variables

       private String _name;

       private String _job;

       private int _hp; // max is 100

       private int _maxhp;

       private int _strength;

       private int _potion;

       private int _potionCounter;

      

       // Initialize variables

       public Character (String name, String job, int maxhp, int strength) {

             _name = name;

             _job = job;

             _hp = maxhp;

             _maxhp = maxhp;

             _strength = strength;

             _potionCounter = 0;

            

             _potion = (maxhp/5);

       }

      

       public String getName() {

             return _name;

       }

      

       public int getStrength() {

             return _strength;

       }

      

       public String getJob() {

             return _job;

       }

      

       public int getHP() {

             return _hp;

       }

      

       public boolean isAlive() {

             return (_hp >= 0);

       }

      

       public int damaged(int otherStrength) {

             _hp -= otherStrength;

            

             if (_hp < 0)

                    return -1;

            

             return _hp;

       }

      

       public void addPotion() {

             _potionCounter++;

       }

      

       public void usePotion() {

             _hp += _potion;

            

             if (_hp >= _maxhp)

                    _hp = _maxhp;

       }

}