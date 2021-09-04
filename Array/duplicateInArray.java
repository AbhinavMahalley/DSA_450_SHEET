import java.util.*;

public class duplicateInArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        
        System.out.print(findDuplicate(arr));

    }
    
    // public static int findDuplicate(int[] nums) {
    //     // time- O(N) SPACE- O(N)
    //     Set<Integer> set=new HashSet<Integer>();
    //     for(int i=0;i<nums.length;i++){
    //         if(set.contains(nums[i])){
    //             return nums[i];
    //         }else{
    //             set.add(nums[i]);
    //         }
    //     }
        
    //     return 0;
    // }
    public static int findDuplicate(int[] nums){
        // Time- O(N) Space- O(1)
        for(int i=0;i<nums.length;i++){
            nums[nums[i]%nums.length]= nums[nums[i]%nums.length]+nums.length;
        }
        int dupNum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]/nums.length>1){
                dupNum=i;
                break;
            }
        }
        return dupNum;
    }
}
