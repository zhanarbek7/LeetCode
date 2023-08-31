class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] strings = s.split(" ");
        return strings[strings.length-1].length();
    }
}