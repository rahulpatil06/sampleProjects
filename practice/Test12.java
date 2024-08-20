package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.System.exit;

public class Test12 {
//    Write a Program char findFirst(String input)
//  * Finds the first character that does not repeat anywhere in the input string
//  * If all characters are repeated, return 0
//            * Given "apple", the answer is "a"
//            * Given "racecars", the answer is "e"
//            * Given "ababdc", the answer is "d"

    public static void  main(String args[]){
        String str = "racecars";
        Character cr = str.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() ==1L).map(e ->e.getKey()).findFirst().get();
        System.out.println(cr);
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.stream().filter( i-> i/2 == 0).mapToInt(i -> i*i).sum();
        System.out.println(list.stream().filter( i-> i%2 == 0).mapToInt(i-> i*i).sum());
        List<Integer> numList =Arrays.asList(10,15,8,49,1,25,98,32,105).stream().
                filter( n -> (n==2|| ((int) Math.log10(n)>0 && n/(int)Math.floor(Math.pow(10,(int) Math.log10(n)))==2))).collect(Collectors.toList());
        System.out.println(numList);
//        for(int i=0;i<str.length();i++){
//            if(map.get(str.charAt(i) )== 1){
//                System.out.println(str.charAt(i));
//                break;
//            }
//        }


    }
}
