package java2.classes.search;

public class Binary {
    public static int search(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == target) {
                return m;
            } else if (arr[m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        return -1;
    }

    public double total(int[] arr) {
        double total = 0;
        // int data = [arr.length]

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int t = 2;
        long startTime = System.nanoTime();
        int ans = search(arr, t);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;
        long milliseconds = duration  / 1_000_000;
        long seconds = milliseconds / 1000;
        long minutes = seconds / 60;

        System.out.println("Bench Marked:");
        System.out.println("Found Index: " +ans);
        System.out.println(duration+"nanoseconds");
        System.out.println(milliseconds+"milliseconds");
        System.out.println(seconds+"seconds");
        System.out.println(minutes+"minutes");
    }
}
