package assimt1;




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
	static Object[] ob;
	private static int index = 0;
	static char a = 'A';
	static char b = 'B';
	static char c = 'C';
	static char d = 'D';
	

	public static void option() {
		System.out.println("Enter the Question type : ");
		System.out.println("1. True or False ");
		System.out.println("2. Multiple Question");
	}

	public static void question() {
		System.out.println("What is your question? ");
	}

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String ques = br.readLine();
		//String ques = keyboard.nextLine();
		//System.out.println("test");
		return ques;
	}

	public static int getInt() {
		int option = keyboard.nextInt();
		return option;
	}

	public char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

	public static String generatedID() {
		String uid = UUID.randomUUID().toString();
		return uid;
	}

	public static int generatedAnswerInt() {
		int number = randomNumbers.nextInt(2) + 1;
		return number;
	}

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

	public static int generatedBound() {
		int n = randomNumbers.nextInt(20) + 1;
		return n;
	}
	
	public static void generatedArray(int b){
		ob = new Object[b];
		
	}

	public static void populationInt(int a, String id) {
		st = new Student(id, a);
		is.countInt(a);
		ob[index++] = st;
		is.countInt(a);
	}

	public void populationChar(char a, String id) {
		st = new Student(id, a);
		is.countChar(a);
		ob[index++] = st;
		is.countChar(a);
	}
	
	public static void pushObjectInt(int bound){
		for(int i =0; i < bound; i++){
			int a = generatedAnswerInt();
			String id = generatedID();
			populationInt(a, id);
		}
	}
	public static void pushObjectString(int bound){
		for(int i =0; i < bound; i++){
			int a = generatedAnswerString();
			String id = generatedID();
			populationInt(a, id);
		}
	}
	
	public static void engine(int option, int b){
		if (option == 1){
			pushObjectInt(b);
			is.displayAnswerInt();
		}
		else{
			pushObjectString(b);
			is.displayAnswerChar();
		}
	}

	public static void main(String args[]) throws IOException {
		int n;
		int b; 
		option();
		n = getInt();
		b = generatedBound();
		generatedArray(b);
		
		question();
		@SuppressWarnings("unused")
		String q = getString();
		
		engine(n,b);
		
		
		
	}

}
