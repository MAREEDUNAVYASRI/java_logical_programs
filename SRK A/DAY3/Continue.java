import java.util.*;
class Continue
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
	int n=sc.nextInt();
	int i;
	for (i=1;i<=15;i++){ 
	if(i==7||i==8)
	{
	continue;
	}
System.out.println(i);
}
}
}