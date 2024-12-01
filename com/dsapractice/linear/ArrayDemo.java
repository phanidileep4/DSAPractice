package com.dsapractice.linear;

public class ArrayDemo {

    public void printArray(int[] arr){
        int n=arr.length;
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int[] myArray=new int[5];
        myArray[0]=5;
        myArray[1]=54;
        myArray[3]=2;
        myArray[4]=50;
        myArray[2]=90;
        //myArray[5]=1;ArrayIndexOutOfBoundsException

        printArray(myArray);
        System.out.println("length of the myArray is:"+myArray.length);
        System.out.println("first index element is:"+myArray[0]);
        System.out.println("last index element is:"+myArray[myArray.length-1]);
        int[] myArray2={5,3,2,1};
        printArray(myArray2);
        System.out.println("length of the myArray2 is:"+myArray2.length);
        System.out.println("first index element is:"+myArray2[0]);
        System.out.println("last index element is:"+myArray2[myArray2.length-1]);

        printArray(new int[]{4,2,1,4,6,7,89,9});

    }
    public static void main(String[] args){
        /*declaration and initialization can be like following
         dataType ArrayVariable[]=new dataType[size];
         dataType[] ArrayVariable=new dataType[size];
         example:
         int myArray[]=new int[5];
         int[] myArray= new int[5]; //preferred as it can instantly tell int array type
         int[] myArray= {5,4,3,2,6};
        */
        ArrayDemo ad=new ArrayDemo();
        ad.arrayDemo();
    }

}
