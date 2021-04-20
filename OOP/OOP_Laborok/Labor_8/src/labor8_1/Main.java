package labor8_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        IQueue queue = new ArrayListQueue(5);
//        for(int i=0; i<10; ++i){
//            queue.enQueue(i);
//            queue.printQueue();
//        }
//        System.out.println();
//        for(int i=0; i<8; ++i){
//            System.out.println("Deleted element: " + queue.deQueue());
//            queue.printQueue();
//        }
//
//        IQueue q1 = new ArrayListQueue(5);
//        IQueue q2 = new ArrayListQueue(10);
//        for( int i=0; i<5; ++i){
//            q1.enQueue( i );
//            q2.enQueue( i );
//        }
//        System.out.println( q1.equals( q2 ));
        IQueue queue = new CircularQueue(5); // new CircularQueue( 5 );
        Random rnd = new Random();
        for (int i = 0; i < 20; ++i) {
            int value = rnd.nextInt(100);
            if (value < 50) {
                System.out.println("Add: " + i);
                queue.enQueue(i);
            } else {
                if (queue.isEmpty()) {
                    System.out.println("Cannot delete from an empty queue");
                } else {
                    Object element = (Object)queue.deQueue();
                    System.out.println("Deleted: " + element);
                }
            }
            queue.printQueue();
        }

    }
}
