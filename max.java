import java.util.*;
class max{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
Arrays.sort(a);
int M=sc.nextInt();
int N=sc.nextInt();
int max=a[n-M];
int min=a[N-1];
System.out.println(M+"th maximum number="+max);
System.out.println(N+"th minimum number="+min);
System.out.println("sum="+(min+max));
System.out.println("diff="+(max-min));
}
}