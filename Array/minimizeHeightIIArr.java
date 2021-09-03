import java.util.*;
public class minimizeHeightIIArr {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int k= scn.nextInt();
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
       System.out.print("Minimize height "+ getMinDiff(arr,n,k));
    }

   public static  int getMinDiff(int[] arr, int n, int k) {
        // code here
         if(n==1)return 0;
         Arrays.sort(arr);
         
         int ans=arr[n-1]-arr[0];// b - a

         int minEle,maxEle;
         for(int i=1;i<n;i++){
             // check negative case
             if(arr[i]>=k){
                 
             maxEle=Math.max(arr[i-1]+k,arr[n-1]-k);// a+k 
             minEle=Math.min(arr[0]+k,arr[i]-k);// b-k
             
             ans=Math.min(ans,maxEle-minEle); // (b-k)-(a+k) 
             }
         }
         return ans;
    }
}
