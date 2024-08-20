package test.example.com;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCj {
    public static void main(String args[]){
        Integer a[]= {1,2,4,4,2,5};
        HashMap<Integer,Integer> hmap = new HashMap();
        for(int i=0;i<a.length;i++){
            if(hmap.containsKey(a[i])){
                hmap.put(a[i],hmap.get(a[i])+1);
            }else{
                hmap.put(a[i],1);
            }
        }
        Iterator<Map.Entry<Integer,Integer>> itr = hmap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry) itr.next();
            if(Integer.parseInt(entry.getValue().toString()) > 1){
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }

        Map<Integer, Integer> duplicateCountMap = new HashMap<>();

        Map<Integer, Integer> result = hmap.entrySet().stream().filter(map->map.getValue().intValue() >1).collect(Collectors.toMap(map -> map.getKey(),map->map.getValue()));
//        Stream<Integer> stream = Stream.of(a).filter(i -> Collections.frequency(a, i) > 1).collect(Collectors.toSet());
//        Map<Integer, Integer> result1 = Arrays.stream(a).collect(Collectors.toMap());
        Map<Integer, Long> result1 = Stream.of(a).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(map ->map.getValue() >1).collect(Collectors.toMap(map -> map.getKey(),map->map.getValue()));
        System.out.println(result1);
    }
}
