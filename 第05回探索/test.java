package 第05回探索;

public class test {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public test(int n) {
        maxSize = n;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int dt) {
        stackArray[++top] = dt;
    }

    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}