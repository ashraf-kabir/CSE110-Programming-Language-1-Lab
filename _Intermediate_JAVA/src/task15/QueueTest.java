package task15;

import java.util.PriorityQueue;

import static java.lang.System.out;

public class QueueTest {
    public static void main(String[] args) {

        PriorityQueue<String> q = new PriorityQueue<String>();

        q.offer("first");
        q.offer("second");
        q.offer("third");

        out.printf("%s ", q);
        out.println();

        out.printf("%s ", q.peek());
        out.println();

        q.poll();
        out.printf("%s ", q);

    }
}
