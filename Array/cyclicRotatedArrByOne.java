import java.util.*;

public class cyclicRotatedArrByOne {
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        scn.close();
        rotate(arr, n);
        for(int a : arr){
            System.out.print(a+" ");
        }
    } 

    public static void rotate(int arr[], int n)
    {
        swap(arr,0,n-2);
        swap(arr,0,n-1);
    }
    public static void swap(int arr[] , int l , int h){
        while(l<h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
    }
}
