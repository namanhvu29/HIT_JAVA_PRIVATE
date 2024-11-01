import java.util.Scanner;

import javax.security.auth.Subject;

public class Student {

    // Khoi tao thuoc tinh
    protected String studentCode;
    protected String fullName;
    protected byte age;
    protected String gender;
    protected String phoneNumber;
    protected String email;

    // Ham tao khong doi so
    public Student() {
        studentCode = "";
        fullName = "";
        age = 0;
        gender = "";
        phoneNumber = "";
        email = "";
    }

    // Ham tao co doi so
    public Student(String studentCode, String fullName, byte age, String gender, String phoneNumber, String email) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Ham set
    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Ham get
    public String getStudentCode() {
        return studentCode;
    }
    public String getFullName() {
        return fullName;
    }
    public byte getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }

    // Ham display
    public String display() {
        return String.format("ma sinh viên: %s, ho ten: %s, tuoi: %d, gioi tinh: %s, sdt: %s, email: %s",studentCode, fullName, age, gender, phoneNumber, email);
    }

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