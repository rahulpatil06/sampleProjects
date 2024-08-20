package test.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TCSInterview implements abc,xyz{
    public static void main(String args[]){
        //10,7,26,8,34,19,10,1

        List<Integer> list = Arrays.asList(10,7,26,8,34,19,10,1);
        List<Integer> data1 = list.stream().distinct().collect(Collectors.toList());
        List<Integer> data = list.stream().filter(a -> ((a / 10 )==1) || (a % 10 ==1)).collect(Collectors.toList());
        System.out.println(data);
        System.out.println(data1);
        int arr []  = new int[]{10,7,26,8,34,19,10,1};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i] == arr[j]){
                    arr[j] = -1;
                }
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        TCSInterview interview = new TCSInterview();
        System.out.println(interview.Display());
        String str1 = new String("Rahul");
        String str2 = "Rahul";
        System.out.print(str1 == str2);

    }

    @Override
    public String Display() {
        return abc.super.Display();
    }
}
