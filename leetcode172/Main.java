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
}
