public class d2_reversedSequence {
    public static int[] reverse(int n){
        int [] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }
        return result;
    }
}
