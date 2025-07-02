class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (isOpen(c)) stack.push(c);
            else {
                if (stack.size() > 0 && isMatch(stack.peek(), c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        return stack.size() == 0;
    }

    private boolean isMatch(Character open, Character close) {
        return ((open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}'));
    }

    private boolean isOpen(Character c) {
            return c == '(' || c == '[' || c == '{'; 
        }
}
