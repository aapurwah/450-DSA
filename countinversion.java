import java.util.Scanner;

public class countinversion {

    public static int cI(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) { // ✅ Corrected loop condition
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // ✅ Take input first
        }

        int result = cI(arr); // ✅ Call function after input
        System.out.println("Number of inversions: " + result);
        
        scanner.close(); // ✅ Close scanner to prevent memory leak
    }
}
