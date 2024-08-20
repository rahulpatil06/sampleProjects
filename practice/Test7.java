package practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test7 {

   public static void main(String args[]){
//       List<Integer> list = Arrays.asList(5,6,5,9,7,2,3,6);
//        list.stream().collect(Collectors.toMap(Function.identity(),V->1L,Long::sum)).forEach((k,v)->{
//            if(v > 1){
//                System.out.println(k);
//            }
//        });
//       Set<Integer> list1 = list.stream().filter(v -> Collections.frequency(list,v) >1).collect(Collectors.toSet());
//       System.out.println(list1);
       List<String> list = Arrays.asList("apple","mango","banana","apple");
       list.stream().flatMap(str -> str.chars().mapToObj(c->(char) c)).collect
               (Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach((k,v) ->System.out.println(k +" =>"+v));
       String str = "rahulpatilreuwbax";
       String temp = str.chars().mapToObj(c ->(char) c).collect(Collectors.toMap(Function.identity(),V->1L,Long::sum)).entrySet().stream()
               .filter(c -> c.getValue() >1).map(c -> String.valueOf(c.getKey())).collect(Collectors.joining(","));
       System.out.println(temp);
   }
}
