import java.util.Scanner;

public class Find2Max {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo mảng để lưu 5 số nguyên nhập vào
        int[] numbers = new int[5];

        // Nhập 5 số nguyên từ người dùng
        System.out.println("Nhap 5 so nguyen: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Biến lưu 2 số lớn nhất
        int max1 = Integer.MIN_VALUE;  // Số lớn nhất
        int max2 = Integer.MIN_VALUE;  // Số lớn thứ hai

        // Tìm 2 số lớn nhất
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > max1) {
                max2 = max1;  // Cập nhật max2 trước khi thay đổi max1
                max1 = numbers[i];  // max1 nhận giá trị mới lớn hơn
            } else if (numbers[i] > max2) {
                max2 = numbers[i];  // Cập nhật max2 nếu nhỏ hơn max1 nhưng lớn hơn max2
            }
        }

        // In ra kết quả
        System.out.println("Hai so lon nhat la: " + max1 + " " + max2);

        scanner.close();
    }
}
