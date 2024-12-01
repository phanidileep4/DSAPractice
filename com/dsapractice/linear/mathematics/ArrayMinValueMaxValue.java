package com.dsapractice.linear.mathematics;

public class ArrayMinValueMaxValue {
    public int findMinimum(int[] inputArray) throws IllegalAccessException {
        if(inputArray==null || inputArray.length==0)
            throw new IllegalAccessException("not a valid array");
        int min=inputArray[0];
        for(int j=1;j<inputArray.length;j++){
            if(inputArray[j]<min){
                min=inputArray[j];
            }
        }
        return min;
    }
    public int findMaximum(int[] inputArray) throws IllegalAccessException {
        if(inputArray==null || inputArray.length==0)
            throw new IllegalAccessException("not a valid array");
        int max=inputArray[0];
        for(int j=1;j<inputArray.length;j++){
            if(inputArray[j]>max){
                max=inputArray[j];
            }
        }
        return max;
    }

    public static void main(String[] args) throws IllegalAccessException {
        int[] inputArray={45,23,76,98,03,43};
        ArrayMinValueMaxValue amm=new ArrayMinValueMaxValue();
        System.out.println("minimum value of inputArray is:"+amm.findMinimum(inputArray));
        System.out.println("maximum value of inputArray is:"+amm.findMaximum(inputArray));
    }
}
