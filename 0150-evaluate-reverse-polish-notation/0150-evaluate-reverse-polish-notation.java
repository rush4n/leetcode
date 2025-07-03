class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            if (isOperator(s)) {
                int a = stack.pop();
                int b = stack.pop(); 
                int val = eval(b, a, s);
                stack.push(val);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
    }
    
    private boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    private int eval(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
}