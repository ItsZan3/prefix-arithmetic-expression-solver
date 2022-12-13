package algoproject;

import java.util.Scanner;

public class AlgoProject {

    public static void main(String[] args) {
        String repeat = "yes";
        while(!repeat.equals("no")){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a prefix equation:");

            String exp = input.next();

            String r = "";

            for (int i = 0; i < exp.length(); i++) {
                r = exp.charAt(i) + r;
            }

            Stack s = new Stack();

            for (char c: r.toCharArray()) {
                switch (c) {
                    case '+': {
                        double result = s.pop() + s.pop();
                        s.push(result);
                        break;
                    }
                    case '-': {
                        double result = s.pop() - s.pop();
                        s.push(result);
                        break;
                    }
                    case '*': {
                        double result = s.pop() * s.pop();
                        s.push(result);
                        break;
                    }
                    case '/': {
                        double a = s.pop();
                        double b = s.pop();  
                        if (b == 0){
                          throw new
                                UnsupportedOperationException("Cannot divide by zero");
                        }
                        double result = a / b;
                        s.push(result);
                        break;
                    }
                    default:
                        s.push((double) (c - '0'));
                        break;
                }
            }
            
            System.out.printf("Final Value: %.2f\n", s.pop());
            System.out.println("Enter \"yes\" to continue, otherwise \"no\".");
            repeat = input.next();
    }
        
    }
}
