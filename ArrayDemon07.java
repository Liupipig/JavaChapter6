package com.itheima.Array;

public class ArrayDemon07 {
    public static void main(String[] args) {
        int [] arr01 = {1,2,3,4,5};
        for (int i =0,j = arr01.length - 1;i < j;i++,j--) {
            int temp = arr01[i];
            arr01[i] = arr01[j];
            arr01[j] = temp;
        }
        for (int i = 0; i < arr01.length; i++) {
            System.out.print(arr01[i] + " ");
        }

    }
}
