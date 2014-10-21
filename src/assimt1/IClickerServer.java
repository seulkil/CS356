package assimt1;
/**
 * Seulki Lee
 * CS356
 * IClicker Programming
 * Descrption of this class :
 * The class initializes each types of counters to zero. 
 * and it would keep tracking of counters. 
 * 
 */
public class IClickerServer {
	static int answerA;
	static int answerB;
	static int answerC;
	static int answerD;
	static int answer1;
	static int answer2;
	
	/**
	 * Every counters is initilized to zero
	 */

	public IClickerServer() {
		answerA = 0;
		answerB = 0;
		answerC = 0;
		answerD = 0;
		answer1 = 0;
		answer2 = 0;
	}
	/**
	 * it would be counting the char answers. 
	 * @param an
	 */

	public void countChar(char an) {

		switch (an) {
		case 'A':
			answerA++;
			break;
		case 'B':
			answerB++;
			break;
		case 'C':
			answerC++;
			break;
		case 'D':
			answerD++;
			break;
		}

	}
	/**
	 * it can be used to count int answer. 
	 * @param a
	 */

	public void countInt(int a) {
		switch (a) {
		case 1:
			answer1++;
			break;
		case 2:
			answer2++;
			break;
		}

	}
	/**
	 * it displays each counters for Char type question 
	 */

	public void displayAnswerChar() {
		System.out.println("A: " + answerA/2);
		System.out.println("B: " + answerB/2);
		System.out.println("C: " + answerC/2);
		System.out.println("D: " + answerD/2);
	}
	/**
	 * it displays each counters for int type question
	 */

	public void displayAnswerInt() {
		System.out.println("1. Right : " + answer1/2);
		System.out.println("2. Wrong : " + answer2/2);
	}

}
