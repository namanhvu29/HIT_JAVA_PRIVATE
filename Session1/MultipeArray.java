import java.util.Scanner;

public class MultipeArray {
     // Hàm tính tích các chữ số của một số nguyên
    public static int productOfDigits(int number) {
        int product = 1;  // Biến lưu tích các chữ số

        // Nếu số là 0, tích sẽ là 0
        if (number == 0) {
            return 0;
        }

        // Vòng lặp để tách từng chữ số và nhân chúng với nhau
        while (number > 0) {
            int digit = number % 10;  // Lấy chữ số cuối cùng
            product *= digit;  // Nhân chữ số với biến product
            number /= 10;  // Bỏ chữ số cuối cùng đi
        }

        return product;  // Trả về tích các chữ số
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số từ người dùng
        System.out.print("Nhap so nguyen: ");
        int number = scanner.nextInt();

        // Gọi hàm productOfDigits và in ra kết quả
        int result = productOfDigits(number);
        System.out.println("Tich cac so la: " + result);

        scanner.close();
    }
}
