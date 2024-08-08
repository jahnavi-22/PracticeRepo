public class Hello {


    public enum Status {
        ACTIVE,
        INACTIVE,
        UNRESOLVED,
        COMPLETED
    }

    private String name;
    private int age;
    private double salary;
    private Status status;

    public Hello(String name, int age, double salary, Status status) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
    }

    public static void main(String[] args) {
        Hello hello = new Hello("John Doe", 30, 75000.0, Status.ACTIVE);
        System.out.println("Name: " + hello.name);
        System.out.println("Age: " + hello.age);
        System.out.println("Salary: " + hello.salary);
        System.out.println("Status: " + hello.status);
    }
}