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
        stack.pop();
        minList.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minList.peek();
    }
}
