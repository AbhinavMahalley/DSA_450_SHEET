import java.util.*;

public class mergeIntervalArr {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            arr[j][0] = scn.nextInt();
            arr[j][1] = scn.nextInt();
        }
        scn.close();
        int ansArr[][] = mergeOverlappingIntervals(arr);
        for (int j = 0; j < ansArr.length; j++) {
            System.out.println(ansArr[j][0] + " - " + ansArr[j][1]);
        }
    }

    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        Pair pair[] = new Pair[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            pair[i] = new Pair(intervals[i][0], intervals[i][1]);
        }
        Arrays.sort(pair);
        Stack<Pair> st = new Stack<>();
        for (Pair n : pair) {
            if (st.size() > 0) {
                Pair p = st.peek();
                if (p.end >= n.start) {
                    Pair mergePair = new Pair(p.start, Math.max(p.end, n.end));
                    st.pop();
                    st.push(mergePair);
                } else {
                    st.push(n);
                }
            } else {
                st.push(n);
            }
        }

        int ansArr[][] = new int[st.size()][2];
        for (int i = st.size() - 1; i >= 0; i--) {
            Pair ans = st.pop();
            ansArr[i][0] = ans.start;
            ansArr[i][1] = ans.end;
        }
        return ansArr;
    }

    public static class Pair implements Comparable<Pair> {
        int start;
        int end;

        Pair(int s, int e) {
            start = s;
            end = e;
        }

        public int compareTo(Pair b) {
            Pair a = this;
            if (a.start < b.start)
                return -1;
            if (a.start > b.start)
                return +1;
            return 0;
        }
    }
}
