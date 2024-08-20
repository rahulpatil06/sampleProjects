package test.interview;

import java.util.HashMap;

/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
public class Program5 {
    public static void main(String...a){

        HashMap<Employee, String> hm=new HashMap<Employee, String>();
        hm.put(new Employee("a"), "emp1");
        hm.put(new Employee("b"), "emp2");
        hm.put(new Employee("a"), "emp1 OVERRIDDEN");

        System.out.println("HashMap's data> "+hm);
        System.out.println("HashMap's size "+hm.size());
        System.out.println(hm.get(new Employee("a")));

    }
}
/*
Buckets= As hashCode() method returns 1, only 1 bucket location will be used.
Size= As equals() method doesn’t exist, size will be 3, all three employees will be stored on same bucket location but in different Entry.
get()=we won’t be able to get object.

Buckets= As hashCode() method is not there, hashcode generated for 3 objects will be different and we will end up using 3 buckets.
Size= Though equals() method is their(but because of hashCode() method’s absence) which always returns true, we won’t be able to locate correct bucket location for calling equals() method, so, size will be 3.
get()=we won’t be able to get object.



*/
