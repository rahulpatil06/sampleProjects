package test.learning;

import test.example.com.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class SetLearning {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<>();
        String str = "Rahul";
        String str2 = new String("Rahul");

        Employee e1 = new Employee(1,"Rahul",100);
        Employee e2 = new Employee(2,"Mukta",500);
        Employee e3 = new Employee(3,"Patil",100);
        Employee f1 = new Employee(6,"RahulP",1200);
        Employee f2 = new Employee(9,"MuktaR",5100);
        Employee f3 = new Employee(10,"PatilY",6100);
        List<Employee> list = Arrays.asList(e1,e2,e3,f1,f2,f3);
        List<Employee> result =  list.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
        result.forEach(e-> System.out.println(e.id+" "+e.name +" "+e.salary));
        hs.add(str);
        hs.add(str2);
        System.out.println(hs.size());
    }
}
