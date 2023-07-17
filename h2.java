import java.util.*;
class posneg
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
double n=0,po=0,ne=0,i=0,j=0;
while(n!=-1){
n=sc.nextDouble();
if(n==-1){
break;
}
else{
if(n>0){
po=po+n;
i++;
}
else{
ne=ne+n;
j++;
}
}
}
System.out.println(po/i);
System.out.println(ne/j);
}
}