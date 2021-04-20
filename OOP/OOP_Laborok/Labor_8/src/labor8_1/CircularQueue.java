package labor8_1;

public class CircularQueue implements IQueue{

    private int CAPACITY;
    private  Object[] items;
    private int front = -1;
    private int rear = -1;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new Object[CAPACITY];
    }

    @Override
    public boolean isEmpty() {
        if(front == -1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isFull() {
         if(front == 0 && rear == CAPACITY-1){
             return true;
         }
         if(front == rear +1){
             return true;
         }
         return false;
    }

    @Override
    public void enQueue(Object object) {
        if(isFull()){
            System.out.println("Queue is full!");
        }else{
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % CAPACITY;
            items[rear] = object;
            //System.out.println(object + " inserted to circular Queue");
        }
    }

    @Override
    public Object deQueue() {
        Object object;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else{
            object = items[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }else{
                front = (front + 1) % CAPACITY;
            }
            return (object);
        }
    }

    @Override
    public void printQueue() {
        int i;
        if(isEmpty()){
            System.out.println("Empty Queue");
        }else{
            System.out.println("Front-> " + front);
            System.out.println("Items-> ");
            for(i=front; i!=rear; i = (i+1)%CAPACITY){
                System.out.println(items[i] + " ");
            }
            System.out.println(items[i]);
            System.out.println("Rear-> " + rear);
        }
    }
}











