package test.learning;

import java.util.Stack;

public class ExpressionaEvaluations {
    public static void main(String args[]){
        System.out.println(ExpressionaEvaluations.evaluate("100 * (12+20) /2"));
//        System.out.println(ExpressionaEvaluations.
//                evaluate("100 * 2 + 12 / 2"));
    }
    private static int evaluate(String expression) {
        char[] tokens = expression.toCharArray();
        Stack<Integer> val = new Stack<>();
        Stack<Character> ops = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i] == ' '){
                continue;
            }
            if(tokens [i] >= '0' && tokens[i] <= '9' ){
                StringBuffer str = new StringBuffer();
                while (i< tokens.length && tokens[i] >= '0' &&
                        tokens[i] <= '9'){
                    str.append(tokens[i++]);
                }
                val.push(Integer.parseInt(str.toString()));
                i--;
            } else if (tokens[i] == '(') {
                ops.push(tokens[i]);
            }else if(tokens[i] == ')'){
                while (ops.peek() != '('){
                    val.push(applyOp(ops.pop(),val.pop(),val.pop()));
                }
                ops.pop();
            }else if(tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/' ){
                while(!ops.empty() && hasPrecedence(tokens[i],ops.peek())){
                        val.push(applyOp(ops.pop(),val.pop(),val.pop()));
                }
                ops.push(tokens[i]);
            }

        }
        while (!ops.empty()){
            val.push(applyOp(ops.pop(),
                    val.pop(),
                    val.pop()));

            // Top of 'values' contains
            // result, return it

        }
        return val.pop();
    }
    public static boolean hasPrecedence(char op1 ,char op2){
        if(op2 == '(' || op2 == ')'){
            return false;
        }
        if((op1 == '*' || op1 == '/') && (op2 =='+' || op2 == '-')){
            return false;
        }else
            return true;

    }
    public static int applyOp(char op,
                              int b, int a)
    {
        switch (op)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new
                            UnsupportedOperationException(
                            "Cannot divide by zero");
                return a / b;
        }
        return 0;
    }
}
