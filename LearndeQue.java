import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Scanner;


public class LearndeQue {
    public static void main (String args[]) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Enter a number to add to the deque:");
        n = sc.nextInt();

        adq.offer(n);
        System.out.println("After offer: "+adq);
        adq.offerFirst(90);
        System.out.println("After offerFirst: "+adq);
        adq.offerLast(34);
        System.out.println("After offerLast: "+adq);

        adq.poll();
        System.out.println("After poll: "+adq);
        adq.pollFirst();
        System.out.println("After pollFirst: "+adq);
        adq.pollLast();
        System.out.println("After pollLast: "+adq);
    }
}
