package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] student = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < student.length; i++) {
            student[i] = scanner.nextInt();
            sum += student[i];
        }

        double average = (double) sum / 5;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}