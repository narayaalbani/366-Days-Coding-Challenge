import java.util.Arrays;

//Day 11/366

//Sum without highest and lowest number
//https://www.codewars.com/kata/576b93db1129fcf2200001e6/train/java

//Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
//The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
//Mind the input validation.

//Example
//{ 6, 2, 1, 8, 10 } => 16
//{ 1, 1, 11, 2, 3 } => 6
public class d11_sumMinMax {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return 0;
        }
        return Arrays.stream(numbers)
                .sorted()
                .skip(1)
                .limit(numbers.length - 2)
                .sum();
    }
}
