package ch06.p5static;

import java.util.Arrays;

// static import
import static java.util.Arrays.copyOf;
import static java.util.Arrays.fill;

public class C03Static {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3};
        int[] brr = new int[5];
        Arrays.fill(brr,100);

        int[] crr = copyOf(arr, arr.length);
    }
}
