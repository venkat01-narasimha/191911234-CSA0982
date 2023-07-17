import java.util.*;
class h1{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=input.nextInt();
	}
    int com=0,pri=0;
    for(int i=0;i<n;i++){
    int count=0;
	for(int j=1;j<=a[i];j++){
		if(a[i]%j==0){
			count++;
			}
}
		  if(count==2)
			pri++;
		  else
			com++;
		}
System.out.println(pri);
System.out.println(com);
}
}