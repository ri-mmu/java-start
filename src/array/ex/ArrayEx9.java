package array.ex;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.printf("메뉴를 선택하세요:");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.printf("상품명을 입력하세요:");
                 productNames[productCount] = scanner.nextLine();

                System.out.printf("상품의 가격을 입력하세요:");
                productPrices[productCount] = scanner.nextInt();

                productCount++;

            } else if (option == 2) {
                for (int i = 0; i < productCount ; i++) {
                    System.out.printf("%s: %d원\n", productNames[i], productPrices[i]);
                }
            } else{
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}

