package java2.classes.recursion.binaryS;

public class BinarySearch {
    static int search(int [] arr, int target, int s, int e){
        if (s > e) {
            return -1;
        }

        // divide the array into two
        int m = s + (e -s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }

        return search(arr, target, m + 1, e);
    }

    public static void main(String[] args) {
        int[] num = {3, 5, 6, 12, 20, 59};
        int target = 59;
        int index = search(num, target, 0, num.length - 1);
        System.out.println("found index: " +index);
    }
}
