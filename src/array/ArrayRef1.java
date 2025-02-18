package array;

public class ArrayRef1 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5]; //배열 생성(자동 0으로 초기화)
        //students는 배열의 참조값(메모리 주소)를 보관함.
        //new int[5] 자체는 아무 기능이 없기 때문에 생성과 동시에 보관해야함.

        //변수 값 배입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
}
