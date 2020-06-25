package 第04回スタックとキュー;

import java.util.ArrayList;

public class StackApp {

    public static void main(String[] args) {
        StackApp tes = new StackApp();
        Stack obj = tes.new Stack();

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

        public static void output(ArrayList<String> list) {
            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

    }

}