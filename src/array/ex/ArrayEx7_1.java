package array.ex;

import java.util.Scanner;

public class ArrayEx7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] students = new int[4][3];
        String[] subject = {"국어", "영어", "수학"};

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d번 학생의 성적을 입력하세요:\n", i + 1);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%s 점수:", subject[j]);
                students[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += students[i][j];
            }
            double average = total / 3.0;
            System.out.printf("%d번 학생의 총점: %d, 평균: %f \n", i + 1, total, average);
        }
    }
}
