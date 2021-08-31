import java.util.*;
public class MajorityElementArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        MajorityElement(arr,n);
    }

    public static void MajorityElement(int arr[],int n){
        int MajorityElem=0;// initially 1st index is 1;
        int count=1; //  and count 1
        for(int i=1;i<n;i++){
            if(arr[i]==arr[MajorityElem]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                MajorityElem=i;
                count=1;
            }
        }
        // check majority element is actually an MAJORITY ELEMENT MEANS COUNT>=ARR.LENGTH/2;
        int MajorityElemAns=arr[MajorityElem];
        int MajorityCount=0;
        for(int i=0;i<n;i++ ){
            if(arr[i]==MajorityElemAns){
                MajorityCount++;
            }
        }
        

        if(MajorityCount>n/2){
            System.out.println("Majority element in arr is : "+ MajorityElemAns);
        }else{
            System.out.println("No Majority element in Array 😢");
        }
    }
}
