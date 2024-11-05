package com.tema;

public class UsableMethods
{
    public static void swap(int[] arr, int elementOne, int elementTwo)
    {
        int temp = arr[elementOne];
        arr[elementOne] = arr[elementTwo];
        arr[elementTwo] = temp;
    }

    public static int[] changeArraySize(int[] arr,int newSize)
    {
        int[] newArray = new int[newSize];

        for(int i = 0; i < newSize; i++)
        {
            newArray[i] = arr[i];
        }
        arr = new int[newSize];
        arr = newArray;
        return arr;
    }

    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }

        swap(arr, i + 1, high);
        return i+1;
    }

}
