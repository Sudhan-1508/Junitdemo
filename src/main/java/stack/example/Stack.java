package stack.example;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {
	
	private  Queue<Integer> queue1;
	private  Queue<Integer> queue2;
	
	public Stack() {
		queue1 = new LinkedList<>();
		queue2 = new LinkedList<>();
		
	}
	
	public void push(int x) {
        queue2.add(x);

        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
        
        
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
	
	}
	public int pop() {

        if (!queue1.isEmpty()) {
            return queue1.poll();
        }

        throw new RuntimeException("Stack is empty");
    }
	 public int top() {

	        if (!queue1.isEmpty()) {
	            return queue1.peek();
	        }

	        throw new RuntimeException("Stack is empty");
	    }
	 
	 public boolean empty() {

	        return queue1.isEmpty();
	    }

	    
	   
	}


