
import java.util.Scanner;
public class Test 
{
	public int  m1(int a,int b) 
	{
		int sum=a+b;
		return sum;
	}
	public static void main(String []args) 
	{
		
		Scanner key=new Scanner (System.in);
		System.out.println("enter Number:");
		int a=key.nextInt();
//		int b=key.nextInt();
		
		
		int org=a;
		int num=a;
		int rem=0;
		int sum=0;
		int length=0;
		
		while(num>0) {
			length++;
			num=num/10;
		
		}
		System.out.println(length);
		
		while(a>0) {
			
			rem=a%10;
			sum=sum+(int) Math.pow(rem,length);
			a=a/10;
			
			
		}
		System.out.println(sum);
		
		if(sum==org) System.out.println("is a armstrong num");
		else System.out.println("Not a armstrong num");
	
	
		
	

		
      	
		
	}
}	
	
		
		
	
	


