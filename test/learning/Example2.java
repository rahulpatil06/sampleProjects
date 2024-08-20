package test.learning;

import test.example.com.Employee;

import java.util.*;
import java.util.stream.Collectors;

public  class  Example2 implements Cloneable{

    Object cloneMethod() throws CloneNotSupportedException{
        return super.clone();
    }



    public static void main(String args[]) throws CloneNotSupportedException {
       String text = "Keep calm and code on";
       String[] words = text.split(" ");
        String list = Arrays.stream(text.split(" ")).sorted(Comparator.comparing(c -> c.length())).collect(Collectors.joining(" ")).toLowerCase();
        list = (char)(list.charAt(0)-32)+list.substring(1, list.length());
                System.out.println(list);
    }

}
