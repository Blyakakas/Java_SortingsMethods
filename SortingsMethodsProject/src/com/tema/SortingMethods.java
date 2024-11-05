package com.tema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static com.tema.UsableMethods.swap;
import static com.tema.UsableMethods.changeArraySize;
import static com.tema.UsableMethods.partition;

public class SortingMethods
{



    public  static void quickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static void bubbleSort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    swap(arr,i,j);
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(arr,i,minIndex);
            }
        }
    }

    public static int[] stalinSort(int[] arr, int ammo)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++)
        {
            list.add(arr[i]);
        }

        for(int i = 0; i < list.size() + ammo; i++)
        {
            for(int j = 1; j < list.size(); j++)
            {
                if(list.get(j) < list.get(j - 1))
                    list.remove(j);
            }
        }


        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] mergeSort(int[] arr)
    {
        if (arr.length <= 1)
        {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }
    private static int[] merge(int[] left, int[] right)
    {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length)
        {
            if (left[i] <= right[j])
            {
                result[k++] = left[i++];
            }
            else
            {
                result[k++] = right[j++];
            }
        }

        while (i < left.length)
        {
            result[k++] = left[i++];
        }

        while (j < right.length)
        {
            result[k++] = right[j++];
        }

        return result;
    }
}
