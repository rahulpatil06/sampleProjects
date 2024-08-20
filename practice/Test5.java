package practice;

import java.util.Arrays;

public class Test5 {
//    i/p today is thursday
//    o/p Today Is Thursday
    public static void main(String args[]){
        String str = "today is thursday";
        String temp[] = str.split(" ");
        Arrays.asList(str.split(" ")).stream().forEach( i -> System.out.println((Character.toUpperCase(i.charAt(0)))+ i.substring(1,i.length())));
        for(int i=0;i<temp.length;i++){
            char a[] = temp[i].toCharArray();
            //a[0] = (char) (a[0]-32);
            //temp[i] = String.valueOf(a);
            temp[i] = (char) (a[0]-32)+temp[i].substring(1,temp[i].length());
            System.out.print(temp[i]+" ");
        }
        Integer a = new Integer(10);
    }
}
