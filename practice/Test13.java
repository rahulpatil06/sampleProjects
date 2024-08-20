package practice;

import test.learning.LinkedList;

import java.util.*;
import java.util.stream.Collectors;

public class Test13 {
    public static void main(String args[]){
        HashMap<String,Employee> hashMap = new HashMap<>();
        hashMap.put("a",new Employee(2,"Rahul",35));
        hashMap.put("b",new Employee(5,"Raju",25));
        hashMap.put("c",new Employee(1,"Ajay",26));
        hashMap.put("d",new Employee(6,"Naveen",31));
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getAge))).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(l1,l2) -> l1,LinkedHashMap::new))
                .forEach((k,v) -> System.out.println(k+" "+v.getAge()));


        hashMap.entrySet().stream().sorted((e1,e2) -> new CustomComparator().compare(e1.getValue(),e2.getValue())).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(l1,l2) -> l1,LinkedHashMap::new))
                .forEach((k,v) -> System.out.println(k+" "+v.getAge()));
//        List<Employee> list = new ArrayList<>();
//        list.add(new Employee(2,"Rahul",29,new Employee2(23,56,68)));
//        list.add(new Employee(5,"Mukta",29,new Employee2(32,65,86)));
//        list.add(new Employee(3,"Patil",29,new Employee2(13,46,56)));
//
//       list= list.stream().sorted(Comparator.comparing(e ->e.getEmployee2().sum(e.getEmployee2()))).collect(Collectors.toList());
//        System.out.println(list.get(list.size()-1).getAge() +" "+ list.get(list.size()-1).getId()+" " + list.get(list.size()-1).getName());
//
    }


}
