package com.stackroute.pe3;

public class ArrayException {
    public static void main(String[] args) {
//        NegativeArraySizeException
        try{
            int arr[]=new int[-3];
        }catch(NegativeArraySizeException e){
            System.out.println(e);
        }

//        IndexOutOfBoundsException
        try{
            int arr[]=new int[3];
            arr[3]=30;
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }

//        NullPointerException
        try{
            int arr[]=null;
            int length=arr.length;
        }catch(NullPointerException e){
            System.out.println(e);
        }
    }


}
