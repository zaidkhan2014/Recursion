package org.example;

public class ReverseArray {
    private static int [] swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
    public static void reverseArray(int []arr,int i,int j){
        if(i==j){
            return;
        }
        swap(arr,i,j);
        reverseArray(arr,i+1,j-1);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3};
        reverseArray(arr,0, arr.length-1);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
