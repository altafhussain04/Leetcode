import java.util.ArrayDeque;
import java.util.Deque;

class StockSpanner {
    // Stack stores pairs: [price, span]
    private Deque<int[]> st;

    public StockSpanner() {
        st = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int span = 1;
        
        // Pop elements from the stack while the current price is greater than or equal
        // to the price at the top of the stack, accumulating their spans
        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.peek()[1];
            st.pop();
        }
        
        // Push the current price and its calculated total span onto the stack
        st.push(new int[]{price, span});
        
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */