import java.util.*;

public class union2Array {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }
        Set<Integer> hash_Set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            hash_Set.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            hash_Set.add(b[i]);
        }
        System.out.println(hash_Set.size());

        scn.close();
    }
}
