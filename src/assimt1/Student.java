package assimt1;


/**
 * @author this laptop is big
 *
 */
public class Student{
	private String ID;
	private char an;
	private int ans;
	
	public Student(String ID, int ans){
		this.setID(ID);
		this.setAns(ans);
	}
	
	public Student(String ID,char an ){
		this.setID(ID);
		this.setAn(an);
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public char getAn() {
		return an;
	}

	public void setAn(char an) {
		this.an = an;
	}

	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}

}
