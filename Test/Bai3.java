import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        float x;
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thuc x (-100<=x<=100)");
        x = scanner.nextFloat();
        if (x < -100.0 || x > 100.0) {
            System.out.println("x khong thoa man");
            scanner.close();
            return;
        }
        System.out.println("Nhap so nguyen y ((-2^31)-1 <= y <= (2^31)-1 )");
        y = scanner.nextInt();
        if (y < Integer.MIN_VALUE || y > Integer.MAX_VALUE) {
            System.out.println("y khong thoa man");
            scanner.close();
            return;
        }
        System.out.println("Gia tri x mu y la:" + Math.pow(x, y));

    }
}
