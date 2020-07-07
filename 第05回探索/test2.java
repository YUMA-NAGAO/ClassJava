package 第05回探索;

public class test2 {
    public static void main(String args[]) {
        test instack = new test(5);
        int i;
        for (i = 1; i <= 3; i++) {
            if (!instack.isFull()) {
                instack.push(i * i);
                System.out.println("input " + (i * i) + ".");
            }
        }
        for (i = 1; i <= 2; i++) {
            System.out.println(instack.pop());
        }
        for (i = 4; i <= 7; i++) {
            if (!instack.isFull()) {
                instack.push(i * i);
                System.out.println("input " + (i * i) + ".");
            }
        }
        while (!instack.isEmpty()) {
            System.out.println(instack.pop());
        }
    }
}