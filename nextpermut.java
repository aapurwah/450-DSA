import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class nextpermut {

    public static void nextpt(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if(i >= 0) {
            int j = n - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);
    }

        private static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        private static void reverse(int[] nums, int start, int end){
            while (start<end){
                swap(nums,start,end);
                start++;
                end--;

    
            }

}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = scanner.nextInt();
    int[] nums = new int[n];
    System.out.print("Enter the elements: ");
    for (int i = 0; i < n; i++) {
        nums[i] = scanner.nextInt();
    }
    nextpt(nums);
    System.out.println("Next permutation: " + Arrays.toString(nums));
}
}

   
    
