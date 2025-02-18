package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("첫 번째 숫자를 입력하세요:");
            int num1 = scanner.nextInt();
            System.out.printf("두 번째 숫자를 입력하세요:");
            int num2 = scanner.nextInt();
            if(num1 == 0 && num2 == 0){
                System.out.printf("프로그램을 종료합니다.");
                break;
            }
            int sum = num1 + num2;
            System.out.println("두 숫자의 합은: " + sum);
        }
    }
}
