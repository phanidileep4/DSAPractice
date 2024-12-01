package com.dsapractice.linear.mathematics;

public class ArrayOutOfBoundAndAccess {
    public static void printArray(int[] arry){
        for(int j=0;j<arry.length;j++)
            System.out.print(arry[j]+" ");
        System.out.println();
    }

    public void arrayDemo(){
        int[] myArray =new int[5];
        printArray(myArray);
        myArray[0]=5;
        myArray[2]=3;
        myArray[1]=4;
        myArray[3]=1;
        myArray[4]=2;
        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[6]);
    }
    public static void main(String[] args){
        ArrayOutOfBoundAndAccess arrUtil=new ArrayOutOfBoundAndAccess();
        arrUtil.arrayDemo();
    }
}