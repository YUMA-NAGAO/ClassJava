package 第04回スタックとキュー;

public class QueueApp {

    public static void main(String[] args) {
        QueueApp App1 = new QueueApp();
        Queue obj = App1.new Queue();
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