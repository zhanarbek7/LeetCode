class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int digits = 0, numberForDigits = x, number = x, reversedNumber = 0;
        while(numberForDigits>0){
            numberForDigits/=10;
            digits++;
        }
        int digitsCopy = digits;
        for(int i = 1; i <= digits; i++){
            reversedNumber += (int)(number % 10 * Math.pow(10, digitsCopy - 1));
            number /= 10;
            digitsCopy--;
        }
        return reversedNumber == x;
    }
}