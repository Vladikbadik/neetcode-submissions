class Solution {
    public int lengthOfLastWord(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) != ' '){
                stack.push(s.charAt(i));
            }

            if (s.charAt(i) == ' ' && stack.size() >= 1){
                break;
            }


        
    }
    return stack.size();
 }
}