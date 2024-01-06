package com.itheima.Array;

import java.util.Random;

public class ArrayDemon06 {
    public static void main(String[] args) {
        int [] arr01 = {33,5,22,44,55,66};

        //自己写的
//        int arrMax = 0;
        //不能等于0 如果有负数他的最大值就会为0
//        for (int i = 0; i < arr01.length; i++) {
//            if (arr01[0] >= arr01[1]){
//                 arrMax = arr01[0];
//            }
//            if(arr01[i] >= arrMax){
//                arrMax = arr01[i];
//            }
//        }
//        System.out.println(arrMax);

        int arrMax = arr01[0];
        for (int i = 1; i < arr01.length; i++) {
            if (arr01[i] >= arrMax){
                arrMax = arr01[i];
            }
        }
        System.out.println(arrMax);

        int [] arr02 = new int[10];
        int sum = 0;
        int average = 0;
        Random r = new Random();
        for (int i = 0; i < arr02.length; i++) {
            int number = r.nextInt(101);
            arr02[i] = number;
        }
        for (int i = 0; i < arr02.length; i++) {
            System.out.println(arr02[i] + "");
            sum += arr02[i];
            average = sum / arr02.length;
        }
        System.out.println(sum);
        System.out.println(average);



        int count = 0;
        for (int i = 0; i < arr02.length; i++) {
            if (arr02[i] < average){
                count++;
            }
        }
        System.out.println(count);

        //定义一个数组，存入1,2,3,4,5 按照要求交换索引对应的元素
//        交换前 1,2,3，4,5
//        交换后 5,2,3,4,1
        int [] arr03 = {1,2,3,4,5};
        int temp = arr03[0];
        arr03[0] = arr03[4];
        arr03[4] = temp;
        for (int i = 0; i < arr03.length; i++) {
            System.out.println(arr03[i] + "");


        }

    }

}
