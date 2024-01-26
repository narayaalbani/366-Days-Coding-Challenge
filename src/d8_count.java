//Day 8/366

//Count by X
//https://www.codewars.com/kata/5513795bd3fafb56c200049e

//Create a function with two arguments that will return an array of the first n multiples of x.
//Assume both the given number and the number of times to count will be positive numbers greater than 0.
//Return the results as an array or list ( depending on language ).

//Examples
//countBy(1,10)  // should return  {1,2,3,4,5,6,7,8,9,10}
//countBy(2,5)  // should return {2,4,6,8,10}

import java.util.stream.IntStream;
public class d8_count {
    public static int[] countBy(int x, int n){
        return IntStream.range(1, n+1).map(i -> x*i).toArray();
    }
}
