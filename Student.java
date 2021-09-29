package assignments;

public class Student {
	int rollNo;
	String StudName;
	int marksInEng,marksInMaths,marksInScience;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(201702001,"Eric",98,95,87);
		Student s2 = new Student(201702002,"Mike",95,92,85);
		Student s3 = new Student(201702003,"Elle",90,97,89);
		int highMark;
		if(s1.marksInMaths >= s2.marksInMaths &&  s1.marksInMaths >= s3.marksInMaths) {
			System.out.println(s1.rollNo + " " + s1.StudName );
				highMark =s1.marksInMaths;
		}
		else if(s2.marksInMaths >=s3.marksInMaths) { 
			highMark = s2.marksInMaths;
			System.out.println(s2.rollNo + " " + s2.StudName );
				
			}
		else {
			highMark = s3.marksInMaths;
			System.out.println(s3.rollNo + " " + s3.StudName );
		}
		
	
		
	}

	public Student(int rollNo, String studName, int marksInEng, int marksInMaths, int marksInScience) {
		this.rollNo = rollNo;
		StudName = studName;
		this.marksInEng = marksInEng;
		this.marksInMaths = marksInMaths;
		this.marksInScience = marksInScience;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getStudName() {
		return StudName;
	}

	public int getMarksInEng() {
		return marksInEng;
	}

	public int getMarksInMaths() {
		return marksInMaths;
	}

	public int getMarksInScience() {
		return marksInScience;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setStudName(String studName) {
		StudName = studName;
	}

	public void setMarksInEng(int marksInEng) {
		this.marksInEng = marksInEng;
	}

	public void setMarksInMaths(int marksInMaths) {
		this.marksInMaths = marksInMaths;
	}

	public void setMarksInScience(int marksInScience) {
		this.marksInScience = marksInScience;
	}
	
	
	
	
	

}
