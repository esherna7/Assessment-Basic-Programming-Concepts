// author Esai Hernandez

// Write a static method that takes in an array of ints, adds them together, and returns the result.
// Call your new method inside a main method and print out the result for the following three example arrays
public class SummativeSums{

    public static void main(String[] args){
       
       int [] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
       int [] array2 = { 999, -60, -77, 14, 160, 301 };
       int [] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };

       System.out.println("#1 Array Sum: " + sum(array1));
       System.out.println("#2 Array Sum: " + sum(array2));
       System.out.println("#3 Array Sum: " + sum(array3));
    }

    // returns total sum of elements in array
    public static int sum(int[] array){
        int total = 0;
        for(int element : array){
            total += element;
        }
        return total;
    }


}