import java.util.*;
class roi{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int amo=input.nextInt();
int years=input.nextInt();
char s=input.next().charAt(0);
if(s=='y'){
double roi=amo*years*0.12;
System.out.println(roi);
}
else if(s=='n'){
double roi=(amo*years*10)/100;
System.out.println(roi);
}
else {
System.out.println("invalid inputs");
}
}
}