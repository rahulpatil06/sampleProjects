package practice;


import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test17 {
//    Input: head = [1,2,2,1]
//    Output: true
public static void main(String args[]){
    String s = "aabb";
    Optional<Character> val  = Optional.ofNullable(s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
            entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey());

    System.out.println(s.indexOf(String.valueOf(val)));

}
}
