package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Test1 {
    // Apple A,Array y,Red R
    //123456
    public static void main(String args[]){
        String string = "eRdED";
        Map<Character, Long> map = string.chars().mapToObj(c -> (char)c).collect(Collectors.toMap(Function.identity(), V->1L,Long::sum));
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.stream()
                        .forEach(i -> {
                            if (i % 2 != 0) {
                                System.out.print(i * i+" ");
                            }
                            else{
                                    System.out.print(i+" ");
                                }
                        });
        System.out.println(map);

        for(int i=0;i<string.length();i++){
            if(map.get(string.charAt(i)) ==1){
                if(string.charAt(i) != Character.toUpperCase(string.charAt(i)) &&(map.containsKey(Character.toUpperCase(string.charAt(i)))) ){
                    continue;
                }else if(string.charAt(i) != Character.toLowerCase(string.charAt(i)) && (map.containsKey(Character.toLowerCase(string.charAt(i))))){
                    continue;
                }else{
                    System.out.println(string.charAt(i));
                    break;
                }
            }
        }
    }
}
