import java.util.Stack;

public class MinStack{
    private Stack<Integer> minValue;
    private Stack<Integer> stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minValue = new Stack<>();
    }
    
    public void push(int x) {
        if (minValue.isEmpty()) {
            minValue.push(x);
        } else {
            if (x <= minValue.peek()) {
                minValue.push(x);
            }
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.peek().equals(minValue.peek())) {
            minValue.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minValue.peek();
    }
}

