import java.util.*;

public class maxminArray {
 public static void main(String[] args)throws Exception{
     Scanner scn = new Scanner(System.in);
     int n=scn.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
         arr[i]=scn.nextInt();
     }
     scn.close();
     Arrays.sort(arr);
     int max=arr[n-1];
     int min=arr[0];
     System.out.println("Max: "+max+" Min: "+min);

 }    
}
