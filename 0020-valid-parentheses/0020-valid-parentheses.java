import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c:s.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if ( c == '}' && top != '{'){
                    return false;
                } else if ( c == ']' && top != '['){
                    return false;
                } else if( c == ')' && top != '('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println(solution.isValid("()"));        // Output: true
        System.out.println(solution.isValid("()[]{}"));    // Output: true
        System.out.println(solution.isValid("(]"));        // Output: false
        System.out.println(solution.isValid("([])"));      // Output: true
        System.out.println(solution.isValid("([)]"));      // Output: false
    }
}