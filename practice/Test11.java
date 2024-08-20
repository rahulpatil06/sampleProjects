package practice;

import java.util.ArrayList;
import java.util.List;

public class Test11 {
//    Find the Composite Magic numbers between two number
//    A Composite Magic number is a positive integer which is composite as well as a magic number.
//    Composite number: A composite number is a number which has more than two factors.
//    For example:
//    Factors of 10 are: 1, 2, 5, 10
//    Magic number: A Magic number is a number in which the eventual sum of the digit is equal to 1.
//    For example: 28 = 2+8=10= 1+0=1
//    Accept two positive integers 'm' and 'n', where m is less than n. Display the number of composite magic integers that are in the range between m and n (both inclusive) and output them along with frequency, in the format specified below:
//    Sample Input:
//    m=10 n=100
//    Output: The composite magic numbers are 10,28,46,55,64,82,91,100
//    Frequency of composite magic numbers: 8
//    Sample Input:
//    m=120 n=90
//    Output: Invalid input
//    has context menu
    public static void main(String args[]){
        int m=10;
        int n=100;
        List<Integer> list = new ArrayList<>();
        for(int i=m;i<=n;i++){
            int sum=0;
            int temp =i;
            while(temp>0){
                sum = sum + temp%10;
                temp = temp/10;
            }
                int var =0;
                while(sum > 0){
                    var = var +sum%10;
                    sum =sum/10;
                }
                if(var ==1){
                    for (int j = 2; j <= i / 2; j++) {
                        if (i % j == 0) {
                            list.add(i);
                            break;
                        }

                    }

            }
        }
        System.out.println(list);
    }
}
