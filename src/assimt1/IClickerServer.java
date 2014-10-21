package assimt1;

public class IClickerServer {
	static int answerA;
	static int answerB;
	static int answerC;
	static int answerD;
	static int answer1;
	static int answer2;

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

	public void displayAnswerChar() {
		System.out.println("A: " + answerA);
		System.out.println("B: " + answerB);
		System.out.println("C: " + answerC);
		System.out.println("D: " + answerD);
	}

	public void displayAnswerInt() {
		System.out.println("1. Right : " + answer1);
		System.out.println("2. Wrong : " + answer2);
	}

}
