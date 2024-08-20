package practice;

public class Test4 {
    public static void main(String[] args) {

      String str = "rahul";
      String str2="";
      String temp = reverseString(str,str.length());
      System.out.println(temp);


    }

    private static String reverseString(String str,int n) {
        if(n < 1){
            return "";
        }
        if(n<=1){
            return String.valueOf(str.charAt(0));
        }


        return str.charAt(n-1) + reverseString(str,n-1);

    }
}