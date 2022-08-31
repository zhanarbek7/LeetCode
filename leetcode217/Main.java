package leetcode217;


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4,5,6}));
    }

    public static boolean containsDuplicate(int[] nums){
        // I used hashSet because it doesn't contain duplicate values
        HashSet<Integer> set = new HashSet<>();
        for (int i: nums) {
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return true;
    }

}
