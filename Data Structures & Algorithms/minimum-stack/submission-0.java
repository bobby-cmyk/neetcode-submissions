class MinStack {

    private List<Integer> stack;
    private List<Integer> minList;

    public MinStack() {
        stack = new ArrayList<>();
        minList = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);

        if (!minList.isEmpty()) {
            int lower = Math.min(val, minList.get(minList.size() - 1));
            minList.add(lower);
        }
        else {
            minList.add(val);
        }
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            stack.remove(stack.size() - 1);
            minList.remove(minList.size() - 1);
        }
    }
    
    public int top() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        
        return -1;
    }
    
    public int getMin() {
        if (!minList.isEmpty()) {
            return minList.get(minList.size() - 1);
        }

        return -1;
    }
}
