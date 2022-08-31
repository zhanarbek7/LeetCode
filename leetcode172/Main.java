package leetcode172;

public class Main {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(30));
    }



    public static int trailingZeroes(int n) {
        int counter = 0;
        while(n>0){
            n/=5;
            counter+=n;
        }
        return counter;
    }

    public static int findTrailingZeros(int n) {
        int count = 0;

        // Keep dividing n by powers
        // of 5 and update count
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
    }
}
