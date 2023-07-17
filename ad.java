import java.util.*;
class ad
{
public static void main(String[]args)
{
int n=4;
String temp;
int arr[]={rahul,ajay,gorav,riya};
if(order='a')
{
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(arr[i].compareTo(arr[j])>0)
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}

System.out.println("names in alphabhatical order");
for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}

else if(order='b')
{
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(arr[i].compareTo(arr[j]<0))
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
}
System.out.println("names in alphabhatical order");
for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}
else 
{
System.out.println("invalid");
}
}
}