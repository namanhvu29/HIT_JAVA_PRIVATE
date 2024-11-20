import java.util.Scanner;

public class ClassRoom {
    static Scanner scanner = new Scanner(System.in);
    private static Student[] listStudent = new Student[100];
    private static int studentCount = 0;


    public void sortByGpa() {
        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = i + 1; j < studentCount; j++) {
                if (listStudent[i].getGpa() > listStudent[j].getGpa()) {
                    Student temp = listStudent[i];
                    listStudent[i] = listStudent[j];
                    listStudent[j] = temp;
                }
            }
        }
        System.out.println("danh sach sinh vien theo gpa.");
    }


    public void inputList() {
        System.out.print("Nhap so luong sinh vien muon them: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Nhap thong tinh sinh vien thu " + i + " ---");

            System.out.print("ten: ");
            String name = scanner.nextLine();

            System.out.print("tuoi: ");
            int age = scanner.nextInt();

            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ten lop: ");
            String nameClass = scanner.nextLine();

            System.out.print("GPA: ");
            float gpa = scanner.nextFloat();
            scanner.nextLine();

            System.out.println("Nhap thong tin dia chi:");
            Address address = new Address();
            address.input();

            listStudent[studentCount++] = new Student(name, age, address, id, nameClass, gpa);
        }
    }

    public void outputList() {
        System.out.printf("%-5s %-20s %-5s %-15s %-5s %-45s\n", "ID", "ten", "tuoi", "ten lop", "GPA", "dia chi");
        for (int i = 0; i < studentCount; i++) {
            listStudent[i].output();
        }
    }

    public boolean removeById() {
        System.out.print("Nhap id muon xoa: ");
        int idRemove = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < studentCount; i++) {
            if (listStudent[i].getId() == idRemove) {
 
                for (int j = i; j < studentCount - 1; j++) {
                    listStudent[j] = listStudent[j + 1];
                }
                listStudent[--studentCount] = null;
                System.out.println("da xoa sinh vien id: " + idRemove);
                return true;
            }
        }
        System.out.println("Khong tim thay sinh vien id: " + idRemove);
        return false;
    }
}
