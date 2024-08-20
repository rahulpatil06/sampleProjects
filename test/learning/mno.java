package test.learning;

public interface mno extends abc{
    default String Display(){

        return abc.super.Display();
    }
}
