import java.io.*;
import java.util.*;
class arraysort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter size:");
n=sc.nextInt();
int arr[]=new int[n],count=0,count1=0,j,k;
System.out.println("Enter array elements:");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(j=0;j<n;j++)
{
for( k=1;k<n;k++)
{
if(arr[j]>arr[k])
{
count++;
}
if(arr[j]<arr[k])
{
count1++;
}
}
}
if((count==(n-1))||(count1==(n-1)))
{
System.out.println("The given array elements are already sorted");
}
else
{
System.out.println("The given array elements are not sorted");
}
}
}
