package assimt1;

/**
 * Seulki Lee
 * CS356
 * IClicker Programming
 * Descrption of this class :
 * This class includes the Main funtion; 
 * It is generated Random number of students who vote the question, 
 * the random generated student IDs, Answers.   
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class SimulationDriver {

	static Scanner keyboard = new Scanner(System.in);
	static Random randomNumbers = new Random();
	static Student st = null;
	static IClickerServer is = new IClickerServer();
	static Question qu = new Question();
	static Object[] ob;
	private static int index = 0;
	static char a = 'A';
	static char b = 'B';
	static char c = 'C';
	static char d = 'D';

	/**
	 * BufferedReader read from the user input and
	 * 
	 * @return string ;
	 * @throws IOException
	 */

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String ques = br.readLine();
		// String ques = keyboard.nextLine();
		// System.out.println("test");
		return ques;
	}

	/**
	 * it can be used to read input from the keyboard and
	 * 
	 * @return option
	 */

	public static int getInt() {
		int option = keyboard.nextInt();
		return option;
	}

	/**
	 * it calls the getString and, it can be used to read input from the
	 * keyboard and
	 * 
	 * @return s which is first letter of the String.
	 */

	public char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

	/**
	 * it can be used to generate random studnet's ID .
	 * 
	 * @return uid
	 */

	public static String generatedID() {
		String uid = UUID.randomUUID().toString();
		return uid;
	}

	/**
	 * it can be used to generate random answer for boolean question
	 * 
	 * @return number
	 */

	public static int generatedAnswerInt() {
		int number = randomNumbers.nextInt(2) + 1;
		return number;
	}

	/**
	 * it can be used to generate random answer for multiple question and it
	 * will return char.
	 */

	public static char generatedAnswerString() {
		int n = randomNumbers.nextInt(4) + 1;
		if (n == 1)
			return a;
		else if (n == 2)
			return b;
		else if (n == 3)
			return c;
		else
			return d;

	}

	/**
	 * it can be used to generated a random number of students between 1- 20.
	 * 
	 * @return n
	 */

	public static int generatedBound() {
		int n = randomNumbers.nextInt(20) + 1;
		return n;
	}

	/**
	 * the bound pass thorough the function, and the function initializes the
	 * array of objects.
	 * 
	 * @param b
	 */
	public static void generatedArray(int b) {
		ob = new Object[b];

	}

	/**
	 * The function can be used to make new students with answers for boolean
	 * question and String ID. Answer and student Id pass through the function
	 * as parameter. After making a new student, it would call countInt which
	 * make the counter can count thier answers.
	 * 
	 * @param a
	 * @param id
	 */

	public static void populationInt(int a, String id) {
		st = new Student(id, a);
		is.countInt(a);
		// System.out.println(st.getAns()+ "\t" +st.getID());
		ob[index++] = st;
		is.countInt(a);
	}

	/**
	 * The function can be used to make new students with answers for multiple
	 * question and String ID. Answer and student Id pass through the function
	 * as parameter. After making a new student, it would call countChar which
	 * make the counter can count each char answers.
	 * 
	 * @param a
	 * @param id
	 */

	public static void populationChar(char a, String id) {
		st = new Student(id, a);
		is.countChar(a);
		// System.out.println((st.getAn() + "\t" + st.getID()));
		ob[index++] = st;
		is.countChar(a);
	}

	/**
	 * it will make a list of the Students in an array, Object[] ob.
	 * 
	 * @param bound
	 */
	public static void pushObjectInt(int bound) {
		for (int i = 0; i < bound; i++) {
			int a = generatedAnswerInt();
			String id = generatedID();
			populationInt(a, id);
		}
	}

	/**
	 * it will make a list of the Students in an array, Object[] ob.
	 * 
	 * @param bound
	 */
	public static void pushObjectString(int bound) {
		for (int i = 0; i < bound; i++) {
			char a = generatedAnswerString();
			String id = generatedID();
			populationChar(a, id);
		}
	}

	/**
	 * The function can be used to determine whether question requires int type
	 * answers or char type answer. if option is 1, the function would be make
	 * Objects with int answer and studentID. otherwise, Object array would be
	 * contain students with char answer
	 * 
	 * @param option
	 * @param b
	 */

	public static void engine(int option, int b) {
		if (option == 1) {
			pushObjectInt(b);
			is.displayAnswerInt();
		} else {
			pushObjectString(b);
			is.displayAnswerChar();
		}
	}

	public static void main(String args[]) throws IOException {
		int n;
		int b;
		qu.option();
		n = getInt();
		b = generatedBound();
		generatedArray(b);
		System.out.println("Number of studnets : " + b);
		qu.question();
		@SuppressWarnings("unused")
		String q = getString();

		engine(n, b);

	}

}
