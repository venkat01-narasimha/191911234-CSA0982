import java.util.*;
class ado{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
String a[]={"banana","apple"};
char c=input.next().charAt(0);
if(c=='a'||c=='A'){
Arrays.sort(a);
System.out.println(Arrays.toString(a));
}
else if(c=='d'||c=='D'){
Arrays.sort(a,Collections.reverseOrder());
System.out.println(Arrays.toString(a));
}
else{
System.out.println("invalid inputs");
}
}
}