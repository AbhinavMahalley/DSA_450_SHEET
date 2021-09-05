import java.util.*;
public class mergeTwoSortedArr {
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        int b[]=new int[m];
        for(int i=0;i<m;i++){
            b[i]=scn.nextInt();
        }
        scn.close();
        merge(a,b,n,m);
        for(int ele : a){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele : b){
            System.out.print(ele+" ");
        }
    } 
    // public static void merge(int a[], int b[], int n, int m) {
    //     // code here TLE N^2logn
    //     // insertion method
    //     int j=0;
    //    for(int i=0;i<n;i++){
    //        if(a[i]>b[j]){
    //            swap(a,b,i,j); 
    //            Arrays.sort(b);
    //        }
    //    }
    // }
    public static void merge(int a[], int b[], int n, int m){
        // nlogn 
        for( int i=n-1,j=0;i>=0&&j<m;i--,j++){
            if(a[i]>=b[j]){
                swap(a, b, i, j);
            }else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
    
    // public static void merge(int a[], int b[], int n, int m){
    // //    most efficient gap algo  refer striver video || TAKE U FORWARD -> youtube
    // }

    public static void swap(int a[] , int b[] , int i,int j){
      
            int temp=a[i];
            a[i]=b[j];
            b[j]=temp;
    
    }
}
