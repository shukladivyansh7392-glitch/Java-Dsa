import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeBasics {

    public static void main(String[] args){

        //Deque Queue

        Deque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offerFirst(20);
        q.offerLast(30);
        System.out.println(q);

        q.pollLast();
        System.out.println(q);
        q.pollFirst();
        System.out.println(q);

        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());


    }
}
