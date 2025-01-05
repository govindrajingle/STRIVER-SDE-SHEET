import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// implementation of sorting of matrix
public class MergeIntervalsOptimal {
    public static void main(String[] args) {
        // Original matrix with intervals
        int intervals [][] = {{8, 10}, {1, 3}, {2, 6}, {1, 2}};
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int []> merged = new ArrayList<>();
        int [] prev = intervals[0];
        for(int i=1; i< intervals.length; i++){
            int [] interval = intervals[i];
            if(interval[0] <= prev[1]){
                prev[1] = Math.max(prev[1], interval[1]);
            } else {
                merged.add(prev);
                prev = interval;
            }
        }
        merged.add(prev);
        // Print the sorted matrix
        System.out.println(merged.toArray(new int[merged.size()][]));
    }
}

