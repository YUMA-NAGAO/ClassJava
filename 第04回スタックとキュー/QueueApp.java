package 第04回スタックとキュー;

public class QueueApp {

    public static void main(String[] args) {
        QueueApp tes = new QueueApp();
        Queue obj = tes.new Queue(5);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(1);
        obj.enqueue(5);
        obj.enqueue(6);

        for (int z = 0; z < 3; z += 1) {
            System.out.println(obj.peek());
            obj.dequeue();
        }
        System.out.println("-------------------------");

        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(1);
        obj.enqueue(722);

        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            obj.dequeue();
        }
    }

    class Queue {
        // 属性
        private int maxSize;
        private int[] queueArray;
        private int front;
        private int rear;
        private int nItems;

        // メソッド
        public Queue(int n) {
            maxSize = n;
            queueArray = new int[maxSize];
            front = 0;
            rear = -1;
            nItems = 0;
        }

        public void enqueue(int dt) {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queueArray[++rear] = dt;
            nItems++;

        }

        public int dequeue() {
            int dt = queueArray[front++];
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            return dt;
        }

        public int peek() {
            return queueArray[front];
        }

        public boolean isEmpty() {
            return (nItems == 0);
        }

        public boolean isFull() {
            return (nItems == maxSize);
        }

    }

}