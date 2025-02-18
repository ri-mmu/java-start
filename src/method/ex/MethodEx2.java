package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        string("Hello, world!", 3);
        string("Hello, world!", 5);
        string("Hello, world!", 7);
    }

    public static void string(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
