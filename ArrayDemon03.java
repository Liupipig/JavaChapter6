package com.itheima.Array;

public class ArrayDemon03 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        //获取数组里边所有元素
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
        //利用循环改进代码
//        for (int i = 0; i < 5; i++) {
//            System.out.println(arr[i]);
//        }
//        在JAVA中，关于数组的一个长度属性.length
//        调用方式，数组名.length
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//idea提供的快速生成遍历方式
//        for (int i = 0; i < arr.length; i++) {
//
//        }
    }
}
