package experements;

public class Programm {
    public static void main(String[] args) {
        Person tom = new Person("Tom", "Wolf");
        tom.display();

        Employee sam = new Employee("Sam","Black", "Microsoft");
        sam.display();
        sam.work();
    }
}
