class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();
        int rest = q.size()-k;
        while(k-- > 0) stack.push(q.poll());
        while(!stack.isEmpty()) q.offer(stack.pop());
        while(rest-- > 0) q.offer(q.poll());
        
        return q;
    }
}
