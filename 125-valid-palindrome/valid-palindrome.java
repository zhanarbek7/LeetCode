class Solution {
    public boolean isPalindrome(String s) {
        s = removeSymbolsAndSpaces(s);
        if(s.length()==0){
            return true;
        }
        String result = "";
        for(int i = s.length()-1; i >= 0; i--){
            result += s.charAt(i);
        }
        return s.equalsIgnoreCase(result);
    }
    public static String removeSymbolsAndSpaces(String str) {
        StringBuilder cleaned = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c) && c != ' ' && c != '_') {
                cleaned.append(c);
            }
        }

        return cleaned.toString();
    }
}