import java.util.*;

public class LargestSumContiSubArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        long MaxSum = Integer.MIN_VALUE;
        long CurrentSum = 0;
        for (int i = 0; i < n; i++) {
            CurrentSum += arr[i];
            if (MaxSum < CurrentSum) {
                MaxSum = CurrentSum;
            }
            if (CurrentSum < 0) {
                CurrentSum = 0;
            }
        }
        System.out.println(MaxSum);
    }
}
