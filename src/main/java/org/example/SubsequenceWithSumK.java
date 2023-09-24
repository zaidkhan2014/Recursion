package org.example;

import java.util.ArrayList;

public class SubsequenceWithSumK {
    public static void printSubsequence(int index,int[]arr,ArrayList<Integer>temp,int sum,int ans){
        int n=arr.length;
        if (index==n){
            if (sum==ans){
                System.out.println(temp);
            }
            return;
        }
        temp.add(arr[index]);
        sum+=arr[index];
        //pick
        printSubsequence(index+1,arr,temp,sum,ans);
        //remove
        sum-=arr[index];
        temp.remove(temp.size()-1);
        //nonpick
        printSubsequence(index+1,arr,temp,sum,ans);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        ArrayList<Integer> temp=new ArrayList<>();
        printSubsequence(0,arr,temp,0,5);
    }
}
