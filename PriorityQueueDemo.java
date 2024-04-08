import java.util.*;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of gold wires");

        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            int g = sc.nextInt();
            pq.add(g);
        }

        int add = 0;
        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            add = a + b;
            pq.add(add);
        }

        System.out.println(add);
        sc.close();

    }
    
}
