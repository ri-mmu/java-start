package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.printf("상품명을 입력하세요:");
                String name = scanner.nextLine();

                System.out.printf("상품의 가격을 입력하세요:");
                int price = scanner.nextInt();

                System.out.printf("구매 수량을 입력하세요:");
                int num = scanner.nextInt();
                scanner.nextLine();

                total += price * num;

                System.out.printf("상품명: %s 가격: %d 수량: %d 합계: %d\n", name, price, num, price * num);
            } else if (option == 2) {
                System.out.println("총 비용: " + total);
            } else{
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
