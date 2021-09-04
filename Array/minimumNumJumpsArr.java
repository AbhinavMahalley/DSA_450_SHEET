import java.util.*;

public class minimumNumJumpsArr {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        // int dp[]=new int[n];
        // Arrays.fill(dp, Integer.MAX_VALUE);
        // System.out.print("Minimize height "+ getMinJump(arr,n,dp));
        System.out.print("Minimize height " + getMinJump(arr, n));

    }
    // public static int getMinJump(int arr[],int n,int dp[]){
    // // tabulation O(N^2)
    // if(n==1){
    // return 0;
    // }
    // if(arr[0]==0){
    // return -1;
    // }
    // dp[0]=0;
    // for(int i=1;i<n;i++){
    // for(int j=0;j<i;j++){
    // if(i<=j+arr[j]){
    // dp[i]=Math.min(dp[i],dp[j]+1);
    // }
    // }
    // }
    // return dp[n-1];

    // }

    public static int getMinJump(int arr[], int n) {
        // gready
        if (n == 1) {
            return 0;
        }
        if (arr[0] == 0) {
            return -1;
        }
        int maxR = arr[0];// max reach
        int step = arr[0];// steps
        int jumps = 1;

        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                return jumps;
            }
            maxR=Math.max(maxR,i+arr[i]);
            step--;
            if(step==0){
                jumps++;
                if(i>=maxR){ //if i> maxR  we never reach to max reach
                    return -1;
                }
                step=maxR-i;
            }
        }

        return jumps;
    }

}
