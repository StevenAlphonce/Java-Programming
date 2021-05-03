/**
 * 
 */
package lab2; //The lab two package

/**
 * Name :Alphonce F. Stephano 	ID:20011017
 * Name :Yusuph Jumbe			ID:20011011
 *
 */
public class lab2Qn2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables to store Marks obtained in in courses.
		int student_markcs175=91;
		int student_markcs171=30;
		
	//Examination table heading and top row Headings	
		System.out.println("Examination Results");
		System.out.print("Courses\t");
		System.out.print("\tGrade\t");
		System.out.print("\tRemark\t");
		System.out.print("\tGrade Point\n");
		//Examination table columnsCS 175 
		System.out.print("CS 175\t\t");
		getEvaluationfor175(student_markcs175); //Functions call that pass a value to function getEvaluationfor175();
		//Examination table column CS 171
		System.out.print("CS 171\t\t");
		getEvaluationfor171(student_markcs171);//Functions call that pass a value to function getEvaluationfor171();
		
		

	}
	//The the evaluate the grades point,remarks of the marks scored  in CS 175
	static void getEvaluationfor175(int score)
	{
		//Limits the marks not to be less than 0 and not greater than 100
		if(score<0 || score>100)
		{
		System.out.println("Invalid mark");
		//Checking the marks from 0 to 100 for evaluation if mark =>0 or mark <=100
		}else if(score>=70 && score<=100)
		{
		
		System.out.print("A");
		System.out.print("\t\t");
		System.out.print("Excelent");
		System.out.print("\t");
		System.out.println("5.0");
		
		}else if(score>=60 && score<=69)
		{
			System.out.print("B+");
			System.out.print("\t\t");
			System.out.print("Very Good");
			System.out.print("\t");
			System.out.println("4.0");
			
		}else if(score>=50 && score<=59)
		{
			System.out.print("B");
			System.out.print("\t\t");
			System.out.print("Good");
			System.out.print("\t\t");
			System.out.println("3.0");
		}else if(score>=40 && score<=49)
		{
			System.out.print("C");
			System.out.print("\t\t");
			System.out.print("Satisfactory");
			System.out.print("\t");
			System.out.println("2.0");
			
		}else if(score>=35 && score<=39)
		{
			System.out.print("D");
			System.out.print("\t\t");
			System.out.print("Good");
			System.out.print("\t\t");
			System.out.println("1.0");
		}else if(score>=0 && score<=34)
		{
			System.out.print("E");
			System.out.print("\t\t");
			System.out.print("Failure");
			System.out.print("\t\t");
			System.out.println("0");
		}
	}
	
	//The the evaluate the grades point,remarks of the marks scored  in CS 171
	static void getEvaluationfor171(int score)
	{
		//Limits the marks not to be less than 0 and not greater than 100
		if(score<0 || score>100)
		{
		System.out.println("Invalid mark");
		//Start Checking the marks from 0 to 100 for evaluation if mark =>0 or mark <=100
		}else if(score>=70 && score<=100)
		{
		
		System.out.print("A");
		System.out.print("\t\t");
		System.out.print("Excelent");
		System.out.print("\t");
		System.out.println("5.0");
		
		}else if(score>=60 && score<=69)
		{
			System.out.print("B+");
			System.out.print("\t\t");
			System.out.print("Very Good");
			System.out.print("\t");
			System.out.println("4.0");
			
		}else if(score>=50 && score<=59)
		{
			System.out.print("B");
			System.out.print("\t\t");
			System.out.print("Good");
			System.out.print("\t\t");
			System.out.println("3.0");
		}else if(score>=40 && score<=49)
		{
			System.out.print("C");
			System.out.print("\t\t");
			System.out.print("Satisfactory");
			System.out.print("\t");
			System.out.println("2.0");
			
		}else if(score>=35 && score<=39)
		{
			System.out.print("D");
			System.out.print("\t\t");
			System.out.print("Good");
			System.out.print("\t\t");
			System.out.println("1.0");
		}else if(score>=0 && score<=34)
		{
			System.out.print("E");
			System.out.print("\t\t");
			System.out.print("Failure");
			System.out.print("\t\t");
			System.out.println("0");
		}
	}
	
	
}
