import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Stackbasics {

      public static void main(String[] args) {

          //Stack implementation
          Deque<Integer> s = new ArrayDeque<>();
          s.push(10);
          s.push(20);
          s.push(30);
          System.out.println(s);

          s.pop();
          System.out.println(s);
          System.out.println(s.peek());

    }
}
