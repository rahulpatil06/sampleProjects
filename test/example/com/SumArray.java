package test.example.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class SumArray {
    public static void main(String args[]){
        int[] arr = new int[]{3,5,1,1,2,8,1,1,9};
        int k=3;
        //sum = 3+5+8;
        int sum =0;

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            sum = sum+arr[i];
        }
        int curr = sum;
        int j= arr.length-1;
        for(int i=k-1;i>=0;i--){
            sum = sum + arr[j] -arr[i];
            curr = Math.max(curr,sum);
            j--;
        }
        System.out.println(curr);

//        Employee e1 = new Employee(1,"Rahul",15000);
//        Employee e2 = new Employee(10,"Aarvi",10000);
//        Employee e3 = new Employee(5,"Tanmaya",050210);
//        Employee e5 = new Employee(2,"Mukta",50000);
//        TreeSet<Employee> ts = new TreeSet<>();
//
//        ts.add(e2);
//        ts.add(e5);
//        ts.add(e3);
//
//       ts.forEach(t -> System.out.println(t));
    }
}
