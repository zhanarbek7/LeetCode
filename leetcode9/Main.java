package leetcode9;

public class Main {
    public static void main(String[] args) {
//        System.out.println(isPalindromeSecondWay(1));
        System.out.println(isPalindromeSecondWay(121));
    }

    // first way
    public static boolean isPalindromeFirstWay(int x) {
        String num = String.valueOf(x);
        String firstPart;
        String secondPart = "";
        if(num.length()%2==0){
            firstPart = num.substring(0, num.length()/2);
            String secondPartFake = num.substring(num.length()/2);
            for (int i=secondPartFake.length()-1; i>=0; i--) {
                secondPart+=secondPartFake.charAt(i);
            }
            return firstPart.equals(secondPart);
        }
        else
            firstPart = num.substring(0, num.length()/2+1);
            String secondPartFake = num.substring(num.length()/2);
            for (int i=secondPartFake.length()-1; i>=0; i--) {
            secondPart+=secondPartFake.charAt(i);
            }
            return firstPart.equals(secondPart);
    }

    // best way
    public static boolean isPalindromeSecondWay(int x){
        if(x<0 || (x%10==0 && x!=0))
            return false;

        int reversedNumber = 0;
        while(x>reversedNumber){
            reversedNumber = reversedNumber * 10 + x % 10;
            x/=10;
        }

        return x == reversedNumber || x == reversedNumber/10;
    }

    // third way
    public static boolean isPalindromeThirdWay(int x){
        int fakeNumForLength = x, fakeNumForManipulation = x;
        int reversedOne = 0, lengthOfNumber = 0;

        while(fakeNumForLength > 0){
            fakeNumForLength/=10;
            lengthOfNumber++;
        }

        int multiplier = (int)Math.pow(10, lengthOfNumber-1);

        while (multiplier>0){
            reversedOne = reversedOne + (fakeNumForManipulation % 10) * multiplier;
            multiplier/=10;
            fakeNumForManipulation/=10;
        }

        return x == reversedOne;

    }


}
