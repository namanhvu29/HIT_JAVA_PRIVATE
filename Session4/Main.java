import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[100]; 
        int bookCount = 5;

        books[0] = new Book(01, "Java code", "Vu Nam Anh", 2024, "Java", 50);
        books[1] = new Book(02, "Python code", "Bui Nam Khanh", 2023, "Python", 60);
        books[2] = new Book(03, "PhP code", "Chinh Long", 2020, "PhP", 30);
        books[3] = new Book(04, "C++ code", "Vu Gia Huy", 2014, "C++", 40);
        books[4] = new Book(05, "R code", "Tran Duc Long", 2004, "R", 55);

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Them ten sach");
            System.out.println("2. Chinh sua thong tin sach moi");
            System.out.println("3. In ra danh sach cac cuon sach");
            System.out.println("4. In ra cuon sach co kinh nhat");
            System.out.println("5. In ra cuon sach phu hop voi gia tien");
            System.out.println("6. Sap xep cac cuon sach");
            System.out.println("0. Thoat");
            System.out.print("Lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    bookCount = addBook(books, bookCount, sc);
                    break;
                case 2:
                    editBook(books, bookCount, sc);
                    break;
                case 3:
                    printBooks(books, bookCount);
                    break;
                case 4:
                    findOldestBook(books, bookCount);
                    break;
                case 5:
                    findBookByPrice(books, bookCount, sc);
                    break;
                case 6:
                    sortBooks(books, bookCount, sc);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Chon lai.");
            }
        } while (choice != 0);
    }

    public static int addBook(Book[] books, int bookCount, Scanner sc) {
        if (bookCount >= books.length) {
            System.out.println("Khong them duoc.");
            return bookCount;
        }

        System.out.println("\n Them sach moi:");
       
        System.out.println("Nhap ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Clear buffer
        System.out.println("Nhap ten sach: ");
        String title = sc.nextLine();
        System.out.println("Nhap ten tac gia: ");
        String author = sc.nextLine();
        System.out.println("Nhap nam san xuat: ");
        int year = sc.nextInt();
        sc.nextLine(); // Clear buffer
        System.out.println("Tom tat noi dung: ");
        String abstrac = sc.nextLine();
        System.out.println("Nhap gia tien: ");
        double price = sc.nextDouble();
        sc.nextLine(); // Clear buffer
        

        books[bookCount++] = new Book(id, title, author, year, abstrac, price);
        System.out.println("Them sach xong.");
        return bookCount;
    }


    public static void editBook(Book[] books, int bookCount, Scanner sc) {
        System.out.print("\n Nhap ID can chinh sua: ");
        int id = sc.nextInt();
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getMaSach() == (id)) {
                System.out.print("Nhap ten sach moi: ");
                books[i].setTenSach(sc.nextLine());
                sc.nextLine();
                System.out.print("Nhap tac gia moi: ");
                books[i].setTenTacGia(sc.nextLine());
                sc.nextLine();
                System.out.print("Nhap gia moi: ");
                books[i].setGiaTien(i);
                sc.nextDouble();
                sc.nextLine();
                System.out.println("Chinh thanh cong.");
                return;
            }
        }
        System.out.println("Khong tim thay sach.");
    }

    public static void printBooks(Book[] books, int bookCount) {
        System.out.println("\nDanh sach cac cuon sach:");
        for (int i = 0; i < bookCount; i++) {
            books[i].Display();
        }
    }

    public static void findOldestBook(Book[] books, int bookCount) {
        if (bookCount == 0) {
            System.out.println("Danh sach trong .");
            return;
        }
        Book oldest = books[0];
        for (int i = 1; i < bookCount; i++) {
            if (books[i].getGiaTien() < oldest.getGiaTien()) {
                oldest = books[i];
            }
        }
        System.out.println("\n Cuon sach co kinh nhat la:");
        oldest.Display();
    }

    public static void findBookByPrice(Book[] books, int bookCount, Scanner sc) {
        System.out.print("\n Nhap gia tien toi da: ");
        double maxPrice = sc.nextDouble();
        sc.nextLine();
        boolean found = false;
        System.out.println("\n Cac cuon sach phu hop:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getGiaTien() <= maxPrice) {
                books[i].Display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co cuon sach nao phu hop.");
        }
    }

    public static void sortBooks(Book[] books, int bookCount, Scanner sc) {
        System.out.println("\n Sap xep theo:");
        System.out.println("1. Ten sach");
        System.out.println("2. Gia tien sach");
        System.out.print("Lua chon: ");
        int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {
            for (int i = 0; i < bookCount - 1; i++) {
                for (int j = i + 1; j < bookCount; j++) {
                    if (books[i].getTenSach().compareTo(books[j].getTenSach()) > 0) {
                        Book temp = books[i];
                        books[i] = books[j];
                        books[j] = temp;
                    }
                }
            }
            System.out.println("Sap xep thanh cong.");
        } else if (option == 2) {
            for (int i = 0; i < bookCount - 1; i++) {
                for (int j = i + 1; j < bookCount; j++) {
                    if (books[i].getGiaTien() > books[j].getGiaTien()) {
                        Book temp = books[i];
                        books[i] = books[j];
                        books[j] = temp;
                    }
                }
            }
            System.out.println("Sap xep thanh cong.");
        } else {
            System.out.println("Khong hop le.");
        }
    }
}

