package practice;

import java.io.File;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;



public class Test14 {
    public static void main(String args[]){
        String str = "A man, a plan, a canal, PanamaP!";
        str = str.replaceAll("[^a-zA-Z]" ,"");
        System.out.println(str);
       List<Employee1> list = new ArrayList<>();
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i) != ',' && str.charAt(i) !=' '&& str.charAt(i) != '!'){
//                list.add(str.charAt(i));
//            }
//        }
//        int j = list.size()-1;
//        for (int i =0;i<list.size()/2;i++){
//            if(String.valueOf(list.get(i)).equalsIgnoreCase(String.valueOf(list.get(j)))){
//                j -=1;
//            }
//        }
//        if(j == list.size()/2){
//            System.out.println("Its Palindrome..!");
//        }else{
//            System.out.println("Not Palindrome..!");
//        }
      list.add(new Employee1("asdas",23, Arrays.asList("Java","Python","Node JS")));
        list.add(new Employee1("asdas",35, Arrays.asList("Java","Python")));
        list.add(new Employee1("asdas",45, Arrays.asList("Java","Python","TypeScript")));
        list.add(new Employee1("asdas",12, Arrays.asList("Java")));
        list.add(new Employee1("asdas",26, Arrays.asList("Python")));
        list.stream().flatMap(e -> e.getSkills().stream()).collect(Collectors.toSet()).forEach(i -> System.out.println(i));

        File file = new File("/adasd");
        String inputString = "Java Concept Of The Day";
        char ch = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).
                entrySet().stream().filter( e -> e.getValue() > 1).findFirst().get().getKey();

        System.out.println(ch);
        Person p1 = new Person("Rahul", 32);
        Person p2 = new Person("Rahul", 32);
        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        System.out.println(set);


    }


}
