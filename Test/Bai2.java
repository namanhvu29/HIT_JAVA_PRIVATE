import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();

        String chu = "";
        String so = "";
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {

                if (!chu.isEmpty() && Character.isDigit(input.charAt(i - 1))) {
                    chu += " ";
                }
                chu += c;
            } else if (Character.isDigit(c)) {
                
                if (!so.isEmpty() && Character.isLetter(input.charAt(i - 1))) {
                    so += " ";
                }
                so += c;
            }
        }
        
        System.out.println(chu);
        System.out.println(so);

        scanner.close();
    }
}
