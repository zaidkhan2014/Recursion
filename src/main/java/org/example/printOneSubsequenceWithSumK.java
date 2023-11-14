package org.example;

import java.util.ArrayList;

public class printOneSubsequenceWithSumK {
    public static boolean f(int index,int[]arr, ArrayList<Integer>answer,int sum,int s){
        int n= arr.length;
        if (index==n){
            if (s==sum){
                System.out.println(answer);
                return true;
            }else {
                return false;
            }
        }
        answer.add(arr[index]);
        s+=arr[index];
        if (f(index+1,arr,answer,sum,s)==true){
            return true;
        }

        answer.remove(answer.size()-1);
        s-=arr[index];

        if (f(index+1,arr,answer,sum,s)==true){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr={1,2,1};
        ArrayList<Integer> temp=new ArrayList<>();
        f(0,arr,temp,2,0);

    }
}
