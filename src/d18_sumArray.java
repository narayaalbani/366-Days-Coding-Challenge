//Day 18/366
//https://www.codewars.com/kata/5a2be17aee1aaefe2a000151

import java.util.Arrays;

public class d18_sumArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
    }
}
