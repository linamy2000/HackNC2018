import java.util.*;

public class theQuestionsAndAnswers {

	public theQuestionsAndAnswers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        
        String[] theQuestions = {"1 + 1","3 + 5","2 + 2","29 + 13","50 + 61","11 - 1","20 + 10","15 - 12","4 - 1","26 - 4","100 - 99","2 x 2","3 x 2","17 x 0","28 x 1","28 / 7","40 / 10","30 / 6","9 ^ 2","Edwin has 3 eggs in one hand and 4 eggs in another hand. How many eggs does Edwin have in total?","Sahil has 5 mangoes. He is hungry and eats 2 mangoes. How many mangoes does Sahil have left?","Shara has 9 shirts. She gives a shirt to each of her 9 friends. How many shirts does Shara have left?","Arpita has 10 birthday cakes. 5 friends have birthdays this week. How many cakes would each friend get?","Lindsay has 8 apples in her basket. She wants to split the apples between 4 people. How many apples does each person get?","Simran has 2 hands and 4 flowers in each hand. How many flowers does she have in total?","Jeff made 45 blueberry pancakes for his friend's birthday party. There will be 15 people at the party. How many pancakes will each person at the party get?","Amy has 4 bananas. She cuts each banana into 4 pieces. How many pieces of bananas does she have?"};
        int[] theAnswers = {2,8,4,42,111,10,30,3,3,22,1,4,6,0,28,4,4,5,81,7,3,0,2,2,8,3,16,12};
        
        Random rand = new Random();
        int index = rand.nextInt(theQuestions.length);
        System.out.println(theQuestions[index]);
        
        Scanner answerInput = new Scanner(System.in);
        int userAnswer = answerInput.nextInt();
        if (theAnswers[index] == userAnswer) {
        	System.out.println("Correct!");
        	// Continue here for battle sequence!
        }

	}

}
