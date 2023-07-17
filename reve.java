import java.util.*;
class reve{
public static void main(String[]args){
int m1[][]={{1,2},{2,4}};
int m2[][]={{3,1},{1,2}};
int sum[][]=new int[2][2];
int len=m1.length;
for(int i=0;i<len;i++){
for (int j=0;j<len;j++){
sum[i][j]=m1[i][j]+m2[i][j];
System.out.println(sum[i][j]+"\t");
}
System.out.println("\n");
}
System.out.println();
}
}