package com.itheima.Array;

public class ArrayDemon04 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println(sum);
        

        int [] arr01 = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / 3 == 1){
                count++;
            }
        }
        System.out.println(count);
        
        
        
        int [] arr02 = new int[] {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr02.length; i++) {
            if (arr02[i] / 2 == 1){
                arr02[i] = arr02[i] / 2 ;
            }else{
                arr02[i] = arr02[i] * 2;
            }

        }
        System.out.println(arr02[1]);

        
        
        
        
        
    }
    
}
