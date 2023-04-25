package Q1.ui;

import java.util.Stack;

public class BalancedBracket {
	
	public static boolean isBalanced(String input) {
		Stack<Character> stack = new Stack<Character>();
		Stack<Character> tempStack = new Stack<Character>();
		char temp;
		char searchTemp = 'a';
		
		char top;		
		for(int i = 0; i < input.length(); i++) {
			temp = input.charAt(i);			
			if(temp == '{' || temp == '(' || temp == '[') {
				stack.push(temp);
			} else {
				switch(temp) {
					case '}':
						searchTemp = '{';
						break;
					case ']':
						searchTemp = '[';
						break;
					case ')':
						searchTemp = '(';
						break;
					default:
						System.out.println("Not a bracket");
						break;
				}
				while(!stack.isEmpty()) {
					top = stack.pop();
					tempStack.push(top);
					if(top == searchTemp) {
						tempStack.pop();
						while(!tempStack.isEmpty()) {
							stack.push(tempStack.pop());
						}
						break;
					}
				}

			}
		}
		
		if(stack.isEmpty() && tempStack.isEmpty())
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		String input = "{}[(])";
		
		if(isBalanced(input)) {
			System.out.println("Brackets are balanced - " + input);  			
		} else {
			System.out.println("Brackets are not balanced - " + input);			
		}

		input = "{}[]())(";
		
		if(isBalanced(input)) {
			System.out.println("Brackets are balanced - " + input);  			
		} else {
			System.out.println("Brackets are not balanced - " + input);			
		}

	}

}
