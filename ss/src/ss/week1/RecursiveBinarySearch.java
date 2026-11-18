package ss.week1;


public class RecursiveBinarySearch {

    public static int search(int[] data, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (data[mid] == target) {
            return mid;
        }

        if (target < data[mid]) {
            return search(data, target, start, mid - 1);
        }

        return search(data, target, mid + 1, end);
    }

    public static void main(String[] args) {
        int[] data = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        System.out.println(search(data, 16, 0, data.length-1));
    }
}
