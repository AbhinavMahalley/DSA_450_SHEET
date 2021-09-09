import java.util.*;
import java.io.*;

public class countInversions {
    public static void main(String[] args)throws Exception{
       
         Scanner scn = new Scanner(System.in);
         long n=scn.nextLong();
         long arr[]=new long[(int)n];
         for(int i=0;i<n;i++){
             arr[(int)i]=scn.nextLong();
         }
         scn.close();
        System.out.println(inversionCount(arr,n));
     }  

    // public static long inversionCount(long arr[], long n)
    //  {
    //      // Your Code Here
    //      // naive solution
    //      long count =0;
    //      for(int i=0;i<n-1;i++){
    //          for(int j=i+1;j<n;j++){
    //              if(arr[i]>arr[j]){
    //                  count++;
    //              }
    //          }
    //      }
         
    //      return count;
    //  }

    public static long inversionCount(long []arr, long n)
     {
         // Your Code Here
         // mergesort approach solution
           Long countInv= mergeSort(arr,0, n-1);
            return countInv;
     }

// static long countInv;//countInversions

public static long mergeSort(long arr[],long lo,long hi){
    long countInv=0;
        if(lo<hi){
            
            long mid= (lo+hi)/2;
            countInv+= mergeSort(arr, lo, mid);
           countInv+=mergeSort(arr,mid+1,hi);
            countInv+=mergeTwoSortedArr(arr,lo,mid,hi);
        }

        return countInv;
     }

public static long mergeTwoSortedArr(long arr[],long lo,long mid,long hi){
    long countInv=0;
    long n1=mid-lo+1;
    long n2=hi-mid;

long []a=new long[(int)n1];
long []b=new long[(int)n2];
for(long i=0;i<n1;i++){
    a[(int)i]=arr[(int)(lo+i)];
}
for(long i=0;i<n2;i++){
    b[(int)i]=arr[(int)(mid+1+i)];
}
        long i=0,j=0,k=lo;
        while(i<n1 && j<n2){
            if(a[(int)i]<=b[(int)j]){
                arr[(int)k]=a[(int)i];
                i++;
                k++;
            }else{
                countInv+=n1-i;
                arr[(int)k]=b[(int)j];
                j++;
                k++;
            }
        }
        while(i<n1 ){
            arr[(int)k]=a[(int)i];
                i++;
                k++;
        }
        while(j<n2){
            arr[(int)k]=b[(int)j];
                j++;
                k++;
        }

        return countInv;
     }
}
