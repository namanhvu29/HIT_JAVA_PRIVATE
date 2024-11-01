import java.util.Scanner;

public class Bai1 {
    private static final String[] donvi = {
        "", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"
    };
    private static final String[] chuc = {
        "", "muoi", "hai muoi", "ba muoi", "bon muoi", "nam muoi",
        "sau muoi", "bay muoi", "tam muoi", "chin muoi"
    };
    
    public static String Change(int n) {
        if (n == 0) return "none";

        String chuso = "";

        if (n >= 100) {
            chuso += donvi[n / 100] + " tram";
            n %= 100;
            if (n != 0) chuso += " ";
        }

        if (n >= 20) {
            chuso += chuc[n / 10];
            n %= 10;
            if (n != 0) chuso += " ";
        } else if (n >= 10) {
            chuso += chuc[1];
            n %= 10;
            if (n != 0) chuso += " ";
        }

        if (n > 0) {
            chuso += donvi[n];
        }

        return chuso.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong nho hon 1000: ");
        int n = scanner.nextInt();

        if (n < 0 || n >= 1000) {
            System.out.println("Nhap lai so");
        } else {
            System.out.println("Ket qua: " + Change(n));
        }

        scanner.close();
    }
}

