import java.util.Scanner;

public class Person {
    private static final Scanner scanner = new Scanner(System.in);
    protected String name;
    protected int age;
    protected Address address;


    public Person() {
        address = new Address();
    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public void input() {
        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("Age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter address details:");
        address.input();
    }


    public void output() {
        System.out.printf("| Name: %-15s | Age: %-5d", name, age);
        address.output();
    }
}
