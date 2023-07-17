import java.util.*;
class din{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st denomination:"); 
int d1=sc.nextInt();
System.out.println("enter 1st denomination no.of notes:"); 
int n1=sc.nextInt();
System.out.println("enter 2nd denomination:"); 
int d2=sc.nextInt();
System.out.println("enter 2nd denomination no.of notes");
int n2=sc.nextInt();
System.out.println("enter 3rd denomination:"); 
int d3=sc.nextInt();
System.out.println("enter 3rd denomination no.of notes");
int n3=sc.nextInt();
System.out.println("enter 4th denomination:"); 
int d4=sc.nextInt();
System.out.println("enter 4th denomination no.of notes");
int n4=sc.nextInt();
int total=(d1*n1)+(d2*n2)+(d3*n3)+(d4*n4);
System.out.println(total);


}
}