import java.util.*;
public class sortArrays012 {
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        scn.close();
        sort012(arr, n);
        for(int a : arr){
            System.out.print(a+" ");
        }
    } 
    public static void sort012(int a[], int n)
    {
            int i=0,j=0,k=n-1;
        while(j<=k){
            if(a[j]==0){
               swap(a,i,j);
               i++;
               j++;
            }else if(a[j]==1){
                j++;
            }else if(a[j]==2){
                swap(a,j,k);
                k--;
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
