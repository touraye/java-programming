package java2.classes.ds.queue.CQueue;

import java2.classes.ds.queue.dynamic.DynamicQueue1;

public class Main {
    public static void main(String[] args) {
        DynamicQueue1 queue = new DynamicQueue1();
        queue.isFull();
        queue.isEmpty();
        queue.add(50);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(120);
        queue.add(5);

        queue.add(34);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(60);
        queue.display();

        int a = 0;
        System.out.println(a+": "+(a%=5));
        a += 1; // 0 + 1
        System.out.println(a+": "+(a%=5));

        a += 1; // 1 + 1
        System.out.println(a+": "+(a%=5));

        a += 1; // 2 + 1
        System.out.println(a+": "+(a%=5));

        a += 1; // 3 + 1
        System.out.println(a+": "+(a%=5));

        a += 1; // 4 + 1
        System.out.println(a+": "+(a%=5));

    }
}
