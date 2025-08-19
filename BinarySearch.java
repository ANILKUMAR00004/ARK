public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int low = 0;
        int high = array.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
