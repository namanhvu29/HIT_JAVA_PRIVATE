import java.util.Scanner;

public class Student extends Person {
    private static final Scanner scanner = new Scanner(System.in);
    private int id;
    private String nameClass;
    private float gpa;
    private final float criteria = 2.0f;


    public Student() {
        super();
    }


    public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }


    public int getId() {
        return id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public float getCriteria() {
        return criteria;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }


    @Override
    public void input() {
        super.input();
        System.out.print("ID: ");
        id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Class Name: ");
        nameClass = scanner.nextLine();

        System.out.print("GPA: ");
        gpa = scanner.nextFloat();
        scanner.nextLine();
    }


    @Override
    public void output() {
        System.out.printf("%-5d %-20s %-5d %-10s %-6.2f", id, name, age, nameClass, gpa);
        address.output();
    }


    public Boolean checkFall() {
        return gpa >= criteria;
    }
}
