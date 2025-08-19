import java.util.Scanner;
class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key element: ");
        key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key element found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Key element not found");
        }
    }
}