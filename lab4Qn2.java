package lab4;
import java.util.Scanner;
public class lab4Qn2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sum=0,courses=0,items=1;
		boolean validator=true;
		System.out.printf("Enter student's ID:");
		int studentId=scan.nextInt();
		scan.nextLine();
		System.out.printf("Enter the student's Full name:");
		char firstName=scan.next().charAt(0);
		String lastName=scan.next();
			while (validator)
			{
			System.out.printf("Enter student's course score %d or a non-integer number when done :",items++);
			if(!scan.hasNextInt())
			{
			validator=false;
			break;
			}
			int num=scan.nextInt();
			sum+=num;
			courses++;
			}
			float average=(courses>0)? sum/courses:0;
			System.out.printf("My name is %s,%C.with the ID %d. My average score is: %.2f",lastName,firstName,studentId,average);
		}
}
