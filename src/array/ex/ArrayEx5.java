package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수 입력하세요:");
        int num = scanner.nextInt();

        int[] array = new int[num];
        int sum = 0;
        double average;

        System.out.printf("%d개의 정수를 입력하세요:\n",num);
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        average = (double) sum / num;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}