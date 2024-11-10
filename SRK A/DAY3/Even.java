import java.util.*;
class Even
{
public static void main(String args[])
{
       Scanner sc=new Scanner(System.in);
	int i=1;
System.out.println("enter a  number:");
	int n=sc.nextInt();
	do
	{
	if (i%2==0)
	{
	System.out.println(i);
	}
	i++;
	}
	while (i<=n);
     }
}

