import java.util.Scanner;

public class BaseConverter {
    // Hằng số chứa các ký tự đại diện cho các số từ 0 đến F
    private static final char[] DIGITS = "0123456789ABCDEF".toCharArray();

    // Hàm chuyển đổi số từ hệ cơ số 10 sang hệ cơ số b
    public static String convertBase(int number, int base) {
        String result = "";  // Biến lưu kết quả dưới dạng chuỗi

        // Nếu số là 0, trả về "0"
        if (number == 0) {
            return "0";
        }

        // Sử dụng vòng lặp để chia lấy phần dư và xây dựng kết quả
        while (number > 0) {
            int remainder = number % base;  // Tìm phần dư
            result = DIGITS[remainder] + result;  // Ghép phần dư vào trước kết quả
            number = number / base;  // Cập nhật giá trị của số cho lần chia tiếp theo
        }

        return result;  // Trả về kết quả
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số và hệ cơ số từ người dùng
        System.out.print("Nhap so co so 10: ");
        int number = scanner.nextInt();

        System.out.print("Nhap he co so muon chuyen doi (2 ≤ b ≤ 16): ");
        int base = scanner.nextInt();

        // Kiểm tra nếu cơ số nằm ngoài khoảng từ 2 đến 16
        if (base < 2 || base > 16) {
            System.out.println("Nhap lai he co so.");
        } else {
            // Gọi hàm chuyển đổi và in ra kết quả
            String result = convertBase(number, base);
            System.out.println("So o he co so " + base + " la: " + result);
        }

        scanner.close();
    }
}
