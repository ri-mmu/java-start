package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 0;
        int count = 1;

        while (count <= 10){
            num = 2*count;
            System.out.println(num);
            count++;
        }
    }
}
