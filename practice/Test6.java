package practice;

import java.util.*;
import java.util.stream.Collectors;

public class Test6 {
    //int[] arr = {10,20,30,40,60,-10}
    // 10,40
    //20,30
    public static void main(String args[]){
//        int[] arr = {10,20,30,40,60,-10};
//        int sum =50;
        int[] arr = {4,5,2,10,7,12,15,11};

        ArrayList<Integer> li = new ArrayList<>();

//        HashSet<Integer> hashSet = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            li.add(arr[i]);
        }
//        for(int i =0;i<arr.length;i++){
//            if(hashSet.contains(sum-arr[i])){
//                System.out.println(arr[i] +","+ (sum-arr[i]));
//                hashSet.remove(arr[i]);
//            }
//        }
//
//
        Collections.sort(li);
         int end = li.get(li.size()-1);
        int start = li.get(0);
//        System.out.println(num);
         for(int i=start;i<end;i++){
             if(!li.contains(i)){
                 System.out.print(i +" ");
             }
         }
    }
}
