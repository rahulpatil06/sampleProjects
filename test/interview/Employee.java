package test.interview;

import java.util.HashMap;

class Employee {

    private String name;

    public Employee(String name) { // constructor
        this.name = name;
    }

    //no hashCode() method

    @Override
    public boolean equals(Object obj){
        return true;
    }

    @Override
    public String toString() {
        return "Employee[ name=" + name + "] ";
    }

}
