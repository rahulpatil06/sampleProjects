package test.intuit.com;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestVisa1 {

    public static void main(String aregs[]){
        int[] arr1 = new int[]{1, 4,6,8,9};
        int[] arr2 = new int[]{2,3,4,5,7,10,13};

        int[] temp = IntStream.concat(IntStream.of(arr1),IntStream.of(arr2)).distinct().sorted().toArray();
        for(int i : temp) {
            System.out.print (i +" ");
        }
        Set<Integer> set = new TreeSet<Integer>();
        for(int i =0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println();
        System.out.println(set);
        int[] arr3 = new int[]{8,4,6,2,3};
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr3.length;i++){
            for(int j=i;j<arr3.length;j++){
                if(arr3[i] > arr3[j]) {
                    arr3[i] = arr3[i] - arr3[j];
                    break;
                }
            }

        }
        for (int a:arr3) {
            System.out.print(a + " ");
        }
        System.out.println();
        int[] arr4 = new int[]{-12, 11, -13, -5, 6, -7, 5, -3, -6};
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<arr4.length;i++) {
            int t = arr4[i];
            int j=i;
            while (j + 1 < arr4.length) {
                if (arr4[j + 1] > 0) {
                    arr4[i] = arr4[j + 1];
                    arr4[j + 1] = t;
                    break;
                }
                j++;
            }

//            if(arr4[i] > 0){
//                list1.add(arr4[i]);
//                arr4[i] = 0;
//            }
//            list2.add(arr4[i] );
        }
        for (int a:arr4
             ) {
            System.out.print(a +" ");
        }
        System.out.println();

    String str = "appleaRahul";
    char c[] = str.toCharArray();
    Stream<Character> stream  = str.chars().mapToObj(ch ->(char)ch);
    System.out.println(stream.collect(Collectors.groupingBy(k -> k, Collectors.counting())));
    }

}
