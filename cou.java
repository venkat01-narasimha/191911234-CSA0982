import java.util.*;
class cou{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int s=0;
while(n!=0){
if(n%2==0){
n=n/2;
}
else{
n=n-1;
}
s=s+1;
}
System.out.println(s);
}
}