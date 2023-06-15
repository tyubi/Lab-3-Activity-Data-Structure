import java.util.Scanner;
import java.util.Stack;

public class problemstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            System.out.print("Enter the number of test cases: ");
            int n = sc.nextInt();
            sc.nextLine();
            String[] results = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the set of parentheses: ");
                String parentheses = sc.nextLine();
                if (isBalanced(parentheses)) {
                    results[i] = "BALANCED";
                } else {
                    results[i] = "NOT BALANCED";
                }
            }
            for (String result : results) {
                System.out.println(result);
            }
            System.out.print("Do you want to input again? (Yes/No): ");
            String input = sc.nextLine();
            if (!input.equalsIgnoreCase("Yes")) {
                repeat = false;
                System.out.println("THANK YOU!! SEE YOU AGAIN");
            }
        }
    }

    public static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < parentheses.length(); i++) {
            char c = parentheses.charAt(i);
            if (c == '(' || c == '{') {
                stack.push(c); // Push
            } else if (c == ')' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop(); // will Pop the top element
                if ((c == ')' && top != '(') || (c == '}' && top != '{')) {
                    return false; // Found mismatched parentheses
                }
            }
        }
        return stack.isEmpty(); // If stack is empty
    }
}