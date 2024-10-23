package stack.example;

public class Main {
	  public static void main(String[] args) {
	     Stack stack = new Stack();
	     
	     stack.push(6);
	     stack.push(55);
	     
	     System.out.println(stack.top());
	     System.out.println(stack.pop());
	     System.out.println(stack.empty());
	     
	    }
}
