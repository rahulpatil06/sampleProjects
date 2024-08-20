package test.example.com;

import java.util.Random;

public class PaypalTest {
     static int reverseNumber(int num){
        int temp =0;
        while(num > 0){
            temp = temp *10 +num%10;
            num = num/10;
        }
        return temp;
    }
    public static void main(String args[]) throws InterruptedException {
        int num = 123090 ;
        int temp = reverseNumber(num);
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int v1 = 12345;
//                System.out.println(reverseNumber(v1));
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int v2 = 12345;
//                System.out.println(reverseNumber(v2));
//            }
//        });
//         Thread t3 = new Thread(new Runnable() {
//             @Override
//             public void run() {
//                 int v3 =45678;
//                 System.out.println(reverseNumber(v3));
//             }
//         });
//         t1.start();
//         t2.start();
//         t3.start();
//          Thread.sleep(1000);
//         System.out.println("Hello");

      //  Singleton o1 = new Singleton(); //Not Possible because we make it as private constructors
        Singleton o2 = Singleton.getInstance();
        Singleton o3 = Singleton.getInstance();

       System.out.println(temp);
        System.out.println(o2);
        System.out.println(o3);

    }
}
