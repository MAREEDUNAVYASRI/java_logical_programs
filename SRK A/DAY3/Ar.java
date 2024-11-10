import java.util.*;
class Ar
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter array size:");
	int n=sc.nextInt();
int a[]=new int[n];
System.out.println("The element to array:");
for(int i=0;i<a.length;i++)
{
 a[i]=sc.nextInt();
}	
System.out.println("The element in an array is:");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);

}
}
}