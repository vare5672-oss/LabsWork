import java.util.Stack;
public class BracketChecker {
   public static boolean isValid(String str) {
      Stack<Character> stack = new Stack<>();
      for (char c : str.toCharArray()) {
         if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
         } else if (c == ')' || c == '}' || c == ']') {
            if (stack.isEmpty()) {
               return false;
            }
            char top = stack.pop();
            if (c == ')' && top != '(') return false;
            if (c == '}' && top != '{') return false;
            if (c == ']' && top != '[') return false;
         }
      }
      return stack.isEmpty();
   }
   public static void main(String[] args) {
      System.out.println(isValid("[]"));
      System.out.println(isValid("[](){}"));
      System.out.println(isValid("[({})]"));
      System.out.println(isValid("[({()}){}]"));
      System.out.println(isValid("{]"));
      System.out.println(isValid("({})}"));

   }
   }