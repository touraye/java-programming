package java2.classes.search;

import java.util.ArrayList;

public class Linear {
    public static int search(int[] arr, int target) {
        // [1,2,3,4,5,6,7,8,9]  9
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }

        return -1;
    }

    public static ArrayList<ArrayList<Integer>> twoDMatrix(int n) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            matrix.add(row);
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[] data = new int[1000000];
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }
        int target = 999999;
        long startTime = System.nanoTime();
        int ans = search(data, target);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        long milliseconds = duration / 1_000_000;
        long seconds = milliseconds / 1000;
        long minute = seconds / 60;

        System.out.println("Found index: " +ans);
        System.out.println("TIME TAKEN:");
        System.out.println(duration+"nanoseconds");
        System.out.println(milliseconds+"millisecond");
        System.out.println(seconds+"seconds");
        System.out.println(minute+"minute");

    }
}
