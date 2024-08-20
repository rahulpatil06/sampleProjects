package test.interview;

@FunctionalInterface // Annotation is optional
public interface Foo {
    // Default Method - Optional can be 0 or more
    public default String HelloWorld() {
        return "Hello World";
    }
    // Single Abstract Method
    public void bar();
}