import java.util.EmptyStackException;
import java.util.Stack;
public class StackPushPopExample {
 public static void main(String[] args) {
 Stack<Integer> stk = new Stack<>();
 System.out.println("stack: " + stk);
 
 pushelement(stk, 20);
 pushelement(stk, 13);
 pushelement(stk, 89);
 pushelement(stk, 90);
 pushelement(stk, 11);
 pushelement(stk, 45);
 pushelement(stk, 18);
 
 popelement(stk);
 popelement(stk);
 
 try {
 popelement(stk);
 } catch (EmptyStackException e) {
 System.out.println("empty stack");
 }
 }
 static void pushelement(Stack<Integer> stk, int x) {
 stk.push(x);
 System.out.println("push -> " + x);
 System.out.println("stack: " + stk);
 }
 static void popelement(Stack<Integer> stk) {
 System.out.print("pop -> ");
 Integer x = stk.pop();
 System.out.println(x);
 System.out.println("stack: " + stk);
 }
}
