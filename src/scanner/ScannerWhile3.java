package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.printf("숫자를 입력하세요 (0을 입력하면 종료):");
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            sum += num;
        }
        System.out.println("숫자의 합: " + sum);
    }
}
