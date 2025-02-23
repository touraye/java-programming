package java2.labs.lab4;

import java.util.HashMap;
import java.util.Map;

public class Lab4 {
    public static void main(String[] args) {
        String[][] studentGrade = {
                {"ahmed dicko", "4.0"},
                {"binta jallow", "3.35"},
                {"yuspha jarju", "2.75"},
                {"jainaba njie", "3.75"},
        };

        Map<String,Double> map = new HashMap<>();
        map.put("ahmed dicko", 4.0);
        map.put("binta jallow", 3.35);
        map.put("yuspha jarju", 2.75);
        map.put("jainaba njie", 3.75);

        //
        System.out.println(map.get("ahmed dicko"));

        for (Map.Entry<String,Double> entry : map.entrySet()){
            System.out.println(entry.getKey() +
                    ": " + entry.getValue());
    }



        /*
        write method to add in an inner array into the map
         */
    }
}
