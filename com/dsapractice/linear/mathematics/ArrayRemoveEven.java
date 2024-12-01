package com.dsapractice.linear.mathematics;

public class ArrayRemoveEven {

    public static void printArray(int[] arry){
        for(int j=0;j<arry.length;j++)
            System.out.print(arry[j]+" ");
        System.out.println();
    }

    public static int[] removeEven(int[] inputArray){
        int oddCount=0;
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]%2 !=0)
                oddCount++;
        }
        int index=0;
        int[] result= new int[oddCount];
        for (int i=0;i<inputArray.length;i++) {
            if(inputArray[i]%2!=0){
                result[index]=inputArray[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr={3,2,5,7,10,7,8,4}; //input array, output should be 3,5,7,7
        printArray(removeEven(arr));
    }
}
