package practice;

public class Employee2 {
    private String name;
    private String location;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee2(String name, String location, double salary) {
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
//    private int Sub1;
//    private int Sub2;
//    private int Sub3;
//
//    public Employee2(int sub1, int sub2, int sub3) {
//        Sub1 = sub1;
//        Sub2 = sub2;
//        Sub3 = sub3;
//    }
//
//    public int getSub1() {
//        return Sub1;
//    }
//
//    public void setSub1(int sub1) {
//        Sub1 = sub1;
//    }
//
//    public int getSub2() {
//        return Sub2;
//    }
//
//    public void setSub2(int sub2) {
//        Sub2 = sub2;
//    }
//
//    public int getSub3() {
//        return Sub3;
//    }
//
//    public void setSub3(int sub3) {
//        Sub3 = sub3;
//    }
//
//    public int sum(Employee2 employee2) {
//        return employee2.getSub1()+employee2.Sub2+employee2.Sub3;
//    }
}
