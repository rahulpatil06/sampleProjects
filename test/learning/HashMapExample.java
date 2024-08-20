package test.learning;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class HashMapExample {
    public static void main(String args[]){
        String str = "rahullaahhhh";
        HashMap<Character,Integer> hmap = new HashMap<>();
        char []text = str.toCharArray();
        HashMap<Character,Long> map = (HashMap<Character, Long>) str.chars().mapToObj(c->(char)c).collect(Collectors.toMap(Function.identity(), V->1L,Long::sum));
        System.out.println(map);
        Map<Object, Object> map1=  map.entrySet().stream().filter(a->a.getValue() >1).collect(Collectors.toMap(b ->(char) b.getKey(), b -> (long)b.getValue()));
        System.out.println(map1);
        for(Map.Entry<Character,Long> data:map.entrySet()){
            System.out.println(data.getKey()+" "+data.getValue());
        }
        for(int i=0;i<str.length()-1;i++){
            if(hmap.isEmpty() || !hmap.containsKey(str.charAt(i)) ){
                hmap.put(str.charAt(i),1);
            }else{
                hmap.put(str.charAt(i),hmap.get(str.charAt(i))+1);
            }
        }
        Iterator<Map.Entry<Character,Integer>> itr = hmap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Character, Integer> entry = itr.next();
            if(entry.getValue() > 1){
                System.out.print(entry.getKey()+","+entry.getValue()+",");
            }
        }
//        for(Map.Entry<Character,Integer> itr : hmap.entrySet()){
//            if(itr.getValue()>1){
//                System.out.print(itr.getKey()+","+itr.getValue()+",");
//            }
//        }

    }
}
