package test.intuit.com;

public class Abc {
    private volatile boolean isOdd;
    synchronized void printEven(int number) {
        while(!isOdd){
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = false;
        notify();
    }

    synchronized void printOdd(int number) {
        while(isOdd){
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = true;
        notify();
    }

    public void send(String packet) {
        System.out.println("Sending the packets "+ packet);

    }
}
