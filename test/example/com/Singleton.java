package test.example.com;

public class Singleton {
    private static Singleton instace;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instace == null){
            synchronized (Singleton.class) {
                if (instace == null) {
                    instace = new Singleton();
                }
            }
        }
        return instace;
    }
    public static void main(String args[]){
        Singleton o1 = Singleton.getInstance();
        Singleton o2 = Singleton.getInstance();
        Singleton o3 = Singleton.getInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
    }
}