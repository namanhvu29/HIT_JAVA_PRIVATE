import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassRoom list = new ClassRoom();

        while (true) {
            System.out.println("------------Menu-------------");
            System.out.println("[1]. Nhap thong tin sinh vien");
            System.out.println("[2]. In ra thong tin sinh vien");
            System.out.println("[3]. Sap xep sinh vien theo gpa");
            System.out.println("[4]. Xoa sinh vien theo ID");
            System.out.println("[5]. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            
            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    list.inputList();
                    break;
                case 2:
                    list.outputList();
                    break;
                case 3:
                    list.sortByGpa();
                    System.out.println("Danh sap sinh vien theo gpa.");
                    break;
                case 4:
                    boolean removed = list.removeById();
                    if (removed) {
                        System.out.println("Da xoa sinh vien!.");
                    } else {
                        System.out.println("Khong tim thay sinh vien.");
                    }
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Chon lai.");
                    break;
            }
        }
    }
}
