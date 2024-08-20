package test.intuit.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    static void reverse(String str[], int start, int end)
    {
        // Temporary variable
        // to store character
        String temp;

        while (start <= end) {
            // Swapping the first
            // and last character
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
       for(int i=0;i<str.length;i++){
           System.out.print(str[i]+" ");
       }
    }
    public static void main(String[] args)
    {
        String s = "like this program very much ";

        // Function call
        //char[] p = reverseWords(s.toCharArray());
        String str[] = s.split(" ");

        reverse(str,0,(str.length)-1);
        System.out.println();
        String[] str2 ={ "pappya", "orange", "orange", "mango", "apple", "Rahulpatilr"};

        System.out.println(Arrays.stream(str2).collect(Collectors.groupingBy(k -> k, Collectors.counting())));
        System.out.println(Arrays.stream(str2).collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum)));
       String name = Arrays.stream(str2).max(Comparator.comparing(a ->a.length()) ).get();
        System.out.println(name);

        Stream.generate(Math::random)
                .limit(2)
                .forEach(System.out::println);
    }
}
