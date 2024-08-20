package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test3 {
   static int k = 0;
   static String temp = "";
    //Rahulpatil
    public static <string> void main(String args[]){
        String str = "rahulpatil";
        String str1 = str.chars().mapToObj(c->(char)c).distinct().map(arr -> String.valueOf(arr)).collect(Collectors.joining());
        System.out.println(str1);

        String array[] ={"ax","d","bb","e","ed","co"};
        HashMap<String,Integer> hmap = new HashMap<>();
        for(int i =0;i<array.length;i++){
            hmap.put(array[i],array[i].length());
        }


        String word = "code";

        System.out.println("printing Static Code"+temp);
        hmap.entrySet().stream().forEach(m-> {
            if(m.getValue() > 1){
                if(m.getKey().equals(word.substring(k, k+2))){
                    temp = temp +m.getKey();
                    k +=2;
            }
        }});
        System.out.println(temp);
        for(Map.Entry entry : hmap.entrySet()) {
            if((int)entry.getValue() > 1){
                if(entry.getKey().equals(word.substring(k, k+2))){
                temp = temp +entry.getKey();
                k +=2;
            }
            }
        } ;
        for(Map.Entry entry : hmap.entrySet()) {
            if((int)entry.getValue() == 1){
                if(entry.getKey().equals(word.substring(k, k+1))){
                    temp = temp +entry.getKey();
                    k +=1;
                }
            }
        } ;
//        hmap.forEach((key,value) -> {
//            if(value == 1)
//            {if(key.contains(word.substring(k, k+1))){
//                temp = temp+key;
//                k +=1;
//            }
//            }
//        } );
        System.out.println(temp);
    }
}
