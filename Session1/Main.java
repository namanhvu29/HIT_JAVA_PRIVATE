import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Nhap canh a:");
        int a = n.nextInt();
        System.out.println("Nhap canh b:");
        int b = n.nextInt();
        System.out.println("Nhap canh c:");
        int c = n.nextInt();
        if ( a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("Tam giac hop le!");
        }
        else {
            System.out.println("Khong phai tam giac");
        }
    }
}