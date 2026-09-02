/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/count-number-of-words1500/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public int countWords(String s) {

        ArrayList<String> list = new ArrayList<>();

        int j = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ' ||
                s.charAt(i) == '\n' ||
                s.charAt(i) == '\t') {

                if (j < i) {
                    String str = s.substring(j, i);
                    list.add(str);
                }

                j = i + 1;
            }
        }

        if (j < s.length()) {
            String str = s.substring(j, s.length());
            list.add(str);
        }

        return list.size();
    }
}
