import java.util.*;

public class sumInRange {
    public static int[] sumQuery(int[] arr, int[][] queries){ 
        int q = queries.length;
        int[] result = new int[q];

        for (int i=0; i<q; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            
            int sum = 0;
            for(int j=start; j<=end; j++){
                sum = sum + arr[j];
            }
            result[i] = sum;
            
        }
        return result;
    }
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11};
        int[][] queries = {{0, 2}, {1, 4}, {2, 5}};

        int[] rangeSum = sumQuery(arr, queries);

        for(int anyVar : rangeSum){
            System.out.println(anyVar);
        }
        
    }
}
