import java.util.*;
class Fact
{
public static void main(String args[])
{
       Scanner sc=new Scanner(System.in);
	int i=1,fact=1;
System.out.println("enter a natural number:");
	int n=sc.nextInt();
	while(i<=n)
	{
	fact=fact*i;
	i++;
	}
	System.out.println("factorial of a given number is:"+fact);
     }
}

