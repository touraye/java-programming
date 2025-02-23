package java2.classes.ds.queue.circular;

import java2.classes.ds.queue.dynamic.DQueue;
import java2.classes.ds.queue.dynamic.DynamicQueue;

public class Main {
   public static void main(String[] args) {
//      CircularQueue queue = new CircularQueue();
//      DynamicQueue queue = new DynamicQueue();
      DQueue queue = new DQueue();
      queue.insert(50);
      queue.insert(30);
      queue.insert(3);
      queue.insert(2);
      queue.insert(12);
//      queue.insert(1);
//      queue.insert(6);
//      queue.insert(61);
//      queue.insert(23);
//      queue.insert(21);
//      queue.insert(31);
      System.out.println("Removed: " +queue.remove());
      System.out.println("Removed: " +queue.remove());
      queue.insert(50);
//      System.out.println("Removed: " +queue.remove());
//      System.out.println("Removed: " +queue.remove());
//      System.out.println("Removed: " +queue.remove());
//      System.out.println("Removed: " +queue.remove());
//      System.out.println("Removed: " +queue.remove());
//      System.out.println("Removed: " +queue.remove());
//      System.out.println("Removed: " +queue.remove());
//      System.out.println("Removed: " +queue.remove());
//      System.out.println("Removed: " +queue.remove());
//      System.out.println("Removed: " +queue.remove());
//      queue.insert(14);
//      queue.insert(18);
//      System.out.println("END: " +queue.end);
//      System.out.println("FRONT: " +queue.front);
//      queue.insert(8);
//      queue.insert(140);
//      queue.insert(1);
//      queue.insert(10);
//      queue.insert(40);
//      queue.insert(20);
//      queue.insert(30);
//      queue.insert(3);
//      queue.insert(2);
//      queue.insert(5);
//      queue.insert(53);
//      queue.insert(54);

      //remove an item from queue
//       System.out.println("Removed item: " +queue.remove());
//       System.out.println("Removed item: " +queue.remove());
//       System.out.println("Removed item: " +queue.remove());
//       System.out.println("Removed item: " +queue.remove());

      queue.display();
       //System.out.println("End: " +queue.getEnd());
//       System.out.println("REMOVED ITEM: "+queue.remove());
//       queue.insert(10);
//       System.out.println("REMOVED ITEM: "+queue.remove());
//       queue.insert(16);
//       queue.display();
//       System.out.println("Front: " +queue.getFront());
   }
}
