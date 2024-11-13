import java.util.*;
class Continue
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
	int n=sc.nextInt();
	int i;
	for (i=1;i<=10;i++){
	if(i==n)
	{
	continue;
	}
System.out.println(i);
}
}
}