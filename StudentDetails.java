class Student{
	long mobileNo;
	String student_Name;
	float marks;
	static String school;
	float percentage;
	String section;
	int absentFine;
	int feesDue;
	int classRank;
	int rollNo;
}
public class StudentDetails {

public static void main(String[] args) {
		
Student s1 = new Student();
s1.student_Name = "SUMIT GUPTA";
s1.rollNo= 42;
s1.section= "M2";
s1.marks= 450;
s1.percentage = 78.6f;
s1.classRank= 45;
Student.school= "INDIAN PUBLIC SCHOOL";
s1.absentFine= 0;
s1.feesDue= 0;
s1.mobileNo= 9876543210L;

System.out.println("=============BookDetails=============");
System.out.println("Student Name : " + s1.student_Name);
System.out.println("School Name : " + Student.school);
System.out.println("Roll Number : " + s1.rollNo);
System.out.println("Section : " + s1.section);
System.out.println("Marks Obtained : " + s1.marks);
System.out.println("Percentage: " + s1.percentage);
System.out.println("Class Rank : " + s1.classRank);
System.out.println("Absent Fine : " + s1.absentFine);
System.out.println("Fees Due : " + s1.feesDue);
System.out.println("Mobile : " + s1.mobileNo);



	}

}