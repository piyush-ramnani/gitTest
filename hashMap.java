import java.util.HashMap;

public class hashMap {

    public static void main(String[] args) {
    int[] A = {1, 2, 3, 4, 5};
    int[] B = {2, 4, 6, 8};
    
    //creating an instance of hashMap class titled 'solver'.
    //Calling solve function created below on the object solver.
    hashMap solver = new hashMap();
    int[] result = solver.solve(A, B);
    
    //Since the solve method returns an array object, we will have to print it separately.
    System.out.println("Result:");
        for (int value : result) {
            System.out.print(value);
        }
    }

    public int[] solve(int[] A, int[] B) {

        int[] result = new int[B.length];

        HashMap <Integer, Integer> frequency = new HashMap<>();

        for (int el : A){
                //Checking if the value exists increment frequency or get 0 and then mapping it to HashMap
                frequency.put(el, frequency.getOrDefault(el, 0)+1);
        }

        for(int i=0; i<B.length; i++){
            //Checking if HashMap has the element of array B
            if(frequency.containsKey(B[i])){
                result[i] = frequency.get(B[i]);    //Creating a new array and getting the frequency of the B array element
            } else{
                result[i] = 0;  //Inserting 0 if the element is not present
            }
        }

        return result;
    }

}