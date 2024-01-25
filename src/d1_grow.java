//Day 1/366

//https://www.codewars.com/kata/57f780909f7e8e3183000078

//Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
//[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
public class d1_grow {
    public static int grow(int[] x) {
        int result = x[0];
        for (int i = 1; i < x.length; i++) {
            result *= x[i];
        }
        return result;
    }
}
