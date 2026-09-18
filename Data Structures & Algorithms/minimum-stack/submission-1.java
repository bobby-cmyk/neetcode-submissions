class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> minList;

    public MinStack() {
        stack = new ArrayDeque<>();
        minList = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);

        if (!minList.isEmpty()) {
            int lower = Math.min(val, minList.peek());
            minList.push(lower);
        }
        else {
            minList.push(val);
        }
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minList.pop();
        }
    }
    
    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        
        return -1;
    }
    
    public int getMin() {
        if (!minList.isEmpty()) {
            return minList.peek();
        }

        return -1;
    }
}
