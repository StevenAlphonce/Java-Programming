package lab3;

public class FinalScore {
	int courseWork;
	int finalExamination;
	
//the final Score constructor
	public FinalScore() {

		
		System.out.println();
	}
	
	//Function that computes the marks
	public double returnFinal(int courseWork,int finalExamination)
	{
		double result=0;
		
		//If Statement to check the student Mark whether it is less than 0 or greater than 100.
		
		if(courseWork<0 || courseWork >100 || finalExamination<0 || finalExamination>100)
		{
		System.out.println("Student can not obtain (-ve) 0r > 100,The program cannot compute Student Final Score");
		System.out.println("Please refer to your doncument and Enter the mark again.Thank you");
		}else {
			result =(courseWork*0.4)+(finalExamination*0.6);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("STUDENTS COURSE WORK");
		
		//FinalScore for first student object
		FinalScore finalscore=new FinalScore();
		
		int courseScore=finalscore.courseWork=40;	
		int examScore=finalscore.finalExamination=60;
		
		System.out.println(".................................................");
		System.out.println("Final Score for First student:\t"+finalscore.returnFinal(courseScore,examScore));
		
		////FinalScore for Second student object
		FinalScore finalscore1=new FinalScore();
		
		int courseScore1=finalscore1.courseWork=50;	
		int examScore1=finalscore1.finalExamination=80;
		
		System.out.println(".................................................");
		System.out.println("Final Score for Second Student:\t"+finalscore1.returnFinal(courseScore1,examScore1));
		
		}
		
	}

