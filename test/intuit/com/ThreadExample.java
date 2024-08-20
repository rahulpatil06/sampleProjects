package test.intuit.com;

public class ThreadExample {
    int counter = 1;

    static int N;
    public static void main(String aregs[]){
     N=10;
    ThreadExample th = new ThreadExample();
    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            th.printEvenNumber();
        }
    });
Thread t2 = new Thread(new Runnable() {
    @Override
    public void run() {
        th.printOddNumber();
    }
});

    t1.start();
    t2.start();
    }

    public void printOddNumber() {
        synchronized(this){
            while(counter < N){
                if(counter %2==0){
                    try{
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd Thread "+counter +" ");
                counter ++;
                notify();
            }
        }
    }

    public void printEvenNumber() {
        synchronized(this){
            while(counter <= N){
                if(counter %2==1){
                    try{
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("Even Thread "+counter +" ");
                counter ++;
                notify();
            }
        }
    }
}
