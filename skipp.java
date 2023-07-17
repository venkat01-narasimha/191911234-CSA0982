import java.util.*;
class skipp{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int m=input.nextInt();
int k=input.nextInt();
for(int i=n;i<=m;i=i+k+1){
System.out.println(i);
}
}
}