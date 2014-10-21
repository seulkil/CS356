package assimt1;
/**
 * Seulki Lee
 * CS356
 * IClicker Programming
 * Descrption of this class :
 * This class make a object of students.
 * there are two constructors for int type question
 * and for char type question.   
 */
public class Student{
	private String ID;
	private char an;
	private int ans;
	
	// constructor for int type question
	public Student(String ID, int ans){
		this.setID(ID);
		this.setAns(ans);
	}
	// contructor for char type question
	public Student(String ID,char an ){
		this.setID(ID);
		this.setAn(an);
	}
	
	//get a student ID
	public String getID() {
		return ID;
	}
    // set a student ID
	public void setID(String iD) {
		ID = iD;
	}
    // get an answer for char 
	public char getAn() {
		return an;
	}
    // set an answer for char 
	public void setAn(char an) {
		this.an = an;
	}
	// get an answer for int 
	public int getAns() {
		return ans;
	}
    // set an answer for int 
	public void setAns(int ans) {
		this.ans = ans;
	}

}
