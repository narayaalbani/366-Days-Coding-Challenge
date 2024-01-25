//Day 2/366

//https://www.codewars.com/kata/5a00e05cc374cb34d100000d

//Build a function that returns an array of integers from n to 1 where n>0.
//Example : n=5 --> [5,4,3,2,1]
public class d2_reversed {
    public static int[] reverse(int n){
        int [] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }
        return result;
    }
}
