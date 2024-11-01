import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Nhap ma sinh vien");
        String code = sc.nextLine();

        System.out.println("Nhap ten sinh vien");
        String name = sc.nextLine();

        System.out.println("Nhap tuoi sinh vien");
        byte age = sc.nextByte();

        System.out.println("Nhap gioi tinh sinh vien");
        String gender = sc.nextLine();

        System.out.println("Nhap so dien thoai sinh vien");
        String phone = sc.nextLine();

        System.out.println("Nhap email sinh vien");
        String email = sc.nextLine();

        student = new Student(code, name, age, gender,phone, email);
        
        System.out.println(student.display());
    }
}
