package assimt1;
/**
 * Seulki Lee
 * CS356
 * IClicker Programming
 * Descrption of this class :
 * This class display options and ask question.
 */

public class Question {
	String ques;
	public Question() {
		ques = null;
		
	}
	/**
	 * display option 
	 */
	public static void option() {
		System.out.println("Enter the Question type : ");
		System.out.println("1. True or False ");
		System.out.println("2. Multiple Question");
	}
	/**
	 * display question.
	 */

	public static void question() {
		System.out.println("What is your question? ");
	}

}
