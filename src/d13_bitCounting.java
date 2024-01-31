//Day 13/366
//https://www.codewars.com/kata/526571aae218b8ee490006f4
public class d13_bitCounting {
    public static int countBits(int n){
//        String binary = Integer.toBinaryString(n);
//        char num = '1';
//
//        int count = 0;
//        for (int i = 0; i < binary.length(); i++) {
//            if (binary.charAt(i) == num) {
//                count++;
//            }
//        }
//        return count;

        return Integer.bitCount(n);
    }
}
