import java.util.*;
public class KthMinMaxArray {
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        scn.close();
       int min= kthSmallest(arr,0,n-1,k);
       
            System.out.print("Kth minimun "+min);
        
    }
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Shortcut code here
    //   Arrays.sort(arr);
    //   return arr[k-1];
    
    //merge sort
    int ans[]=mergSort(arr,l,r);
    return ans[k-1];
        
    
    } 
    
     public static int[] mergSort(int arr[],int l,int r){
         if(l==r){
             int rarr[]=new int[1];
             rarr[0]=arr[l];
             return rarr;
         }
         int mid=(l+r)/2;
      int fs[]= mergSort(arr,l,mid);
      int Ss[]=mergSort(arr,mid+1,r);
         int ans[]= mergArr(fs,Ss);
         return ans;
     }
     
     public static int[] mergArr(int a[],int b[]){
         int i=0,j=0;
         
         int ans[]=new int[a.length+b.length];
         int k=0;
          while(i < a.length && j < b.length){
        if(a[i] <= b[j]){
          ans[k] = a[i];
          i++;
          k++;
        }else{
          ans[k] = b[j];
          j++;
          k++;
        }
    }

    while(i < a.length){
      ans[k] = a[i];
      k++;
      i++;
    }

    while(j < b.length){
      ans[k] = b[j];
      k++;
      j++;
    }
    
         
         return ans;
     }
}
