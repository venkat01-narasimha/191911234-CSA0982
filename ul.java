import java.util.*;
class ul{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
char c='0';
int u=0,l=0,d=0;
while(c!='*'){
c=sc.next().charAt(0);
if(c=='*'){
break;
}
else{
if(c>=65&&c<=90){
u++;
}
else if(c>=97&&c<=122){
l++;
}
else if(c>=48&&c<=57){
d++;
}
}
}
System.out.println(u);
System.out.println(l);
System.out.println(d);
}
}