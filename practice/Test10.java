package practice;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test10 {
    public static void main(String args[]){
        HashMap<String,Integer> hmap = new HashMap<>();
        hmap.put("Satish",10);
        hmap.put("Rahul",10); hmap.put("Suresh",20);
        hmap.put("Rakesh",30);
        hmap.put("Raju",10);
        Map<Integer, List<String>> hm =hmap.entrySet()
                .stream()
                .collect(Collectors.groupingBy(e -> e.getValue(),
                        Collectors.mapping(k -> k.getKey(), Collectors.toList())));
        System.out.println(hm);
    }
}

