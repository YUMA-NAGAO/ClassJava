package 第04回スタックとキュー;

public class StackApp {

    public static void main(String[] args) {
        Stack obj = new Stack(5);
        obj.push(2);
        obj.push(3);
        obj.push(1);
        obj.push(5);
        obj.push(6);

        // isEmptyの返り値が空では無いとき、Trueなので、無限ループにするために！を付けて無限ループにした
        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            obj.pop();
        }

    }

}

class Stack {

    // 属性
    private int maxSize;
    private int[] stackArray;
    private int top;

    // メソッド
    public Stack(int n) {
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
