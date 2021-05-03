/**
 * 
 */
package lab2;

/**
 * @author steven
 *
 */
public class lab2Qn1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit=20;
		printEven(limit);
		printHalf(limit/2);

	}
//print Even Function
	
	static void printEven(int value)
	{
		for(int i=1;i<value;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
//printHAlf function
	static void printHalf(int value)
	{
		for(int i=1;i<value;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
