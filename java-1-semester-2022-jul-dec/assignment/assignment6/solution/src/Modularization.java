import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Modularization {
    public static void main(String[] args) {
        Mod mod = new Mod();
      mod.gc = "fnnfkmf";
      mod.setName("Lamin");
      mod.setAge(20);
      mod.getInfo();
      mod.hasPass = false;
      mod.setList("banana", "apple");

        System.out.println(mod.getList());
        int[] list = {0,8, 55, 77, 89};
        int total = 0;

        for(int n : list){
            System.out.println(n);
            total += n;
        }
        System.out.println("Total " +total);

        int total2 = 0;
        for(int i = 0; i < list.length; i++){
//            System.out.println(list[i]);
            JOptionPane.showMessageDialog(null, list[i]);
            total2 = total2 + list[i];
        }
        System.out.println("Total2 " +total2);
        JOptionPane.showMessageDialog(null, total2);
    }

}
