package org.example;

import java.net.Inet4Address;
import java.util.ArrayList;

public class Subsequences {

    public static void printSubsequences(int index, ArrayList<Integer>arr,ArrayList<Integer> answer){
        int n=arr.size();
        if (index>=n){
            System.out.println(answer);
            return;
        }
        answer.add(arr.get(index));
        printSubsequences(index+1,arr,answer);
        answer.remove(arr.get(index));
        printSubsequences(index+1,arr,answer);

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> answer=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        printSubsequences(0,arr,answer);
    }
}
