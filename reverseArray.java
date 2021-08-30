import java.util.*;
public class reverseArray {
    public static void main(String[] args){
Scanner scn = new Scanner (System.in);
int n=scn.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=scn.nextInt();
}
scn.close();
int i=0,j=arr.length-1;
while(i<j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
}
for(int a : arr){
    System.out.print(a+" ");
}

    }
}
