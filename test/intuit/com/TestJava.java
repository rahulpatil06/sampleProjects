package test.intuit.com;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestJava {
    int id;
    String name;
    float price;

    public TestJava(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static void main(String args[]) {
       StringJoiner string = new StringJoiner(",","[","]");
       string.add("Rahul");
       string.add("Patil");
       System.out.println(string);
        // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
        System.out.println("The Structure before flattening is : " +
                listOfListofInts);
        List<Integer> listofInts  = listOfListofInts.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println(listofInts.stream().sorted().distinct().collect(Collectors.toList()));

       System.out.println( listOfListofInts.stream().flatMap(list -> list.stream()).distinct().mapToLong(c-> c*c).sum());

        List<Integer> Odd =  OddNumbers.stream().flatMap(n-> Stream.of(n*3)).collect(Collectors.toList());
        System.out.println("Odd Number with Mutilply by 3 "+ Odd);
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@");

        for (String a : arrOfStr)
            System.out.println(a);

        List<TestJava> list = new ArrayList<>();
        list.add(new TestJava(2,"Rahul", 204.51f));
        list.add(new TestJava(5,"Mukta", 304.51f));
        list.add(new TestJava(9,"Mukta", 504.51f));
        list.add(new TestJava(1,"Ashu", 104.51f));
        list.add(new TestJava(7,"Veer", 504.51f));
        list = list.stream().sorted(Comparator.comparing(TestJava::getName).thenComparing(TestJava::getPrice)).collect(Collectors.toList());
        list.forEach(e -> System.out.println(e.getId()+" "+e.getName()+" " + e.getPrice()));

        list.stream().filter( v -> v.name.equals("Mukta")).sorted(Comparator.comparing(TestJava::getId)).forEach(e -> System.out.println(e.getId()+" "+e.getName()+" " + e.getPrice()));
        System.out.println(list.stream().mapToDouble( i-> i.getPrice()).max());
    }
}
