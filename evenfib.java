import java.util.*;
class evenfib{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=0,b=1,c,sum=0;
for (int i=2;i<=2*n+1;i++){
//System.out.println(a);
c=a+b;
a=b;
b=c;
if(i%2==0){
sum=sum+c;
}
}
System.out.println(sum);
}
}