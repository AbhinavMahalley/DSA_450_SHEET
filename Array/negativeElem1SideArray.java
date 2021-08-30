import java.util.*;

public class negativeElem1SideArray{
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        scn.close();
        negOneSide(arr,n);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
    public static void negOneSide(int arr[],int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i!=j){
                    swap(arr,i,j);
                }
                j++;
            }
        }
    }
    public static void swap(int a[],int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
        return;
    }    
}