import java.util.Arrays;
import java.util.*;
import java.util.Scanner;


public class reversed {

    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

      
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

}

// Output: [5, 4, 3, 2, 1]