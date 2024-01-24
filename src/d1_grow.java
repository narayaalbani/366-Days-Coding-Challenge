import java.util.Arrays;

public class d1_grow {
    public static int grow(int[] x) {
        int result = x[0];
        for (int i = 1; i < x.length; i++) {
            result *= x[i];
        }
        return result;
    }
}
