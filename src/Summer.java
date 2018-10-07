import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (1 > 0) {
            System.out.print("nhập số cần tính tổng: ");
            String input = sc.nextLine();
            while (!(input.matches("^[0-9]+$"))) {
                System.out.println("số bạn nhập không hợp lệ!");
                System.out.print("nhập số cần tính tổng: ");
                input = sc.nextLine();
            }
            String[] number = input.split("");
            int sum = 0;
            for (int i = 1; i < number.length; i++) {
                sum += Integer.parseInt(number[i]);
            }
            System.out.println("Tổng các chữ số trong " + input + " bằng: " + sum);
        }
    }

}
