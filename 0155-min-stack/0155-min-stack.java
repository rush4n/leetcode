class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> auxStack;

    public MinStack() {
        this.mainStack = new Stack<>();
        this.auxStack = new Stack<>();
    }
    
    public void push(int val) {
        this.mainStack.push(val);
        if (auxStack.isEmpty() || val <= this.auxStack.peek()) this.auxStack.push(val);
    }
    
    public void pop() {
        if (this.top() == this.getMin()) this.auxStack.pop();
        this.mainStack.pop();
    }
    
    public int top() {
        return this.mainStack.peek();
    }
    
    public int getMin() {
        return this.auxStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */