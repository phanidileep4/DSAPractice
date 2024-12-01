package com.dsapractice.linear;

public class ArrayReverse {

    public void printArray(int[] arr){
        int n=arr.length;
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public int[] reverseArray(int[] inputArray, int start, int end){
        int inputArrayLength=inputArray.length;
        if(start>end){
            System.out.println("Start position can't be greater than end position, returning original array");
        }
        if(start>inputArrayLength||end>inputArrayLength){
            System.out.println("Start or end position can't be greater than inputArray length, returning original array");
        }
        while(start<end){
            int temp=inputArray[start];
            inputArray[start]=inputArray[end];
            inputArray[end]=temp;
            start++;
            end--;
        }
        return inputArray;
    }

    public static void main(String[] args){
        int[] array= {2,5,24,56,9,0,13,8,6};
        ArrayReverse ar=new ArrayReverse();
        ar.printArray(ar.reverseArray(array,3,6));
    }
}
