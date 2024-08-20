package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String args[]) throws IOException {
//        InputStreamReader input = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(input);
//        System.out.println("Enter the String...!!");
//        String str = br.readLine();
//        String[] temp =str.split(" ");
//        HashMap<String,Integer> hmap = new HashMap<>();
//        for(int i=0;i<temp.length;i++){
//            hmap.put(temp[i],hmap.getOrDefault(temp[i], 0)+1);
//        }
//        hmap.forEach((k,v) -> System.out.println(k +" "+v));
//        Input : arr = ["a1b3c4","6x5y3z2","4am5n6"]
//        Output : 134+6532+456 = 7122
        List<String> list = Arrays.asList("a1b1c1","111","1am1n1");
        List<Integer> val = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            char[] temp = list.get(i).toCharArray();
            String str ="";
            for(int j=0;j<temp.length;j++){
                if(Character.isDigit(temp[j])){
                    str = str + String.valueOf(temp[j]);
                }
            }
            val.add(Integer.parseInt(str));
        }

        System.out.println(val.stream().mapToInt(i ->i).sum());
        String str = "a1b3c4";
        str = str.replaceAll("[^0-9]", "");

        System.out.println(str);
    }

}
