/* 
Given arr[n] and Q queries. 
For every query calculate sum of all element,
 in the given range
*/

class sumInRange2{

    // Solution
    public static int[] sumQuery(int[] arr, int[][] queries){
        int q = queries.length;
        int[] result = new int [q];

        //created an object to call the method to create prefix sum.
        int[] pf = prefixSum(arr);

        int start=0;
        int end=0;

        for (int i=0; i<q; i++){
            start = queries [i][0];
            end = queries [i][1];

            if (start==0){
                result[i] = pf[end];
            } else{
                result[i] = (pf[end]-pf[start]);
            }
        }

        return result;
    }


    public static int[] prefixSum(int[] arr){
        int n = arr.length;
        int[] pf = new int[n];

        //Edge case for creating prefix sum array
        pf[0]= arr[0];

        for (int i=1; i<n; i++){
            pf[i] = pf[i-1] + arr[i]; 
        }
        return pf;
        //pf[] = {1, 4, 9, 16, 25, 36}
    }

    public static void main(String[] args) {
        
        //Given
        int[] arr = {1, 3, 5, 7, 9, 11};
        int[][] queries = {{0, 2}, {1, 4}, {2, 5}};

        // Creating an object to call the below function for necessary operations.
        int [] rangeSum = sumQuery(arr, queries);

        for (int sum : rangeSum){
            System.out.println(sum);
        }
    }
}