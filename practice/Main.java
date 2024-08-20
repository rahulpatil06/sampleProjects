package practice;

import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String[] str  = new String[]{"eat","tea","elbow","ate","below","bat"};
        groupWords(str);
        //Input: ["eat","tea","elbow","ate","below","bat"]
        //Output: [["bat"],["below","elbow"],["ate","eat","tea"]]
    }

    private static List<List<String>> groupWords(String[] words){
        List<String> list = Arrays.asList(words).stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        List<List<String>> result = new ArrayList<>();
      for(int i =0;i< list.size();i++){
          List<String> list1 = new ArrayList<>();
          list1.add(list.get(i));
          for(int j=i+1;j< list.size();j++){
              if(list.get(i).length() == list.get(j).length()){
                  char[] c = list.get(i).toCharArray();
                  char[] d = list.get(j).toCharArray();
                  Arrays.sort(c);
                  Arrays.sort(d);
                 if(String.valueOf(c).equals(String.valueOf(d))){
                     list1.add(list.get(j));
                     i = i+1;
                 }


              }
          }
          result.add(list1);
      }


    System.out.println(result);
        return result;
    }
}