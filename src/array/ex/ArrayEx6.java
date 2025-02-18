package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수 입력하세요:");
        int num = scanner.nextInt();

        int[] array = new int[num];

        System.out.printf("%d개의 정수를 입력하세요:\n",num);
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < num; i++) {
            if (max < array[i]) {
                max = array[i];
            } else if (min > array[i]){
                min = array[i];
            }        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}