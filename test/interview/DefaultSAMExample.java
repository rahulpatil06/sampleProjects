package test.interview;
public class DefaultSAMExample implements Foo {
    public static void main(String args[]){
        System.out.println("THis is Inside main method");
        DefaultSAMExample defaultSAMExample = new DefaultSAMExample();
        defaultSAMExample.bar();

        System.out.println( defaultSAMExample.HelloWorld());
    }

    @Override
    public void bar() {
        System.out.println("This is sliding window Bar");
    }
}
