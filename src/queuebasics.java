import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queuebasics {

    public static void main (String[] args){

        //Queue implementations
        Queue<Integer> Q = new ArrayDeque<>();

        Q.offer(10);
        Q.offer(20);
        Q.offer(30);
        System.out.println(Q);
        System.out.println("Removing " +Q.poll());
        System.out.println(Q);
        System.out.println("Peek : " +Q.peek());
    }
}
