import java.util.*;
public class first_sem {
	public static void main(String[] args) {
		
	
	
	Scanner scan = new Scanner(System.in);
	
	int credits[]=new int[6];
	for(int i=0;i<6;i++)
	{
		credits[i] = scan.nextInt();
	}
	
	int grade_points[]=new int[6];
	for(int i=0;i<6;i++)
	{
		grade_points[i] = scan.nextInt();
	}
	
	int credit_points[]=new int[6];
	for(int i=0;i<6;i++)
	{
		credit_points[i]=credits[i]*grade_points[i];
	}
	
	int sum_credits=0,sum_credit_points=0;
	for(int i=0;i<6;i++)
	{
		sum_credits=credits[i]+sum_credits;
		
		sum_credit_points=credit_points[i]+sum_credit_points;
		
	}
	
	System.out.println(sgpa);
	scan.close();

}
}
