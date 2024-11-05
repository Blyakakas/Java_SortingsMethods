import com.tema.SortingMethods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int time = 0;
        int[] arr = {7, 34, 56, 91, 2, 12, 67, 81, 19, 45, 10, 99, 60, 33, 78, 15, 88, 40, 53};
        arr = SortingMethods.mergeSort(arr);
       // System.out.println(t2 - t);

        System.out.println(Arrays.toString(arr));
    }
}