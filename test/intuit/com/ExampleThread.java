package test.intuit.com;

import java.util.concurrent.ThreadLocalRandom;

public class ExampleThread implements Runnable{
    private int max;
    private  Abc print;
    private boolean isEvenNumber;
    ExampleThread(Abc print, int max, boolean isEvenNumber) {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    public static void main(String args[]){
        Abc print = new Abc();
        Thread t1 = new Thread(new ExampleThread(print, 10, false),"Odd");
        Thread t2 = new Thread(new ExampleThread(print, 10, true),"Even");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        int number = isEvenNumber ?2:1;
        while(number <= max){
            if(isEvenNumber){
                print.printEven(number);
            }else{
                print.printOdd(number);
            }
            number += 2;

        }
        }
    }
